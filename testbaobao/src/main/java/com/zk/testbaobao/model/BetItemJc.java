package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class BetItemJc{
	/**投注内容**/
 	@JsonProperty("pick_list")
	private List<PickContentReq> pickList = new ArrayList<PickContentReq>();
 	/**过关方式 例如:“2#1”目前不支持单关 详见附录[竞彩足球过关方式]**/
 	@JsonProperty("aup_type")
	private String aupType;
	public List<PickContentReq> getPickList() {
		return pickList;
	}
	public void setPickList(List<PickContentReq> pickList) {
		this.pickList = pickList;
	}
	public String getAupType() {
		return aupType;
	}
	public void setAupType(String aupType) {
		this.aupType = aupType;
	}
 	
}
