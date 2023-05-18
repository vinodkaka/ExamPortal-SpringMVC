package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	int studentId;
	@Column
	String studentName;
	@Column(unique=true)
	String studentEmail;
	@Column
	private String studentPassword;
	@Column(unique=true)
	String enrolExam;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentEmail, String studentPassword, String enrolExam) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPassword = studentPassword;
		this.enrolExam = enrolExam;
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

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getEnrolExam() {
		return enrolExam;
	}

	public void setEnrolExam(String enrolExam) {
		this.enrolExam = enrolExam;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentPassword=" + studentPassword + ", enrolExam=" + enrolExam + "]";
	}
	
	
}
