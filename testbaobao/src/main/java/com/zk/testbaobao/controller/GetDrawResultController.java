package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.GetDrawResultModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/***
 * <br>类 名: QueryDrawResultController 
 * <br>描 述: 开奖公告信息查询
 * <br>作 者: zhaowei 
 * <br>创 建： 2016-5-18 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/getDrawResult")
public class GetDrawResultController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "getDrawResult";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.GET_DRAW_RESULT;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(GetDrawResultModel getDrawRes, Model model, HttpSession session) {
		return super.submit(getDrawRes, model, session);
	}
	
}
