/**
 * <br>项目名: promotion
 * <br>文件名: AccCancelStatusModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AccCancelStatusModel extends RequestModel{
	
	/**
	 * 代销者销户流水号
	 */
	@JsonProperty("agent_dis_no")
	private String agentDisNo;

	public String getAgentDisNo() {
		return agentDisNo;
	}

	public void setAgentDisNo(String agentDisNo) {
		this.agentDisNo = agentDisNo;
	}
	
	
	  
	
}
