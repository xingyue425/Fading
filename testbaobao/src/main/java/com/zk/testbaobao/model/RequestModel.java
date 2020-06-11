/**
 * <br>项目名: promotion
 * <br>文件名: RequestModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <br>类 名: RequestModel 
 * <br>描 述: 请求基类
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年4月28日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class RequestModel {

	/**
	 * 代销者编号
	 */
	@JsonIgnore
	private String agentNo;

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}
}
