package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class JcBetModel extends RequestModel{
	@JsonProperty("server_area_code")
	private String serverAreaCode;
	
	@JsonProperty("pick_list")
	private List<PickContent> pickList = new ArrayList<PickContent>();
	
	@JsonProperty("multiple")
	private int multiple;
	
	@JsonProperty("bet_num")
	private int betNum;
	
	@JsonProperty("acc_pass")
	private String accPass;
	
	@JsonProperty("aup_type")
	private String aupType;
	
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
	
	@JsonIgnore
	private String matchId1;
	
	@JsonIgnore
	private String poolLogicCode1;
	
	@JsonIgnore
	private String content1;
	@JsonIgnore
	private String matchId2;
	
	@JsonIgnore
	private String poolLogicCode2;
	
	@JsonIgnore
	private String content2;
	
	public String getServerAreaCode() {
		return serverAreaCode;
	}
	public List<PickContent> getPickList() {
		return pickList;
	}
	
	public String getAccPass() {
		return accPass;
	}
	public String getAupType() {
		return aupType;
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
	public String getPinType() {
		return pinType;
	}
	
	public String getBonusId() {
		return bonusId;
	}
	
	public void setServerAreaCode(String serverAreaCode) {
		this.serverAreaCode = serverAreaCode;
	}
	public void setPickList(List<PickContent> pickList) {
		this.pickList = pickList;
	}
	
	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}
	public void setAupType(String aupType) {
		this.aupType = aupType;
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
	public void setPinType(String pinType) {
		this.pinType = pinType;
	}
	
	public void setBonusId(String bonusId) {
		this.bonusId = bonusId;
	}
	
	public String getMatchId1() {
		return matchId1;
	}
	public String getPoolLogicCode1() {
		return poolLogicCode1;
	}
	public String getContent1() {
		return content1;
	}
	public String getMatchId2() {
		return matchId2;
	}
	public String getPoolLogicCode2() {
		return poolLogicCode2;
	}
	public String getContent2() {
		return content2;
	}
	public void setMatchId1(String matchId1) {
		this.matchId1 = matchId1;
	}
	public void setPoolLogicCode1(String poolLogicCode1) {
		this.poolLogicCode1 = poolLogicCode1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public void setMatchId2(String matchId2) {
		this.matchId2 = matchId2;
	}
	public void setPoolLogicCode2(String poolLogicCode2) {
		this.poolLogicCode2 = poolLogicCode2;
	}
	public void setContent2(String content2) {
		this.content2 = content2;
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

