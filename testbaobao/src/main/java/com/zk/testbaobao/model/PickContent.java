/**
 * <br>项目名: promotion
 * <br>文件名: PickContent.java
 * <br>Copyright 2015 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PickContent {
	@JsonProperty("match_id")
	private String matchId;
	
	@JsonProperty("pool_logic_code")
	private String poolLogicCode;
	
	@JsonProperty("content")
	private String content;

	public String getMatchId() {
		return matchId;
	}

	public String getPoolLogicCode() {
		return poolLogicCode;
	}

	public String getContent() {
		return content;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public void setPoolLogicCode(String poolLogicCode) {
		this.poolLogicCode = poolLogicCode;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
