package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.AccCancelModel;
import com.zk.testbaobao.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/accCancel")
public class AccCancelController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "accCancel";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.ACCOUNT_CANCEL_CMD;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(AccCancelModel accCancel, Model model, HttpSession session) {
		String pass = accCancel.getAccPass();
		accCancel.setAccPass(MD5.mD5Encode(pass));
		return super.submit(accCancel, model, session);
	}
	
}
