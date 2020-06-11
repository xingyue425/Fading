package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.ProductListSaling;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/productListSaling")
public class ProductListSalingController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "productListSaling";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.DIGITAL_AWARD_PERIOD_SALING;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(ProductListSaling productSaling, Model model, HttpSession session) {
		String gameCodes = productSaling.getGameCode();
		if(StringUtils.isNotBlank(gameCodes)) {
			String[] codes = gameCodes.split(",");
			for(String code : codes) {
				productSaling.getGameCodes().add(code);
			}
		}
		return super.submit(productSaling, model, session);
	}
	
}
