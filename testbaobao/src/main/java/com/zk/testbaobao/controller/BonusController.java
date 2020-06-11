package com.zk.testbaobao.controller;


import com.zk.testbaobao.config.ResourceUtils;
import com.zk.testbaobao.constant.ConstantEntity;
import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.BonusModel;
import com.zk.testbaobao.model.HttpResModel;
import com.zk.testbaobao.model.QueryBonusModel;
import com.zk.testbaobao.model.ResultModel;
import com.zk.testbaobao.util.HttpUtil;
import com.zk.testbaobao.util.JsonUtil;
import com.zk.testbaobao.util.MD5;
import com.zk.testbaobao.util.SecurityUtil;
import org.apache.commons.httpclient.Header;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

/**
 * 
 * <br>类 名: BonusController 
 * <br>描 述: 用户红包充值 
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年5月10日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/bonus")
public class BonusController {

	private static final String cmd = ConstantEntityForCmd.BONUS_CMD;

	private static final Logger log = LoggerFactory
			.getLogger(BonusController.class);

	@RequestMapping(value = "init", method = RequestMethod.GET)
	public String bonusInit(Model model) {
		model.addAttribute("bonusId",getUUID());
		return "agent/bonus";
	}

	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(BonusModel bonus, Model model, HttpSession session) {
		
		ResultModel result = new ResultModel();

		String outJson = JsonUtil.convertObjectToJson(bonus);
		
		String secretKey = ResourceUtils.getString(ConstantEntity.POINT_KEY);

		String url = ResourceUtils.getString(ConstantEntity.POST_URL);
		if (StringUtils.isBlank(bonus.getAgentNo())) {
			bonus.setAgentNo((String)session.getAttribute("agentNo"));
		}
		
		if(HttpUtil.check(outJson,secretKey,url) != 0){
			return "异常";
		}
		
		try {
			// 加密
			byte[] encrptOutJson = SecurityUtil.doEncrypt(outJson, secretKey);
			// 创建头信息
			List<Header> header = HttpUtil.createHeader(cmd, MD5.asHex(encrptOutJson), bonus.getAgentNo());
			// 请求
			HttpResModel res = HttpUtil.post(url, header, encrptOutJson);
			result.setHead(res.getHead());
			if (res.isDes()) {
				// 当h_status状态正常时才进行消息的解密
				result.setBody(SecurityUtil.doDecrypt(res.getBody(), secretKey));
			}
			
			result.setBonusid(getUUID());
			
		} catch (Exception e) {
			log.error("", e);
			result.setBody(e.getMessage());
		}
		return JsonUtil.convertObjectToJson(result);
	}
	
	
	@RequestMapping(value = "queryinit")
	public String queryinit(Model model) {
		return "simu/query_bonus";
	}
	
	@RequestMapping(value = "querysubmit")
	@ResponseBody
	public String querysubmit(QueryBonusModel querybonus, Model model, HttpSession session) {
		
		ResultModel result = new ResultModel();

		String outJson = JsonUtil.convertObjectToJson(querybonus);
		
		String secretKey = ResourceUtils.getString(ConstantEntity.POINT_KEY);

		String url = ResourceUtils.getString(ConstantEntity.POST_URL);
		if (StringUtils.isBlank(querybonus.getAgentNo())) {
			querybonus.setAgentNo((String)session.getAttribute("agentNo"));
		}
		if(HttpUtil.check(outJson,secretKey,url) != 0){
			return "异常";
		}
		
		try {
			// 加密
			byte[] encrptOutJson = SecurityUtil.doEncrypt(outJson, secretKey);
			// 创建头信息
			List<Header> header = HttpUtil.createHeader(cmd, MD5.asHex(encrptOutJson), querybonus.getAgentNo());
			// 请求
			HttpResModel res = HttpUtil.post(url, header, encrptOutJson);
			result.setHead(res.getHead());
			if (res.isDes()) {
				// 当h_status状态正常时才进行消息的解密
				result.setBody(SecurityUtil.doDecrypt(res.getBody(), secretKey));
			}
			
			result.setBonusid(UUID.randomUUID().toString());
			
		} catch (Exception e) {
			log.error("", e);
			result.setBody(e.getMessage());
		}
		return JsonUtil.convertObjectToJson(result);
	}
	
	private String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0,16);
	}
	

}
