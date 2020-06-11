/**
 * <br>项目名: promotion
 * <br>文件名: AgentBaseInfoModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/** 
 * <br>类 名: AgentBaseInfoModel 
 * <br>描 述: 代销者获取基础数据
 * <br>作 者: zhaowei 
 * <br>创 建： 2016年8月26日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
