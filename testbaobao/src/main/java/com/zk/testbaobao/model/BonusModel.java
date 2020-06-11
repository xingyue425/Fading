package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"agentNo"})
public class BonusModel {
	// 活动编号
	@JsonProperty("activity_id")
	private String activityId;
	// 流水号
	@JsonProperty("agent_bonus_id")
	private String bonusId;
	
	/**
	 * 省中心红包流水号
	 */
	@JsonProperty("bonus_id")
	private String bonusPayId;
	
	// 投注账号
	@JsonProperty("betting_no")
	private String bettingNo;
	
	// 红包金额
	@JsonProperty("amount")
	private long amount;
	// 回调地址
	@JsonProperty("url")
	private String url;
	@JsonProperty("description")
	private String description;
	/**
	 * 推送类型（1：派送；2：失效）
	 */
	@JsonProperty("op_type")
	private String opType;
	@JsonIgnore
	private String agentNo;
	public String getAgentNo() {
		return agentNo;
	}
	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getBonusId() {
		return bonusId;
	}
	public void setBonusId(String bonusId) {
		this.bonusId = bonusId;
	}
	public String getBettingNo() {
		return bettingNo;
	}
	public void setBettingNo(String bettingNo) {
		this.bettingNo = bettingNo;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getOpType() {
		return opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}
	public String getBonusPayId() {
		return bonusPayId;
	}
	public void setBonusPayId(String bonusPayId) {
		this.bonusPayId = bonusPayId;
	}

}
