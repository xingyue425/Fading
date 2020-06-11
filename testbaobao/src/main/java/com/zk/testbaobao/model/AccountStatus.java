/**
 * <br>项目名: promotion
 * <br>文件名: AccountStatus.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: AccountStatus 
 * <br>描 述: 投注账户状态查询
 * <br>作 者: zhaowei 
 * <br>创 建： 2016-5-3 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class AccountStatus extends RequestModel{
	
	/**投注账号**/
 	@JsonProperty("betting_no")
	private String bettingNo;
 	
 	/**身份证号**/
 	@JsonProperty("id_card")
 	private String idCard;
 	
	
	public String getBettingNo() {
		return bettingNo;
	}

	public void setBettingNo(String bettingNo) {
		this.bettingNo = bettingNo;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
 	
}
