package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class JcPoolSellingModel extends RequestModel{
	/** 运动类型编号 **/
	@JsonProperty("sport_no")
	private int sportNo;
	
	/** 代销者奖池版本号 **/
	@JsonProperty("version")
	private String version;

	public int getSportNo() {
		return sportNo;
	}

	public void setSportNo(int sportNo) {
		this.sportNo = sportNo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


}
