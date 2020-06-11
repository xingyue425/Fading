/**
 * <br>项目名: promotion
 * <br>文件名: WithDrawOrderModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: WithDrawOrderModel 
 * <br>描 述: 描述类完成的主要功能 
 * <br>作 者: zhaowei 
 * <br>创 建： 2016年8月9日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
