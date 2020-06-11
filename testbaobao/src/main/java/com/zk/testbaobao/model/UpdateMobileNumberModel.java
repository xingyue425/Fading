package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateMobileNumberModel extends RequestModel  {

	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String betNo;
	
	/**
	 * 投注密码
	 */
	@JsonProperty("acc_pass")
	private String password;
	
	/***
	 * 手机号
	 */
	@JsonProperty("mobile")
	private String mobileNo;

    /***
	 * 身份证号
	 */
	@JsonProperty("id_card")
	private String certnum;
    
    /***
	 * 短信验证码
	 */
	@JsonProperty("pin")
	private String verifyCode;

	
	public String getBetNo() {
		return betNo;
	}


	public void setBetNo(String betNo) {
		this.betNo = betNo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getCertnum() {
		return certnum;
	}


	public void setCertnum(String certnum) {
		this.certnum = certnum;
	}


	public String getVerifyCode() {
		return verifyCode;
	}


	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}


}
