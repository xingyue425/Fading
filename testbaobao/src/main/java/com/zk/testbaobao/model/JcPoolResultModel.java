package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * 
 * <br>类 名: JcPoolResultModel
 * <br>描 述: 查询竞彩指定奖池及彩果
 * <br>作 者: fanweilong
 * <br>创 建： 2016年12月28日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
