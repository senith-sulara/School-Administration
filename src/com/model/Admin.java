package com.model;

public class Admin {
	private String adminID;
	private String name;
	private String email;
	private String userName;
	private String password;
	
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", Name=" + name + ", Email=" + email + ", UserName=" + userName
				+ ", Password=" + password + "]";
	}
	
	
}
