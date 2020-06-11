/**
 * <br>项目名: promotion
 * <br>文件名: OrderDetailModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: OrderDetailModel 
 * <br>描 述: 描述类完成的主要功能 
 * <br>作 者: zhaowei 
 * <br>创 建： 2016年7月28日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class OrderDetailModel extends RequestModel{
	/**
	 * 代销者充值流水号
	 */
	@JsonProperty("agent_refill_sid")
	private String agentRefillSid;
	
	/**
	 * 充值类型
	 * 003001：支付宝安全充值
	 * 003002：支付宝储蓄卡充值
	 * 003003：支付宝无线安全支付
	 * 003101: 银联支付
	 * 001201:建行本行支付
	 * 001202:建行他行支付
	 * 0013:海南中行充值
	 */
	@JsonProperty("pay_way")
	private String paytype;

	public String getAgentRefillSid() {
		return agentRefillSid;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setAgentRefillSid(String agentRefillSid) {
		this.agentRefillSid = agentRefillSid;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	
	
}
