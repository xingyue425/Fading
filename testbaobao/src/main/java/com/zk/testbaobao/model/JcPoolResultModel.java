package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;



public class JcPoolResultModel extends RequestModel{
	/**
	 * 入参类别
	 */
	@JsonProperty("param_type")
	private int paramType;
	
	/**
	 * 入参数组
	 */
	@JsonProperty("jc_pool_keys")
	private List<JCPoolKey> jcPoolKeys;


	public int getParamType() {
		return paramType;
	}



	public void setParamType(int paramType) {
		this.paramType = paramType;
	}



	public List<JCPoolKey> getJcPoolKeys() {
		return jcPoolKeys;
	}



	public void setJcPoolKeys(List<JCPoolKey> jcPoolKeys) {
		this.jcPoolKeys = jcPoolKeys;
	}


}
