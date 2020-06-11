/**
 * <br>项目名: promotion
 * <br>文件名: JsonRequestModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;



public class JsonRequestModel extends RequestModel {
	
	/**
	 * 请求token
	 */
	private String token;
	
	/**
	 * 命令字
	 */
	private String cmd;
	
	/**
	 * 协议内容
	 */
	private String jsonStr;

	public String getToken() {
		return token;
	}

	public String getCmd() {
		return cmd;
	}

	public String getJsonStr() {
		return jsonStr;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
	}
}
