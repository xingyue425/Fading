/**
 * <br>项目名: promotion
 * <br>文件名: AccountStatus.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class FindMemberAccModel extends RequestModel{
	
	/**总账户**/
 	@JsonProperty("acc_no")
	private String accNo;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
 	
	
	
 	
}
