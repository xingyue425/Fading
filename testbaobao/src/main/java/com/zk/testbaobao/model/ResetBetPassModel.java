/**
 * <br>项目名: promotion
 * <br>文件名: ResetBetPass.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ResetBetPassModel extends RequestModel{
	
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String betingNo;
	
	/**
	 * 新密码
	 */
	@JsonProperty("new_pass")
	private String newPass;
	
	/***
	 * 短信验证码
	 */
	private String pin;

	public String getBetingNo() {
		return betingNo;
	}
	public void setBetingNo(String betingNo) {
		this.betingNo = betingNo;
	}
	public String getNewPass() {
		return newPass;
	}
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
}
