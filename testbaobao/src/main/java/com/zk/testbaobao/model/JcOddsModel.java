package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * 
 * <br>类 名: JcOddsModel 
 * <br>描 述: 查询指定奖池赔率（竞彩）
 * <br>作 者: fanweilong
 * <br>创 建： 2016年12月28日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class JcOddsModel extends RequestModel{
	/**
	 * 赔率类型值
	 */
	@JsonProperty("odds_type")
	private String oddsType;
	
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


	public String getOddsType() {
		return oddsType;
	}



	public void setOddsType(String oddsType) {
		this.oddsType = oddsType;
	}



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
