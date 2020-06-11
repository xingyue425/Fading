package com.zk.testbaobao.controller;


import com.zk.testbaobao.config.ResourceUtils;
import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.RechargeModel;
import com.zk.testbaobao.model.ResultModel;
import com.zk.testbaobao.util.HttpClientTool;
import com.zk.testbaobao.util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/recharge")
public class RechargeController extends AgentAction {

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "recharge";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.RECHARGE_CMD;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(RechargeModel bizModel, Model model, HttpSession session) {
		//return super.submit(bizModel, model, session);
	    
	    // http://10.4.3.104:8082/bank-sim/refillResponse.uz?accountNo=123456&amount=100&channel=0013
	    String url = ResourceUtils.getString("banksim.url");
	    String agentno = (String)session.getAttribute("agentNo");
	    String params = "/refillResponse.uz?accountNo=" + bizModel.getBetingNo()
	            + "&amount=" + bizModel.getMoney()
	            + "&channel=" + bizModel.getPaytype()
	            + "&agentNo=" + agentno;
	    
        String result = HttpClientTool.sendGetRequest(url + params);
	    ResultModel resultModel = new ResultModel();
	    
	    //String tmp = "{\"status\":0,\"resultCode\":\"0\",\"msg\":\"中行充值订单入库成功\"}";
	    resultModel.setHead(result);
	    return JsonUtil.convertObjectToJson(resultModel);
	}
	
}
