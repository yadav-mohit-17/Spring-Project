package com.swiggy.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity 
@Data 
@Table (name="User_Record")
public class UserRecord {

	@Id 
	@Column 
	private String emailId;
	@Column 
	private String name;
	@Column
	private String age;
	@Column
	private String gender;
	@Column
	private String city;
	@Column
	private String mobile;
	
}
