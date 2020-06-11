/**
 * <br>项目名: promotion
 * <br>文件名: QueryBetResult.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class QueryBetResult {
	/**代销者投注流水号**/
 	@JsonProperty("bet_sn")
	private String betSn;

	public String getBetSn() {
		return betSn;
	}

	public void setBetSn(String betSn) {
		this.betSn = betSn;
	}
}
