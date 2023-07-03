package com.java.infinite;

public class Student {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String phoneNumber;
	private int studentAge;
	private String studentQualification;
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
	public String getStudentQualification() {
		return studentQualification;
	}
	public void setStudentQualification(String studentQualification) {
		this.studentQualification = studentQualification;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", phoneNumber=" + phoneNumber + ", studentAge=" + studentAge + ", studentQualification="
				+ studentQualification + "]";
	}
	public Student(int studentId, String studentName, String studentEmail, String phoneNumber, int studentAge,
			String studentQualification) {
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
