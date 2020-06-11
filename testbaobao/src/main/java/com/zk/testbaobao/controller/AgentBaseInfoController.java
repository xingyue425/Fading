package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.AgentBaseInfoModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 
 * <br>类 名: AgentBaseInfoController 
 * <br>描 述: 代销者获取基础数据
 * <br>作 者: fanweilong 
 * <br>创 建： 2016年8月4日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/agentBaseInfo")
public class AgentBaseInfoController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "agentBaseInfo";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.AGENT_BASE_INFO;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(AgentBaseInfoModel agentBaseInfo, Model model, HttpSession session) {
		return super.submit(agentBaseInfo, model, session);
	}
	
}
