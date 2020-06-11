package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.AccCancelStatusModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 
 * <br>类 名: AccCancelStatusController 
 * <br>描 述: 注销投注账户
 * <br>作 者: fanweilong 
 * <br>创 建： 2016年8月22日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/accCancelStatus")
public class AccCancelStatusController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "accCancelStatus";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.ACCOUNT_CANCEL_STATUS;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(AccCancelStatusModel accCancelStatus, Model model, HttpSession session) {
		return super.submit(accCancelStatus, model, session);
	}
	
}
