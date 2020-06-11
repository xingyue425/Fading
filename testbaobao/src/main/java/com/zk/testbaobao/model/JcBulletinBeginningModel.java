package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;


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
