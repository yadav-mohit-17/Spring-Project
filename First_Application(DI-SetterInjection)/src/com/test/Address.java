package com.test;

public class Address {
	private String city,state;
	private int pincode;
	public Object printAddress;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String toString()
	{
		return "Address[city=\" + city + \", state=\" + state + \", pincode=\" + pincode + \"]";
	}
}
