package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * <br>类 名: SaleLimitReqModel
 * <br>描 述: 查询玩法销售限制时段
 * <br>作 者: helongtao
 * <br>创 建： 2017年01月16日
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class SaleLimitReqModel extends RequestModel{
	@JsonProperty("logic_code")
	private String logicCode;

	public String getLogicCode() {
		return logicCode;
	}

	public void setLogicCode(String logicCode) {
		this.logicCode = logicCode;
	}
	
}
