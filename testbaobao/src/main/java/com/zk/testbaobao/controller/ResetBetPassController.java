package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.ResetBetPassModel;
import com.zk.testbaobao.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/resetBetPass")
public class ResetBetPassController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "resetBetPass";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.GET_RESET_BETPASS;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(ResetBetPassModel resetBetPassModel, Model model, HttpSession session) {
		String pass = resetBetPassModel.getNewPass();
		resetBetPassModel.setNewPass(MD5.mD5Encode(pass));
		return super.submit(resetBetPassModel, model, session);
	}
	
}
