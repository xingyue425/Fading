package com.zk.testbaobao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class RegisterModel {
	/**
	 * 登录名
	 */
	@JsonProperty("login_name")
	private String loginName;
	
	/**
	 * 登录密码
	 */
	@JsonProperty("login_pass")
	private String loginPass;
	
	/**
	 * 注册渠道码
	 */
	@JsonProperty("channel_code")
	private String channelCode;
	
	/**
	 * 区域代码
	 */
	@JsonProperty("server_area_code")
	private String serverAreaCode;
	
	/**
	 * 终端标识
	 */
	@JsonProperty("register_tid")
	private String registerTid;
	
	/**
	 * 代销者编号
	 */
	@JsonIgnore
	private String agentNo;

	public String getLoginName() {
		return loginName;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public String getServerAreaCode() {
		return serverAreaCode;
	}

	public String getRegisterTid() {
		return registerTid;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public void setServerAreaCode(String serverAreaCode) {
		this.serverAreaCode = serverAreaCode;
	}

	public void setRegisterTid(String registerTid) {
		this.registerTid = registerTid;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}
}
