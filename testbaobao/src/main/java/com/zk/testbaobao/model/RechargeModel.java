package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class RechargeModel extends RequestModel{
	/***
	 * 投注账户
	 */
	@JsonProperty("betting_no")
	private String betingNo;
	/**
	 * 充值金额
	 */
	@JsonProperty("amount")
	private long money ;
	/**
	 * 充值类型
	 * 003101: 银联支付
	 * 003001：支付宝安全充值
	 * 003002：支付宝储蓄卡充值
	 * 003003：支付宝无线安全支付
	 * 001201:山东建行本行充值
	 * 001202:山东建行他行充值
	 * 0013:海南中行充值
	 */
	@JsonProperty("pay_way")
	private String paytype;
	/**
	 * 支付宝回调地址
	 */
	@JsonProperty("callback_url")
	private String callbackUrl;
	/**
	 * 代销者充值流水号
	 */
	@JsonProperty("agent_refill_sid")
	private String agentRefillSid;
	
	public String getBetingNo() {
		return betingNo;
	}

	public void setBetingNo(String betingNo) {
		this.betingNo = betingNo;
	}

	public long getMoney() {
		return money;
	}

	public String getPaytype() {
		return paytype;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getAgentRefillSid() {
		return agentRefillSid;
	}

	public void setAgentRefillSid(String agentRefillSid) {
		this.agentRefillSid = agentRefillSid;
	}
	
}
