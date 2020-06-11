/**
 * <br>项目名: promotion
 * <br>文件名: BaseLoginController.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntity;
import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.BaseLogin;
import com.zk.testbaobao.model.HttpResModel;
import com.zk.testbaobao.model.ResultModel;
import com.zk.testbaobao.util.HttpUtil;
import com.zk.testbaobao.util.JsonUtil;
import com.zk.testbaobao.util.MD5;
import com.zk.testbaobao.util.SecurityUtil;
import org.apache.commons.httpclient.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.net.ConnectException;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/baseLogin")
public class BaseLoginController  extends AgentAction{
	
	private static final Logger log = LoggerFactory.getLogger(BaseLoginController.class);
	
	

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "baseLogin";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.BASE_LOGIN;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(BaseLogin baseLogin, Model model, HttpSession session) {
		
		String outJson = JsonUtil.convertObjectToJson(baseLogin);
		String secretKey = getPublicKey();
		String url = getUrl();
		
		if(HttpUtil.check(outJson,secretKey,url) != 0){
			return "报文异常";
		}
		
		ResultModel result = new ResultModel();
		
		try {
			// 加密
			byte[] encrptOutJson = SecurityUtil.doEncrypt(outJson, secretKey);
			
			String token = session!=null&&session.getAttribute("token")!=null ? (String)session.getAttribute("token") : null;
			// 创建头信息
			List<Header> header = HttpUtil.createHeader(getCmd(), MD5.asHex(encrptOutJson), token, baseLogin.getAgentNo());
			
			// 请求
			HttpResModel res = HttpUtil.post(url, header, encrptOutJson);
			result.setHead(res.getHead());
			if (res.isDes()) {
				// 当h_status状态正常时才进行消息的解密
				result.setBody(SecurityUtil.doDecrypt(res.getBody(), secretKey));
				Map<String,Object> map = JsonUtil.convertJsonToMap(result.getBody());
				session.setAttribute(ConstantEntity.SESSION_AGENT_PRIVATE_KEY + "_" + baseLogin.getAgentNo(), map.get("private_key"));
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
	
}
