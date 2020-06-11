package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPinModel extends RequestModel{

	/**
	 * 投注账号
	 */
	@JsonProperty("mobile")
	private String mobile;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
