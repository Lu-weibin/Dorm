package com.ssm.pojo;

import java.io.Serializable;

public class Result implements Serializable{
	private boolean isSuccess;
	private String message;
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(boolean isSuccess, String message) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Result [isSuccess=" + isSuccess + ", message=" + message + "]";
	}
}

