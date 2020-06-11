/**
 * <br>项目名: promotion
 * <br>文件名: BaseLoginController.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.BaseAgent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/** 
 * <br>类 名: BaseAgentController 
 * <br>描 述: 获取代销者信息
 * <br>作 者: fanweilong
 * <br>创 建： 2017年1月17日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/baseAgent")
public class BaseAgentController  extends AgentAction{
	

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "baseAgent";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.BASE_AGENT;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(BaseAgent baseAgent, Model model, HttpSession session) {
		
		return super.submit(baseAgent, model, session);
	}
	
}
