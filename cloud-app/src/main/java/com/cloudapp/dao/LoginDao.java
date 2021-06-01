package com.cloudapp.dao;

public interface LoginDao {
	
	public int retrieveAdminLoginCredentials(String name, int userId, String password);
	
	public int retrieveManagerLoginCredentials(String name, int userId, String password);
	
	public int retrieveUserLoginCredentials(String name, int userId, String password);

}
