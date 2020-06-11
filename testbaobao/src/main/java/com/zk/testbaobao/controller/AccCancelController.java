package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.AccCancelModel;
import com.zk.testbaobao.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 
 * <br>类 名: AccCancelController 
 * <br>描 述: 注销投注账户
 * <br>作 者: fanweilong 
 * <br>创 建： 2016年8月4日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
