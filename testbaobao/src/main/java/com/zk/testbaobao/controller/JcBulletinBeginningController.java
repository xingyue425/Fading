package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.JcBulletinBeginningModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/jcBulletinBeginning")
public class JcBulletinBeginningController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "jcBulletinBeginning";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.BULLETIN_BEGINNING;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(JcBulletinBeginningModel jcBulletinBeginningModel, Model model, HttpSession session) {
		return super.submit(jcBulletinBeginningModel, model, session);
	}
	
}
