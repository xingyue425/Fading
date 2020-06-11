package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.GetPinModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/getPin")
public class GetPinController  extends AgentAction{

		/* (non-Javadoc)
		 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
		 */
		@Override
		protected String getDispatcher(Model model) {
			return "getPin";
		}

		/* (non-Javadoc)
		 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
		 */
		@Override
		protected String getCmd() {
			return ConstantEntityForCmd.GET_PIN;
		}
		
		@RequestMapping(value = "submit")
		@ResponseBody
		public String submit(GetPinModel getPinModel, Model model, HttpSession session) {
			return super.submit(getPinModel, model, session);
		}
}
