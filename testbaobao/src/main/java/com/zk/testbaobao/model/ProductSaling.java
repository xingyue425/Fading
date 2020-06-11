package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductSaling extends RequestModel{
	/**
	 * 地区码
	 */
	@JsonProperty("server_area_code")
	private String serverAreaCode;
	
	

	public String getServerAreaCode() {
		return serverAreaCode;
	}

	

	public void setServerAreaCode(String serverAreaCode) {
		this.serverAreaCode = serverAreaCode;
	}

	
	
}
