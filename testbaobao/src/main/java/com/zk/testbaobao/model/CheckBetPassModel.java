/**
 * <br>项目名: promotion
 * <br>文件名: CheckBetPassModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckBetPassModel extends RequestModel{
	
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String betingNo;
	
	/**
	 * 投注密码
	 */
	private String pass;
	
	public String getBetingNo() {
		return betingNo;
	}
	public String getPass() {
		return pass;
	}
	public void setBetingNo(String betingNo) {
		this.betingNo = betingNo;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
