/**
 * <br>项目名: promotion
 * <br>文件名: OrderDetailQueryController.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.OrderDetailModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/orderDetail")
public class OrderDetailQueryController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "orderDetail";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.ORDER_DETAIL;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(OrderDetailModel orderDetailModel, Model model, HttpSession session) {
		return super.submit(orderDetailModel, model, session);
	}

}
