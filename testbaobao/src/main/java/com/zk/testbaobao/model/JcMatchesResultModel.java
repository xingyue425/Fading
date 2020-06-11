package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * <br>类 名: JcMatchesResultModel
 * <br>描 述: 获取竞彩比赛结果
 * <br>作 者: fanweilong
 * <br>创 建： 2016年9月28日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
