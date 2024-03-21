package com.tech.teacher;

import org.springframework.stereotype.Component;

@Component
public class Student {
 private String studentId;
 private String studentName;
 private int studentMark;
public Student() {
	
	System.out.println("Student Object Created....");
}
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentMark() {
	return studentMark;
}
public void setStudentMark(int studentMark) {
	this.studentMark = studentMark;
}
 
}
