/**
 * <br>项目名: promotion
 * <br>文件名: JsonRequestModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;


/** 
 * <br>类 名: JsonRequestModel 
 * <br>描 述: json请求 
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年5月12日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
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
