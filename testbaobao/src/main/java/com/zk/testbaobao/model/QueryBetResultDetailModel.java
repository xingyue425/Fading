/**
 * <br>项目名: promotion
 * <br>文件名: QueryBetResultDetailModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


@JsonIgnoreProperties
public class QueryBetResultDetailModel extends RequestModel{
	
	@JsonIgnore
	private String betSn;

	/**产品类型  **/
 	@JsonProperty("query_bet_result_type")
	private String queryBetResultType;
 	
 	/**请求列表  **/
 	@JsonProperty("query_bet_result_data")
	private List<QueryBetResult> queryBetResultData = new ArrayList<QueryBetResult>();
 	
	public String getQueryBetResultType() {
		return queryBetResultType;
	}
	public void setQueryBetResultType(String queryBetResultType) {
		this.queryBetResultType = queryBetResultType;
	}
	
	public List<QueryBetResult> getQueryBetResultData() {
		return queryBetResultData;
	}
	public void setQueryBetResultData(List<QueryBetResult> queryBetResultData) {
		this.queryBetResultData = queryBetResultData;
	}

	public String getBetSn() {
		return betSn;
	}

	public void setBetSn(String betSn) {
		this.betSn = betSn;
	}
}
