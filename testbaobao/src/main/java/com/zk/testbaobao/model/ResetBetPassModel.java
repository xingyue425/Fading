/**
 * <br>项目名: promotion
 * <br>文件名: ResetBetPass.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: ResetBetPass 
 * <br>描 述: 修改投注密码 
 * <br>作 者: zhaowei 
 * <br>创 建： 2016年8月19日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
