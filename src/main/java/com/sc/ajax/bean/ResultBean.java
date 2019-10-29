package com.sc.ajax.bean;

import java.io.Serializable;

public class ResultBean implements Serializable{

	private boolean state;
	private String	msg;
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
