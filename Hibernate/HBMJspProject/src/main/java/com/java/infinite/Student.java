package com.java.infinite;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="stu")
@SessionScoped
public class Student {
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", phoneNumber=" + phoneNumber + ", studentAge=" + studentAge + ", studentQualification="
				+ studentQualification + "]";
	}
	
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String phoneNumber;
	private int studentAge;
	private String studentQualification;
	
	public String getStudentQualification() {
		return studentQualification;
	}
	public void setStudentQualification(String studentQualification) {
		this.studentQualification = studentQualification;
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
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public Student(int studentId, String studentName, String studentEmail, String phoneNumber, int studentAge,
			String studentQualification) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.phoneNumber = phoneNumber;
		this.studentAge = studentAge;
		this.studentQualification = studentQualification;
	}
	public Student() {
		
	}	
}
