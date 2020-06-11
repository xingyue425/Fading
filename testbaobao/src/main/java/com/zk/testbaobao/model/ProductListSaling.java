package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <br>类 名: ProductSaling 
 * <br>描 述: 在售数字彩奖期查询
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年5月9日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
