package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.QueryBetResult;
import com.zk.testbaobao.model.QueryBetResultDetailModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/queryBetResult")
public class QueryBetResultController extends AgentAction {

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "queryResultDetail";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.QUERY_BET_RESULT_DETAIL_CMD;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(QueryBetResultDetailModel bizModel, Model model, HttpSession session) {
		String betSn = bizModel.getBetSn();
		String[] sns = betSn.split(",");
		for(String sn : sns) {
			QueryBetResult result = new QueryBetResult();
			result.setBetSn(sn);
			bizModel.getQueryBetResultData().add(result);
		}
		return super.submit(bizModel, model, session);
	}
	
}
