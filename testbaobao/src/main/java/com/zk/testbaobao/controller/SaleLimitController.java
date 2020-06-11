package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.SaleLimitReqModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 
 * <br>类 名: SaleLimitController
 * <br>描 述: 查询玩法销售限制时段
 * <br>作 者: helongtao
 * <br>创 建： 2017年01月16日
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/saleLimit")
public class SaleLimitController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "saleLimit";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.COMMAND_HTTP_SALE_LIMIT;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(SaleLimitReqModel saleLimitReqModel, Model model, HttpSession session) {
		return super.submit(saleLimitReqModel, model, session);
	}
	
}
