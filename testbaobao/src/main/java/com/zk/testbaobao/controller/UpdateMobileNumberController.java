/**
 * <br>项目名: promotion
 * <br>文件名: UpdateMobileNumberController.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.UpdateMobileNumberModel;
import com.zk.testbaobao.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * <br>类 名: UpdateMobileNumberController 
 * <br>描 述: 修改手机号
 * <br>作 者: fanweilong 
 * <br>创 建： 2017年2月21日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/updateMobileNumber")
public class UpdateMobileNumberController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "updateMobileNumber";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.UPDATE_MOBILE_NUMBER;
	}

	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(UpdateMobileNumberModel updateMobileNumber, Model model, HttpSession session) {
		String pass = updateMobileNumber.getPassword();
		updateMobileNumber.setPassword(MD5.mD5Encode(pass));
		return super.submit(updateMobileNumber, model, session);
	}
	

}
