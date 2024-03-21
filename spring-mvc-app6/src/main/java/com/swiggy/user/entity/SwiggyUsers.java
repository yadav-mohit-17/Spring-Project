package com.swiggy.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Entity 
@Data
//@Builder
@Table(name="Swiggy_Users")
public class SwiggyUsers {
	
	@Id
	@Column 
	private String email;
	@Column
	private String name;
	@Column
	
	private String mobile;
	@Column
	//password will not show in response
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;

	
}
