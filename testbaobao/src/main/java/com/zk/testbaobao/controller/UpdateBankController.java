/**
 * <br>项目名: promotion
 * <br>文件名: UpdateBankController.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.UpdateBankModel;
import com.zk.testbaobao.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/updateBank")
public class UpdateBankController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "updateBank";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.USER_BASEINFO_UPDATE;
	}

	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(UpdateBankModel updateBank, Model model, HttpSession session) {
		String pass = updateBank.getAccPass();
		updateBank.setAccPass(MD5.mD5Encode(pass));
		return super.submit(updateBank, model, session);
	}
	

}
