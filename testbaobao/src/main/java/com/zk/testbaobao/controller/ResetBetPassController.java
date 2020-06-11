package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.ResetBetPassModel;
import com.zk.testbaobao.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/***
 * <br>类 名: GetResetpassPinController 
 * <br>描 述: 修改投注密码
 * <br>作 者: zhaowei 
 * <br>创 建： 2016年8月19日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
