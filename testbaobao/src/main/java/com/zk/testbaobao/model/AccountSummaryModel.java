/**
 * <br>项目名: promotion
 * <br>文件名: AccountSummaryModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountSummaryModel extends  RequestModel {
	/**
	 * 起始日期（格式： yyyy-MM-dd）
	 */
	@JsonProperty("start_date")
	private String startDate;
	
	/**
	 * 截止日期（格式： yyyy-MM-dd）
	 */
	@JsonProperty("end_date")
	private String endDate;
	
	/** 
	 * 交易类型
	 */
	@JsonProperty("pay_type")
	private int payType;
	
	/**
	 * 时间戳
	 */
	@JsonProperty("time_stamp")
	private String timeStamp;
	
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String betingNo;
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getBetingNo() {
		return betingNo;
	}
	public void setBetingNo(String betingNo) {
		this.betingNo = betingNo;
	}
}
