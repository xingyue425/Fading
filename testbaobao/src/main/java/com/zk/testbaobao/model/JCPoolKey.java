package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class JCPoolKey {

	/** 赛事ID **/
	@JsonProperty("match_id")
	private long matchId;
	
	/** 玩法编号 **/
	@JsonProperty("game_code")
	private String gameCode;
	
	/** 奖池ID **/
	@JsonProperty("pool_id")
	private long poolId;

	public long getMatchId() {
		return matchId;
	}

	public void setMatchId(long matchId) {
		this.matchId = matchId;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public long getPoolId() {
		return poolId;
	}

	public void setPoolId(long poolId) {
		this.poolId = poolId;
	}
}
