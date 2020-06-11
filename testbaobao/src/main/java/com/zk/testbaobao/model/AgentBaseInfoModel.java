/**
 * <br>项目名: promotion
 * <br>文件名: AgentBaseInfoModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class AgentBaseInfoModel extends RequestModel{
	@JsonProperty("param_key_list")
	private List<String> paramKeyList = new ArrayList<String>();

	public List<String> getParamKeyList() {
		return paramKeyList;
	}

	public void setParamKeyList(List<String> paramKeyList) {
		this.paramKeyList = paramKeyList;
	}
}
