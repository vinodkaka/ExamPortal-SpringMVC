package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	int adminId;
	@Column
	String adminName;
	@Column(unique=true)
	String adminUserName;
	@Column
	private String adminPassword;
	@Column(unique=true)
	String email;
	@Column(unique=true)
	long phone;
	
	public Admin() {
		super();
	}

	public Admin(int adminId, String adminName, String adminUserName, String adminPassword, String email, long phone) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
		this.email = email;
		this.phone = phone;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminUserName=" + adminUserName
				+ ", adminPassword=" + adminPassword + ", email=" + email + ", phone=" + phone + "]";
	}

	
	
	
	

}


