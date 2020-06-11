/**
 * <br>项目名: promotion
 * <br>文件名: AccountStatus.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: OpenAbAccountModel 
 * <br>描 述: 验证总账户 
 * <br>作 者: fanweilong 
 * <br>创 建： 2017年4月11日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class OpenAbAccountModel extends RequestModel{
	
	/**投注账号**/
 	@JsonProperty("betting_no")
	private String bettingNo;
 	
	
	public String getBettingNo() {
		return bettingNo;
	}

	public void setBettingNo(String bettingNo) {
		this.bettingNo = bettingNo;
	}
 	
}
