/**
 * <br>项目名: promotion
 * <br>文件名: BaseLogin.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class BaseLogin extends RequestModel{
	@JsonProperty("call_back_url")
	private String callBackUrl;

	public String getCallBackUrl() {
		return callBackUrl;
	}

	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}
	
}
