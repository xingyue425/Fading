package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class SaleLimitReqModel extends RequestModel{
	@JsonProperty("logic_code")
	private String logicCode;

	public String getLogicCode() {
		return logicCode;
	}

	public void setLogicCode(String logicCode) {
		this.logicCode = logicCode;
	}
	
}
