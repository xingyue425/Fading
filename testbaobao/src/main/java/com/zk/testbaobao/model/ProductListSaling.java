package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class ProductListSaling extends RequestModel{
	
	@JsonIgnore
	private String gameCode;
	
	/***
	 * 玩法唯一标识列表
	 */
	@JsonProperty("game_codes")
	private List<String> gameCodes = new ArrayList<String>();

	public List<String> getGameCodes() {
		return gameCodes;
	}

	public void setGameCodes(List<String> gameCodes) {
		this.gameCodes = gameCodes;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}
	
}
