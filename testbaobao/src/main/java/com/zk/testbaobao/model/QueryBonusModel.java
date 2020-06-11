package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties("agentNo")
public class QueryBonusModel {
	// 投注账号
	@JsonProperty("agent_bonus_id")
	private String bonusId;
	@JsonIgnore
	private String agentNo;
	public String getAgentNo() {
		return agentNo;
	}
	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}
	public String getBonusId() {
		return bonusId;
	}
	public void setBonusId(String bonusId) {
		this.bonusId = bonusId;
	}
	

}
