package com.google.response;

import java.util.List;

public class CountryResponse {
	private boolean error;
	private String msg;
	private List<Country> data;
	
	
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Country> getData() {
		return data;
	}
	public void setData(List<Country> data) {
		this.data = data;
	}
	
	
	

}
