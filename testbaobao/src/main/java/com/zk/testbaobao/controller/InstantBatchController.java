package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.InstantBatchModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/instantbatch")
public class InstantBatchController extends AgentAction{

	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(HttpSession session, InstantBatchModel instantBatch, Model model) {
		return super.submit(instantBatch, model, session);
	}

	@Override
	protected String getDispatcher(Model model) {
		return "instantBatchOpen";
	}

	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.INSTANT_OPEN_BATCH_CMD;
	}
}
