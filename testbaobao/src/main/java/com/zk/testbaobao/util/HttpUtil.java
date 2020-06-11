package com.zk.testbaobao.util;

import com.zk.testbaobao.constant.ConstantEntity;
import com.zk.testbaobao.model.HttpResModel;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.ByteArrayRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class HttpUtil {
	
	
	/**
	 * 请求方法
	 * 
	 * @param url
	 *            访问url
	 * @param header
	 *            参数数组
	 * @return json格式的字符串
	 * @throws Exception
	 * @throws  
	 */
	public static HttpResModel post(String url, List<Header> header, byte[] json) throws Exception {
//		String result = null;
		HttpClient client = new HttpClient();
		client.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,
				"UTF-8");// 指定传送字符集为UTF-8格式
		
		client.getHttpConnectionManager().getParams()
				.setConnectionTimeout(10000);// 设置连接超时时间为10秒（连接初始化时间）
		PostMethod method = new PostMethod(url);
		
		if(header != null){
			for (Header h : header) {
				method.setRequestHeader(h);
			}
		}
		
		ByteArrayRequestEntity requestEntity = new ByteArrayRequestEntity(json, "application/json");
//		RequestEntity requestEntity = new StringRequestEntity(json, "application/json","UTF-8");
		
		method.setRequestEntity(requestEntity);
		
		
		int statusCode = client.executeMethod(method);
		if (statusCode != HttpStatus.SC_OK) {
			client.getHttpConnectionManager().closeIdleConnections(0);
			throw new IOException("网络连接异常！");
		}
		
		HttpResModel res = new HttpResModel();
		
		
		StringBuffer sb = new StringBuffer();
		Header[] resHead = method.getResponseHeaders();
		
		for (Header h : resHead) {
			// 判断h_status是否ok，如果异常（当值不为0时），设置是否解密消息体标示
			if ("h_status".equals(h.getName()) && !"0".equals(h.getValue())) {
				res.setDes(false);
				continue;
			}

			if(h.getName().equals("Server") || h.getName().equals("Transfer-Encoding")){
				continue;
			}
			
			if(h.getName().equals("h_msg") || h.getName().equals("h_err")){
				sb.append(h.getName() + ":" + URLDecoder.decode(h.getValue(), "UTF-8") + ",");
				continue;
			}
			
			if(h.getName().equals("token")){
				res.setToken(h.getValue());
			}
			sb.append(h.getName() + ":" + h.getValue() + ",");
		}
		if(sb.length() > 0){
			sb.substring(0,sb.length()-1);
			res.setHead(sb.toString());
		}
		
		InputStream inputStream = method.getResponseBodyAsStream();
//        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));   
//        StringBuffer stringBuffer = new StringBuffer();   
//        String str= "";   
//        while((str = br.readLine()) != null){   
//            stringBuffer .append(str );   
//        }
		res.setBody(readBodyAsByte(inputStream));
	    inputStream.close();
//		result = stringBuffer.toString();
		client.getHttpConnectionManager().closeIdleConnections(0);
		return res;
	}
	
	
	public static byte[] readBodyAsByte(InputStream in) throws IOException {
		byte[] byteInJson = {};
		//buff包装 设置缓冲区大小512
		BufferedInputStream bis = new BufferedInputStream(in,512);
		
		//buff包装 设置缓冲区大小512 buff包装 设置缓冲区大小512
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(outputStream, 512);

		byte buffer[] = new byte[512];
		int nLength = -1;
		
		while ((nLength = bis.read(buffer)) != -1) {
			bos.write(buffer, 0, nLength);
		}
		
		bos.flush();
		byteInJson = outputStream.toByteArray();
		bis.close();
		bos.close();
		return byteInJson;
	}
	
	public static List<Header> createHeader(String cmd, String json, String token, String agentNo) throws UnsupportedEncodingException {
		if(StringUtils.isNotBlank(token)) {
			return createInceptorHeader(cmd, json, token, agentNo);
		}
		else {
			return createAgentHeader(cmd, json, agentNo);
		}
	}
	
	public static List<Header> createAgentHeader(String cmd, String json, String agentNo) throws UnsupportedEncodingException {
		List<Header> list = new ArrayList<Header>();
		list.add(new Header(ConstantEntity.HTTP_HEADER_CMD,cmd));
		list.add(new Header(ConstantEntity.HTTP_HEADER_DEV,"aaaaa"));
		list.add(new Header(ConstantEntity.HTTP_HEADER_PROTOCOL_VER,"1"));
		list.add(new Header(ConstantEntity.HTTP_HEADER_CLIENT_VER,"00120004"));
		list.add(new Header(ConstantEntity.HTTP_HEADER_AGENT_NO, StringUtils.defaultIfBlank(agentNo, "3711")));
		list.add(new Header(ConstantEntity.HTTP_HEADER_MSG_ID, UUID.randomUUID().toString().replaceAll("-", "")));
		list.add(new Header(ConstantEntity.HTTP_HEADER_TIME_STAMP, System.currentTimeMillis() + ""));
		list.add(new Header(ConstantEntity.HTTP_HEADER_MD,md(json))); 
		return list;
	}
	
	public static List<Header> createHeader(String cmd, String json, String agentNo) throws UnsupportedEncodingException {
		List<Header> list = new ArrayList<Header>();
		list.add(new Header(ConstantEntity.HTTP_HEADER_CMD,cmd));
		list.add(new Header(ConstantEntity.HTTP_HEADER_DEV,"aaaaa"));
		list.add(new Header(ConstantEntity.HTTP_HEADER_PROTOCOL_VER,"1"));
		list.add(new Header(ConstantEntity.HTTP_HEADER_CLIENT_VER,"00120004"));
		list.add(new Header(ConstantEntity.HTTP_HEADER_AGENT_NO, StringUtils.defaultIfBlank(agentNo, "3711")));
		list.add(new Header(ConstantEntity.HTTP_HEADER_MSG_ID, UUID.randomUUID().toString().replaceAll("-", "")));
		list.add(new Header(ConstantEntity.HTTP_HEADER_TIME_STAMP, System.currentTimeMillis() + ""));
		list.add(new Header(ConstantEntity.HTTP_HEADER_MD,md(json))); 
		return list;
	}
	
	
	public static List<Header> createInceptorHeader(String cmd, String json, String token, String agentNo) throws UnsupportedEncodingException {
		List<Header> list = new ArrayList<Header>();
		list.add(new Header(ConstantEntity.HTTP_HEADER_CMD,cmd));
		list.add(new Header(ConstantEntity.HTTP_HEADER_DEV,"01:d7c1625e249e4c3c886465a36bfe5b9d-test"));
		list.add(new Header(ConstantEntity.HTTP_HEADER_PROTOCOL_VER,"1"));
		list.add(new Header("agent_no", StringUtils.defaultIfBlank(agentNo, "3711")));
		
		list.add(new Header("module_no",ModuleUtil.getModuleNoByCmd(cmd)));
		list.add(new Header("reserve","0"));
		list.add(new Header("info","null"));
		list.add(new Header("net_type","null"));
		list.add(new Header("client_md","326635a034f8f09c23899fccf545301e827659b8898ff7ba2cf0611150d32db3"));
		
		list.add(new Header(ConstantEntity.HTTP_HEADER_CLIENT_VER,"01021500"));
		list.add(new Header(ConstantEntity.HTTP_HEADER_AGENT_NO,StringUtils.defaultIfBlank(agentNo, "3711")));
		list.add(new Header(ConstantEntity.HTTP_HEADER_MSG_ID, UUID.randomUUID().toString()));
		list.add(new Header(ConstantEntity.HTTP_HEADER_TIME_STAMP,"1447236724358"));
		list.add(new Header(ConstantEntity.HTTP_HEADER_MD,md(json)));
		
		list.add(new Header("token",token));
		
		return list;
	}
	
	
	
	public static String md(String json) throws UnsupportedEncodingException {
		return URLEncoder.encode(MD5.mD5Encode(json), "UTF-8");
	}
	
	public static int check(String...str){
		for (String tmp : str) {
			if(StringUtils.isEmpty(tmp)){
				return -1;
			}
		}
		return 0;
	}
	
}
