package com.cloudapp.entity;

public class LoginCredentials {
	
	private int userId;
	private String userType;
	private  String name;
	private String password;
	
	public LoginCredentials() {
		super();
	}

	public LoginCredentials(String userType, String name) {
		super();
		this.userType = userType;
		this.name = name;
	}

	public LoginCredentials(int userId, String userType, String name, String password) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.name = name;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}