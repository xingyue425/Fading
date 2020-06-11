/**
 * <br>项目名: promotion
 * <br>文件名: BaseLogoutController.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.BaseLogout;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/** 
 * <br>类 名: BaseLogoutController 
 * <br>描 述: 描述类完成的主要功能 
 * <br>作 者: zhaowei 
 * <br>创 建： 2016年7月19日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/baseLogout")
public class BaseLogoutController  extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "baseLogout";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.BASE_LOGOUT;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(BaseLogout baseLogout, Model model, HttpSession session) {
		return super.submit(baseLogout, model, session);
	}
	
}
