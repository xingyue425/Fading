package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class JcMatchesResultModel extends RequestModel{
	/***
	 * 时间戳
	 */
	@JsonProperty("time_stamp")
	private String timeStamp;

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
