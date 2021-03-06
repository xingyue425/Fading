package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class JcMatchResultModel extends RequestModel{
	

	@JsonIgnore
	private String jcMatchId;
	/**
	 * 入参数组
	 */
	@JsonProperty("jc_match_ids")
	private List<Long> jcMatchIds =new ArrayList<Long>();

	public List<Long> getJcMatchIds() {
		return jcMatchIds;
	}

	public void setJcMatchIds(List<Long> jcMatchIds) {
		this.jcMatchIds = jcMatchIds;
	}

	public String getJcMatchId() {
		return jcMatchId;
	}

	public void setJcMatchId(String jcMatchId) {
		this.jcMatchId = jcMatchId;
	}

	

}
