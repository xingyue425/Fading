package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.GetDrawResultModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@RequestMapping(value = "/getDrawResult")
public class GetDrawResultController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "getDrawResult";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.GET_DRAW_RESULT;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(GetDrawResultModel getDrawRes, Model model, HttpSession session) {
		return super.submit(getDrawRes, model, session);
	}
	
}
