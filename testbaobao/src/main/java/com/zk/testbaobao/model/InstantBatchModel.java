package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class InstantBatchModel extends RequestModel{
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String bettingNo;

	/**
	 * 投注流水号
	 */
	@JsonProperty("plat_sn")
	private String platSn;

	public String getBettingNo() {
		return bettingNo;
	}

	public String getPlatSn() {
		return platSn;
	}

	public void setBettingNo(String bettingNo) {
		this.bettingNo = bettingNo;
	}

	public void setPlatSn(String platSn) {
		this.platSn = platSn;
	}
}
