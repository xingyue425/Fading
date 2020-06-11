/**
 * <br>项目名: promotion
 * <br>文件名: WithDrawOrderModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class WithDrawOrderModel extends RequestModel {
	
	/**
	 * 代销者提现流水号
	 */
	@JsonProperty("agent_encash_sid")
	private String agentEncashSid;

	public String getAgentEncashSid() {
		return agentEncashSid;
	}

	public void setAgentEncashSid(String agentEncashSid) {
		this.agentEncashSid = agentEncashSid;
	}
	
}
