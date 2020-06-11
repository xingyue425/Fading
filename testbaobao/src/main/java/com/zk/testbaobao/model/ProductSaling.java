package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * <br>类 名: ProductSaling 
 * <br>描 述: 在售玩法信息查询
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年5月9日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class ProductSaling extends RequestModel{
	/**
	 * 地区码
	 */
	@JsonProperty("server_area_code")
	private String serverAreaCode;
	
	

	public String getServerAreaCode() {
		return serverAreaCode;
	}

	

	public void setServerAreaCode(String serverAreaCode) {
		this.serverAreaCode = serverAreaCode;
	}

	
	
}
