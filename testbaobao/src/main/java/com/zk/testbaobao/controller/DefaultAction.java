/**
 * <br>项目名: promotion
 * <br>文件名: DefaultAction.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;


import com.zk.testbaobao.model.HttpResModel;
import com.zk.testbaobao.model.RequestModel;
import com.zk.testbaobao.model.ResultModel;
import com.zk.testbaobao.util.HttpUtil;
import com.zk.testbaobao.util.JsonUtil;
import com.zk.testbaobao.util.MD5;
import com.zk.testbaobao.util.SecurityUtil;
import org.apache.commons.httpclient.Header;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.net.ConnectException;
import java.util.List;


public abstract class DefaultAction {
	private static final Logger log = LoggerFactory.getLogger(DefaultAction.class);
	
	/**
	 * 
	 * <br>描 述：
	 * <br>作 者：yufenghe 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @param bizModel
	 * @param model
	 * @param session
	 * @return
	 */
	public String submit(RequestModel bizModel, Model model, HttpSession session) {
		ResultModel result = new ResultModel();
		
		String outJson = JsonUtil.convertObjectToJson(bizModel);
		String secretKey = getSecretKey(bizModel.getAgentNo(),session);
		String url = getUrl();
		if (StringUtils.isBlank(bizModel.getAgentNo())) {
			bizModel.setAgentNo((String)session.getAttribute("agentNo"));
		}
		
		if(HttpUtil.check(outJson,secretKey,url) != 0){
			return "异常";
		}
		
		try {
			// 加密
			byte[] encrptOutJson = SecurityUtil.doEncrypt(outJson, secretKey);
			
			String token = session!=null&&session.getAttribute("token")!=null ? (String)session.getAttribute("token") : null;
			
			// 创建头信息
			List<Header> header = HttpUtil.createHeader(getCmd(), MD5.asHex(encrptOutJson), token, bizModel.getAgentNo());
			
			// 请求
			HttpResModel res = HttpUtil.post(url, header, encrptOutJson);
			result.setHead(res.getHead());
			if (res.isDes()) {
				// 当h_status状态正常时才进行消息的解密
				result.setBody(SecurityUtil.doDecrypt(res.getBody(), secretKey));
			}
		} catch(ConnectException e) {
			log.error("连接异常", e);
			return "无法连接Inceptor或Agent(" + e.getMessage() + ")";
		} catch(Exception e) {
			log.error("请求发生异常", e);
			return e.getMessage();
		}
		
		return JsonUtil.convertObjectToJson(result);
	}
	
	
	/**
	 * 
	 * <br>描 述：获得加密秘钥
	 * <br>作 者：yufenghe 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @return
	 */
	protected abstract String getSecretKey(String agentNo, HttpSession session);
	
	/**
	 * 
	 * <br>描 述：获得请求url
	 * <br>作 者：yufenghe 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @return
	 */
	protected abstract String getUrl();
	
	/**
	 * 
	 * <br>描 述：获得协议命令字
	 * <br>作 者：yufenghe 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @return
	 */
	protected abstract String getCmd();
}
