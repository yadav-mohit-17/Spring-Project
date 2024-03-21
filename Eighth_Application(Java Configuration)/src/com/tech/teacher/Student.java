package com.tech.teacher;

public class Student {
private int studentId;
private String studentName;
private double markPercentage;
public Student() {
	super();
	System.out.println("Student Object Created....");
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public double getMarkPercentage() {
	return markPercentage;
}
public void setMarkPercentage(double markPercentage) {
	this.markPercentage = markPercentage;
}

	
}
