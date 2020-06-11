package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class JcOddsSellingModel extends RequestModel{

	/** 运动类型编号 **/
	@JsonProperty("sport_no")
	private int sportNo;
	
	/** 代销者赔率版本号 **/
	@JsonProperty("version")
	private String version;
	
	/** 赔率类型值 **/
	@JsonProperty("odds_type")
	private String oddsType;
	
	/** 玩法编号 **/
	@JsonProperty("game_code")
	private String gameCode;

	public int getSportNo() {
		return sportNo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOddsType() {
		return oddsType;
	}

	public void setOddsType(String oddsType) {
		this.oddsType = oddsType;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public void setSportNo(int sportNo) {
		this.sportNo = sportNo;
	}

	
}
