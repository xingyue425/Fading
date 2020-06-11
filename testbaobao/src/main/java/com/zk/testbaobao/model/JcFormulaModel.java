package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * <br>类 名: JcFormulaModel 
 * <br>描 述: 获取竞彩过关公式
 * <br>作 者: fanweilong
 * <br>创 建： 2016年10月25日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class JcFormulaModel extends RequestModel{
	/***
	 * 赛事公告查询编号
	 */
	@JsonProperty("version")
	private String version;
	/** 运动类型编号 **/
	@JsonProperty("sport_no")
	private int sportNo;
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getSportNo() {
		return sportNo;
	}

	public void setSportNo(int sportNo) {
		this.sportNo = sportNo;
	}

	

}
