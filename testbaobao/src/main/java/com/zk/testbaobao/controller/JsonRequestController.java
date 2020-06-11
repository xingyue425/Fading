package com.zk.testbaobao.controller;


import com.zk.testbaobao.config.ResourceUtils;
import com.zk.testbaobao.constant.ConstantEntity;
import com.zk.testbaobao.model.HttpResModel;
import com.zk.testbaobao.model.JsonRequestModel;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/json")
public class JsonRequestController{
	private static final Logger log = LoggerFactory.getLogger(JsonRequestController.class);
	
	/**
	 * 
	 * <br>描 述：页面跳转处理
	 * <br>作 者：yufenghe 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "init", method = RequestMethod.GET)
	public String init(Model model) {
		return "simu/jsonRequest";
	}

	/**
	 * 
	 * <br>描 述：
	 * <br>作 者：yufenghe 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @param jsonModel
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(JsonRequestModel jsonModel, Model model, HttpSession session) {
		ResultModel result = new ResultModel();
		
		String cmdRoute = jsonModel.getCmd();
		if(HttpUtil.check(cmdRoute) != 0){
			return "异常";
		}
		
		String secretKey = null;
		String url = null;
		if(cmdRoute.startsWith("A")) {
			secretKey = getAgentSecretKey(session);
			url = getAgentUrl();
		}
		else {
			secretKey = getInceptorSecretKey(session);
			url = getInceptorUrl();
		}
		
		if(HttpUtil.check(secretKey,url) != 0){
			return "异常";
		}
		
		try {
			// 加密
			byte[] encrptOutJson = SecurityUtil.doEncrypt(jsonModel.getJsonStr(), secretKey);
			
			String token = session!=null&&session.getAttribute("token")!=null ? (String)session.getAttribute("token") : null;
			
			// 创建头信息
			List<Header> header = HttpUtil.createHeader(cmdRoute, MD5.asHex(encrptOutJson), token, jsonModel.getAgentNo());
			
			// 请求
			HttpResModel res = HttpUtil.post(url, header, encrptOutJson);
			result.setHead(res.getHead());
			if (res.isDes()) {
				// 当h_status状态正常时才进行消息的解密
				result.setBody(SecurityUtil.doDecrypt(res.getBody(), secretKey));
			}
		} catch(Exception e) {
			log.error("请求发生异常", e);
			result.setBody(e.getMessage());
		}
		
		return JsonUtil.convertObjectToJson(result);
	}
	
	private String getAgentSecretKey(HttpSession session) {
		String secretKey = ResourceUtils.getString(ConstantEntity.POINT_KEY);
		return secretKey;
	}
	
	private String getInceptorSecretKey(HttpSession session) {
		if(session != null) {
			String secretKey = (String)session.getAttribute("prokey");
			return secretKey;
		}
		
		return null;
	}
	
	private String getAgentUrl() {
		String url = ResourceUtils.getString(ConstantEntity.POST_URL);
		return url;
	}
	
	private String getInceptorUrl() {
		String url = ResourceUtils.getString(ConstantEntity.INCEPTOR_BET_POST_URL);
		return url;
	}
}
