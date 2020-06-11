/**
 * <br>项目名: promotion
 * <br>文件名: LeagueDetailModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: LeagueDetailModel 
 * <br>描 述: 竞彩赛果查询
 * <br>作 者: fanweilong
 * <br>创 建： 2016年8月26日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class LeagueDetailModel extends  RequestModel {
	/**
	 * 开赛时间（格式： yyyy-mm-dd）
	 */
	@JsonProperty("match_date")
	private String matchDate;
	
	/**
	 * 玩法唯一标示
	 */
	@JsonProperty("logic_code")
	private String logicCode;
	
	/** 
	 * 赛事ID
	 */
	@JsonProperty("match_id")
	private String matchId;

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getLogicCode() {
		return logicCode;
	}

	public void setLogicCode(String logicCode) {
		this.logicCode = logicCode;
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	
	
}
