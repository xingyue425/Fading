/**
 * <br>项目名: promotion
 * <br>文件名: WithDrawModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class WithDrawModel extends RequestModel{
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String betingNo;
	/**
	 * 投注账户密码
	 */
	@JsonProperty("acc_pass")
	private String accPass;
	/**
	 * 提现金额（分）
	 */
	@JsonProperty("encash_amount")
	private long encashAmount;
	/**
	 * 代销者提现流水号
	 */
	@JsonProperty("agent_encash_sid")
	private String agentEncashSid;
	
	/**
	 * 提现渠道，后加的
	 */
	@JsonProperty("channel")
	private String channel;
	
	public String getBetingNo() {
		return betingNo;
	}
	public String getAccPass() {
		return accPass;
	}
	public long getEncashAmount() {
		return encashAmount;
	}
	public String getAgentEncashSid() {
		return agentEncashSid;
	}
	public void setBetingNo(String betingNo) {
		this.betingNo = betingNo;
	}
	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}
	public void setEncashAmount(long encashAmount) {
		this.encashAmount = encashAmount;
	}
	public void setAgentEncashSid(String agentEncashSid) {
		this.agentEncashSid = agentEncashSid;
	}
    public String getChannel() {
        return channel;
    }
    public void setChannel(String channel) {
        this.channel = channel;
    }
	
	
}
