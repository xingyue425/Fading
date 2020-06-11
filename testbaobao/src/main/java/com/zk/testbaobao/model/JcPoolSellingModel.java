package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * <br>类 名: JcPoolSellingModel 
 * <br>描 述: 查询在售奖池（竞彩）
 * <br>作 者: fanweilong
 * <br>创 建： 2016年12月28日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class JcPoolSellingModel extends RequestModel{
	/** 运动类型编号 **/
	@JsonProperty("sport_no")
	private int sportNo;
	
	/** 代销者奖池版本号 **/
	@JsonProperty("version")
	private String version;

	public int getSportNo() {
		return sportNo;
	}

	public void setSportNo(int sportNo) {
		this.sportNo = sportNo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


}
