package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data 
public class StudentDetails {
	
	@Id 
	private String id;
	private String name;
	private String mobile;
	private String address;
	private String email;
	
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentDetails(String id, String name, String mobile, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address
				+ ", email=" + email + "]";
	}
}
