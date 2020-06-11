package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * <br>类 名: JcBulletinBeginningModel 
 * <br>描 述: 查询生效的赛事公告
 * <br>作 者: fanweilong 
 * <br>创 建： 2016年12月28日 
 * <br>版 本： v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class JcBulletinBeginningModel extends RequestModel{
	/**
	 * 代销者赛事公告版本号
	 */
	@JsonProperty("version")
	private String version;
	
	
	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}

}
