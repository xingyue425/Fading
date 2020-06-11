package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class DigitalBetModel extends RequestModel{
	@JsonProperty("server_area_code")
	private String serverAreaCode;
	
	@JsonProperty("one_step_bet_pd_type")
	private String betPdType;
	
	@JsonProperty("draw_no")
	private String drawNo;
	
	@JsonProperty("pick")
	private String pick;
	
	@JsonProperty("flag_add")
	private int flagAdd;
	
	@JsonProperty("multiple")
	private int multiple;
	
	@JsonProperty("bet_num")
	private int betNum;
	
	@JsonProperty("acc_pass")
	private String accPass;
	
	@JsonProperty("bet_way")
	private String betWay;
	
	@JsonProperty("logic_code")
	private String logicCode;
	
	@JsonProperty("flag_transfer")
	private int flagTransfer;
	
	@JsonProperty("mobile")
	private String mobile;
	
	@JsonProperty("amount")
	private long amount;
	
	@JsonProperty("bet_sn")
	private String betSn;//
	
	@JsonProperty("pin")
	private String pin;
	
	@JsonProperty("pin_type")
	private String pinType;
	
	@JsonProperty("bonus_amount")
	private long bonusAmount;
	
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
	
	public String getServerAreaCode() {
		return serverAreaCode;
	}
	public String getBetPdType() {
		return betPdType;
	}
	public String getDrawNo() {
		return drawNo;
	}
	public String getPick() {
		return pick;
	}
	public String getAccPass() {
		return accPass;
	}
	public String getBetWay() {
		return betWay;
	}
	public String getLogicCode() {
		return logicCode;
	}
	public String getMobile() {
		return mobile;
	}
	public String getBetSn() {
		return betSn;
	}
	public String getPin() {
		return pin;
	}
	public String getBonusId() {
		return bonusId;
	}
	public void setServerAreaCode(String serverAreaCode) {
		this.serverAreaCode = serverAreaCode;
	}
	public void setBetPdType(String betPdType) {
		this.betPdType = betPdType;
	}
	public void setDrawNo(String drawNo) {
		this.drawNo = drawNo;
	}
	public void setPick(String pick) {
		this.pick = pick;
	}
	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}
	public void setBetWay(String betWay) {
		this.betWay = betWay;
	}
	public void setLogicCode(String logicCode) {
		this.logicCode = logicCode;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setBetSn(String betSn) {
		this.betSn = betSn;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getPinType() {
		return pinType;
	}
	public void setPinType(String pinType) {
		this.pinType = pinType;
	}
	public void setBonusId(String bonusId) {
		this.bonusId = bonusId;
	}
	public int getFlagAdd() {
		return flagAdd;
	}
	public int getMultiple() {
		return multiple;
	}
	public int getBetNum() {
		return betNum;
	}
	public int getFlagTransfer() {
		return flagTransfer;
	}
	public long getAmount() {
		return amount;
	}
	public long getBonusAmount() {
		return bonusAmount;
	}
	public void setFlagAdd(int flagAdd) {
		this.flagAdd = flagAdd;
	}
	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}
	public void setBetNum(int betNum) {
		this.betNum = betNum;
	}
	public void setFlagTransfer(int flagTransfer) {
		this.flagTransfer = flagTransfer;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public void setBonusAmount(long bonusAmount) {
		this.bonusAmount = bonusAmount;
	}
	
}
