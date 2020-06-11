package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.JcMatchResultModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 
 * <br>类 名: JcMatchResultController 
 * <br>描 述: 查询竞彩指定赛事及赛果
 * <br>作 者: fanweilong
 * <br>创 建： 2016年12月28日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping(value = "/jcMatchResult")
public class JcMatchResultController extends AgentAction{

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "jcMatchResult";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.MATCH_RSULT;
	}
	
	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(JcMatchResultModel jcMatchResultModel, Model model, HttpSession session) {
		String jcMatchId = jcMatchResultModel.getJcMatchId();
		if(StringUtils.isNotBlank(jcMatchId)) {
			String[] matchIds = jcMatchId.split(",");
			for(String matchId : matchIds) {
				Long id = Long.parseLong(matchId);
				jcMatchResultModel.getJcMatchIds().add(id);
			}
		}
		return super.submit(jcMatchResultModel, model, session);
	}
	
}
