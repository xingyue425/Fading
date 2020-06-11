package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class GetDrawResultModel extends RequestModel{
	
	/**玩法唯一编号**/
 	@JsonProperty("game_code")
	private String gameCode;

	/**奖期号**/
	@JsonProperty("period")
	private String period;

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
}
