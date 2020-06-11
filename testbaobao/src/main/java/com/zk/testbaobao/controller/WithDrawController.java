/**
 * <br>项目名: promotion
 * <br>文件名: WithDrawController.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;

import com.zk.testbaobao.config.ResourceUtils;
import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.ResultModel;
import com.zk.testbaobao.model.WithDrawModel;
import com.zk.testbaobao.util.HttpClientTool;
import com.zk.testbaobao.util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/withDraw")
public class WithDrawController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "withDraw";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.WITH_DRAW;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(WithDrawModel withDrawModel, Model model, HttpSession session) {
//		String pass = withDrawModel.getAccPass();
//		withDrawModel.setAccPass(MD5.mD5Encode(pass));
//		return super.submit(withDrawModel, model, session);
		
		
	    //http://ip:port/bank-sim/encashResponse.uz?accountNo=123456&amount=100&channel=0013
	    
		String url = ResourceUtils.getString("banksim.url");
        String params = "/encashResponse.uz?accountNo=" + withDrawModel.getBetingNo()
                + "&amount=" + withDrawModel.getEncashAmount()
                + "&channel=" + withDrawModel.getChannel();
        
        String result = HttpClientTool.sendGetRequest(url + params);
        ResultModel resultModel = new ResultModel();
        
        //String tmp = "{\"status\":0,\"resultCode\":\"0\",\"msg\":\"支付宝提现订单入库成功\"}";
        resultModel.setHead(result);
        return JsonUtil.convertObjectToJson(resultModel);
	}

}
