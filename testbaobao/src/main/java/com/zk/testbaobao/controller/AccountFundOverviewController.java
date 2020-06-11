package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.AccountFundOverview;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 
 * <br>类 名: AccountFundOverviewController 
 * <br>描 述: 账户资金信息总览 
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年5月9日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/accountOverview")
public class AccountFundOverviewController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "accountFundOverview";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.ACCOUNT_FUND_OVERVIEW;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(AccountFundOverview accountOverview, Model model, HttpSession session) {
		return super.submit(accountOverview, model, session);
	}
	
}
