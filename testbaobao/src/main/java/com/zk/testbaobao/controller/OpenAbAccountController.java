package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.OpenAbAccountModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 
 * <br>类 名: OpenAbAccountController 
 * <br>描 述: 验证总账户 
 * <br>作 者: fanweilong 
 * <br>创 建： 2017年4月11日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/openAbAccount")
public class OpenAbAccountController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "openAbAccount";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.OPEN_AB_ACCOUNT;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(OpenAbAccountModel oaam, Model model, HttpSession session) {
		return super.submit(oaam, model, session);
	}
	
}
