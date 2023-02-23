package com.example.demo.common;

public class CommonResponseDto {
	
	protected int status;
	protected String response;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "CommonResponseDto [status=" + status + ", response=" + response + "]";
	}
	
}
