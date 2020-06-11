package com.zk.testbaobao.model;

public class HttpResModel {
	
	private String head;
	private String token;

	private boolean isDes = true;
	
	private byte[] body;
	public byte[] getBody() {
		return body;
	}
	public void setBody(byte[] body) {
		this.body = body;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isDes() {
		return isDes;
	}

	public void setDes(boolean des) {
		isDes = des;
	}
}
