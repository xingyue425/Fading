/**
 * <br>项目名: promotion
 * <br>文件名: CheckBetPass.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.CheckBetPassModel;
import com.zk.testbaobao.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/** 
 * <br>类 名: CheckBetPass 
 * <br>描 述: 验证投注密码 
 * <br>作 者: zhaowei 
 * <br>创 建： 2016年8月24日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/checkBetPass")
public class CheckBetPass extends AgentAction{
	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "checkBetPass";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.CHECT_BET_PASS;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(CheckBetPassModel checkBetPassModel, Model model, HttpSession session) {
		String pass = checkBetPassModel.getPass();
		checkBetPassModel.setPass(MD5.mD5Encode(pass));
		return super.submit(checkBetPassModel, model, session);
	}
}
