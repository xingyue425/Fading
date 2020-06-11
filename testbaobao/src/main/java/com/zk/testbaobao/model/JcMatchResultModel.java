package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <br>类 名: JcMatchResultModel 
 * <br>描 述: 获取竞彩所有赛事
 * <br>作 者: fanweilong
 * <br>创 建： 2016年12月28日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
