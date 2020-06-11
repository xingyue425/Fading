/**
 * <br>项目名: promotion
 * <br>文件名: UpdateBankModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: UpdateBankModel 
 * <br>描 述: 描述类完成的主要功能 
 * <br>作 者: fanweilong 
 * <br>创 建： 2016年9月6日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class UpdateBankModel extends RequestModel {
	
	/**
	 * 投注密码
	 */
	@JsonProperty("acc_pass")
	private String accPass;
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String bettingNo;
	/**
	 * 银行卡号
	 */
	@JsonProperty("bank_acc_no")
	private String bankAccNo;
	/**
	 * 身份证号
	 */
	@JsonProperty("id_card")
	private String idCard;
	/**
	 * 银行英文缩写
	 */
	@JsonProperty("bank_abbr")
	private String bankAbbr;
	/**
	 * 市区编号
	 */
	@JsonProperty("district_code")
	private String districtCode;
	
	/**
	 *是否二类户
	 */
	@JsonProperty("flag_childaccount")
	private String flagChildaccount;
	
	/**
	 * 一类户卡号
	 */
	@JsonProperty("senior_bank_acc_no")
	private String seniorBankAccNo;
	

	
	
	public String getFlagChildaccount() {
		return flagChildaccount;
	}

	public void setFlagChildaccount(String flagChildaccount) {
		this.flagChildaccount = flagChildaccount;
	}

	public String getSeniorBankAccNo() {
		return seniorBankAccNo;
	}

	public void setSeniorBankAccNo(String seniorBankAccNo) {
		this.seniorBankAccNo = seniorBankAccNo;
	}

	public String getAccPass() {
		return accPass;
	}

	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}

	public String getBettingNo() {
		return bettingNo;
	}

	public void setBettingNo(String bettingNo) {
		this.bettingNo = bettingNo;
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

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	

}
