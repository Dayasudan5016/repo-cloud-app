package com.cloudapp.service;

public interface LoginService {
	
	public int checkAdminCredentials(String name, int userId, String password);
	
	public int checkManagerCredentials(String name, int userId, String password);
	
	public int checkUserCredentials(String name, int userId, String password);

}
