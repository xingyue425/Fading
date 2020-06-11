/**
 * <br>项目名: promotion
 * <br>文件名: WithDrawModel.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <br>类 名: AccCancelModel 
 * <br>描 述: 描述类完成的主要功能 
 * <br>作 者: fanweilong
 * <br>创 建： 2016年8月4日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class AccCancelModel extends RequestModel{
	/**
	 * 投注账号
	 */
	@JsonProperty("betting_no")
	private String betingNo;
	/**
	 * 投注密码
	 */
	@JsonProperty("acc_pass")
	private String accPass;
	
	/**
	 * 代销者销户流水号
	 */
	@JsonProperty("agent_dis_no")
	private String agentDisNo;

	public String getBetingNo() {
		return betingNo;
	}

	public void setBetingNo(String betingNo) {
		this.betingNo = betingNo;
	}

	public String getAccPass() {
		return accPass;
	}

	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}

	public String getAgentDisNo() {
		return agentDisNo;
	}

	public void setAgentDisNo(String agentDisNo) {
		this.agentDisNo = agentDisNo;
	}
	
	
}
