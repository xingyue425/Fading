package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenbetModel extends RequestModel{
	@JsonProperty("mobile")
	private String mobile;
	@JsonProperty("acc_pass")
	private String accPass;
	@JsonProperty("name")
	private String name;
	@JsonProperty("bank_acc_no")
	private String bankAccNo;
	@JsonProperty("id_card")
	private String idCard;
	@JsonProperty("bank_abbr")
	private String bankAbbr;
	@JsonProperty("district_code")
	private String districtCode;
	@JsonProperty("inner_flag")
	private String innerFlag;
	@JsonProperty("inner_acc_type")
	private String innerAccType;
	@JsonProperty("login_name")
	private String loginName;
	
	@JsonProperty("flag_childaccount")
	private String flagChildaccount;
	
	@JsonProperty("flag_autotran")
	private String flagAutotran;
	
	@JsonProperty("senior_bank_acc_no")
	private String seniorBankAccNo;
	
	@JsonProperty("pin")
	private String pin;
	
	
	
	public String getFlagChildaccount() {
		return flagChildaccount;
	}
	public void setFlagChildaccount(String flagChildaccount) {
		this.flagChildaccount = flagChildaccount;
	}
	public String getFlagAutotran() {
		return flagAutotran;
	}
	public void setFlagAutotran(String flagAutotran) {
		this.flagAutotran = flagAutotran;
	}
	public String getSeniorBankAccNo() {
		return seniorBankAccNo;
	}
	public void setSeniorBankAccNo(String seniorBankAccNo) {
		this.seniorBankAccNo = seniorBankAccNo;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAccPass() {
		return accPass;
	}
	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankAccNo() {
		return bankAccNo;
	}
	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getBankAbbr() {
		return bankAbbr;
	}
	public void setBankAbbr(String bankAbbr) {
		this.bankAbbr = bankAbbr;
	}
	public String getInnerFlag() {
		return innerFlag;
	}
	public void setInnerFlag(String innerFlag) {
		this.innerFlag = innerFlag;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getInnerAccType() {
		return innerAccType;
	}
	public void setInnerAccType(String innerAccType) {
		this.innerAccType = innerAccType;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

}
