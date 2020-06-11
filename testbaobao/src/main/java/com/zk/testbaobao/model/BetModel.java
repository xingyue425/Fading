package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties({"agentNo"})
public class BetModel extends RequestModel{
	@JsonProperty("server_area_code")
	private String serverAreaCode;
	@JsonProperty("bet_serial_num")
	private String betSerialNum;
	@JsonProperty("bet_num")
	private int betNum;
	@JsonProperty("acc_pass")
	private String accPass;
	@JsonProperty("flag_transfer")
	private int flagTransfer;
	@JsonProperty("logic_code")
	private String logicCode;
	@JsonProperty("tmp_url")
	private String tmpUrl;
	@JsonProperty("money")
	private int money;
	
	@JsonProperty("bonus_amount")
	private int bonusAmount;
	
	/***
	 * 活动ID
	 */
	@JsonProperty("activity_id")
	private String activityId;
	
	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	@JsonProperty("bonus_id")
	private String bonusId;
	
	@JsonProperty("mobile")
	private String mobile;
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getServerAreaCode() {
		return serverAreaCode;
	}

	public void setServerAreaCode(String serverAreaCode) {
		this.serverAreaCode = serverAreaCode;
	}

	public String getBetSerialNum() {
		return betSerialNum;
	}

	public void setBetSerialNum(String betSerialNum) {
		this.betSerialNum = betSerialNum;
	}

	public int getBetNum() {
		return betNum;
	}

	public void setBetNum(int betNum) {
		this.betNum = betNum;
	}

	public String getAccPass() {
		return accPass;
	}

	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}

	public int getFlagTransfer() {
		return flagTransfer;
	}

	public void setFlagTransfer(int flagTransfer) {
		this.flagTransfer = flagTransfer;
	}

	public String getLogicCode() {
		return logicCode;
	}

	public void setLogicCode(String logicCode) {
		this.logicCode = logicCode;
	}

	public String getTmpUrl() {
		return tmpUrl;
	}

	public void setTmpUrl(String tmpUrl) {
		this.tmpUrl = tmpUrl;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(int bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public String getBonusId() {
		return bonusId;
	}

	public void setBonusId(String bonusId) {
		this.bonusId = bonusId;
	}
	
}
