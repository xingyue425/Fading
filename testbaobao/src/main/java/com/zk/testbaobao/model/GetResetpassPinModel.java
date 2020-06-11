/**
 * <br>项目名: promotion
 * <br>文件名: GetResetpassPinModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class GetResetpassPinModel extends RequestModel{
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String bettingNo;
	

	public String getBettingNo() {
		return bettingNo;
	}

	public void setBettingNo(String bettingNo) {
		this.bettingNo = bettingNo;
	}

	
	
	
}
