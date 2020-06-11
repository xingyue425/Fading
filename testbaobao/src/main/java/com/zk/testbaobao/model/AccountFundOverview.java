package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * <br>类 名: AccountFundOverview 
 * <br>描 述: 账户资金信息总览  
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年5月9日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class AccountFundOverview extends RequestModel{
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String betingNo;

	public String getBetingNo() {
		return betingNo;
	}

	public void setBetingNo(String betingNo) {
		this.betingNo = betingNo;
	}
	
}
