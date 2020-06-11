/**
 * <br>项目名: promotion
 * <br>文件名: AccountStatus.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: AccountStatus 
 * <br>描 述: 根据总账户查询投注账户信息
 * <br>作 者: fanweilong
 * <br>创 建： 2016-12-14
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
