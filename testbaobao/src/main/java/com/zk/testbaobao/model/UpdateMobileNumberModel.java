package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: UpdateMobileNumberModel 
 * <br>描 述: 修改手机号实体类
 * <br>作 者: fanweilong 
 * <br>创 建： 2017年2月21日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
