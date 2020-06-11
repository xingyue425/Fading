package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountFundOverview extends RequestModel{
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String betingNo;

	public String getBetingNo() {
		return betingNo;
	}

	public void setBetingNo(String betingNo) {
		this.betingNo = betingNo;
	}
	
}
