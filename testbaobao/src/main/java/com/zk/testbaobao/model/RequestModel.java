/**
 * <br>项目名: promotion
 * <br>文件名: RequestModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;


public class RequestModel {

	/**
	 * 代销者编号
	 */
	@JsonIgnore
	private String agentNo;

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}
}
