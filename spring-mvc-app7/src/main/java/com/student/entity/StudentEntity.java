package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Student_Data")
public class StudentEntity {
	@Id 
	@Column 
	private int id;
	@Column
	private String came;
	@Column
	private String course;
	@Column
	private String mobile;
	@Column
	private String email;
	@Column
	private String address;

}
