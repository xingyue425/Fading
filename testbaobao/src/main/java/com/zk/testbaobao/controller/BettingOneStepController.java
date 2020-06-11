package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.BettingOneStepModel;
import com.zk.testbaobao.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/bettingOneStep")
public class BettingOneStepController extends AgentAction{
	
	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "bettingOneStep";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.BETTING_ONE_STEP;
	}

	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(HttpSession session, BettingOneStepModel betModel, Model model) {

		String pass = betModel.getAccPass();
		
		betModel.setAccPass(MD5.mD5Encode(pass));
		
		return super.submit(betModel, model, session);
	}
	

}
