/**
 * <br>项目名: promotion
 * <br>文件名: QueryBetResult.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: QueryBetResult 
 * <br>描 述: 描述类完成的主要功能 
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年5月3日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
