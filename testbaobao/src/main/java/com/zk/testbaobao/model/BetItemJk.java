package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetItemJk {
	/**模板短链接地址 具体格式如下 短地址&模板解压密码**/
 	@JsonProperty("tmp_url")
	private String tmpUrl;

	public String getTmpUrl() {
		return tmpUrl;
	}

	public void setTmpUrl(String tmpUrl) {
		this.tmpUrl = tmpUrl;
	}
}
