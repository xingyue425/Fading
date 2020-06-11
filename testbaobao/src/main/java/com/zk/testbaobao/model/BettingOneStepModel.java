package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BettingOneStepModel extends RequestModel{
	/**一步投注彩种类型 1-竞彩   2-足彩   3-周期型   4-即开**/
 	@JsonProperty("one_step_bet_pd_type")
	private String oneStepBetPdType;

 	/**代销者流水号(海南在线客户端可为空，其他接入方非空)**/
 	@JsonProperty("bet_sn")
	private String betSn;

 	/**玩法唯一标示 **/
 	@JsonProperty("logic_code")
	private String logicCode;

	/**投注账号(省账号)**/
	@JsonProperty("betting_no")
	private String bettingNo;

	/**接入区域代码**/
	@JsonProperty("server_area_code")
	private String serverAreaCode;

	/**投注密码(数字) (MD5加密32位) (海南在线客户端可为空，其他接入方非空且代销者流水号非空)**/
	@JsonProperty("acc_pass")
	private String accPass;

	/**用户手机号，监控需要**/
	@JsonProperty("mobile")
	private String mobile;

	/**投注数量(即开：现在仅支持单张)**/
	@JsonProperty("bet_num")
	private int betNum;

	/**投注倍数**/
	@JsonProperty("multiple")
	private int multiple = 1;

	/**投注总额(分)**/
	@JsonProperty("amount")
	private long amount = -1L;

 	/**是否使用奖金**/
 	@JsonProperty("flag_transfer")
	private int flagTransfer;

	/**红包金额(分)**/
	@JsonProperty("bonus_amount")
	private long bonusAmount = -1L;

	/**红包流水号 若红包金额非空，该字段也非空，仅供对账统计使用，无特殊意义**/
	@JsonProperty("bonus_id")
	private String bonusId;

	/**活动ID 若红包金额非空，该字段也非空，仅供对账统计使用，无特殊意义**/
	@JsonProperty("activity_id")
	private String activityId;

	/**数字、传统足彩一步投注信息**/
	@JsonProperty("bet_item_sz")
	private BetItemSz betItemSz;

	/**竞猜型彩票一步投注信息**/
	@JsonProperty("bet_item_jc")
	private BetItemJc betItemJc;
 	
	public String getOneStepBetPdType() {
		return oneStepBetPdType;
	}
	public void setOneStepBetPdType(String oneStepBetPdType) {
		this.oneStepBetPdType = oneStepBetPdType;
	}
	public String getBetSn() {
		return betSn;
	}
	public void setBetSn(String betSn) {
		this.betSn = betSn;
	}
	public String getLogicCode() {
		return logicCode;
	}
	public void setLogicCode(String logicCode) {
		this.logicCode = logicCode;
	}
	public int getFlagTransfer() {
		return flagTransfer;
	}
	public void setFlagTransfer(int flagTransfer) {
		this.flagTransfer = flagTransfer;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public int getBetNum() {
		return betNum;
	}
	public void setBetNum(int betNum) {
		this.betNum = betNum;
	}
	public int getMultiple() {
		return multiple;
	}
	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}
	public String getBettingNo() {
		return bettingNo;
	}
	public void setBettingNo(String bettingNo) {
		this.bettingNo = bettingNo;
	}
	public long getBonusAmount() {
		return bonusAmount;
	}
	public void setBonusAmount(long bonusAmount) {
		this.bonusAmount = bonusAmount;
	}
	public String getBonusId() {
		return bonusId;
	}
	public void setBonusId(String bonusId) {
		this.bonusId = bonusId;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getServerAreaCode() {
		return serverAreaCode;
	}
	public void setServerAreaCode(String serverAreaCode) {
		this.serverAreaCode = serverAreaCode;
	}

	public String getAccPass() {
		return accPass;
	}
	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public BetItemSz getBetItemSz() {
		return betItemSz;
	}
	public void setBetItemSz(BetItemSz betItemSz) {
		this.betItemSz = betItemSz;
	}
	public BetItemJc getBetItemJc() {
		return betItemJc;
	}
	public void setBetItemJc(BetItemJc betItemJc) {
		this.betItemJc = betItemJc;
	}
 	
}
