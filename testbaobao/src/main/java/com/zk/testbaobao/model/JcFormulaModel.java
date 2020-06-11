package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class JcFormulaModel extends RequestModel{
	/***
	 * 赛事公告查询编号
	 */
	@JsonProperty("version")
	private String version;
	/** 运动类型编号 **/
	@JsonProperty("sport_no")
	private int sportNo;
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getSportNo() {
		return sportNo;
	}

	public void setSportNo(int sportNo) {
		this.sportNo = sportNo;
	}

	

}
