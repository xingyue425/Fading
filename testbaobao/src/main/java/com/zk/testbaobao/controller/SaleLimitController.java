package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.SaleLimitReqModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/saleLimit")
public class SaleLimitController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "saleLimit";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.COMMAND_HTTP_SALE_LIMIT;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(SaleLimitReqModel saleLimitReqModel, Model model, HttpSession session) {
		return super.submit(saleLimitReqModel, model, session);
	}
	
}
