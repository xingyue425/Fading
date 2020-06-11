package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * <br>类 名: GetDrawResultModel
 * <br>描 述: 开奖公告信息查询
 * <br>作 者: helongtao
 * <br>创 建： 2017-2-24
 * <br>版 本：v1.7.2
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
