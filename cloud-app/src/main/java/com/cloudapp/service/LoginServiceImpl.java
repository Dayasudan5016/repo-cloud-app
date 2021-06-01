package com.cloudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloudapp.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public int checkAdminCredentials(String name, int userId, String password) {
		
		return loginDao.retrieveAdminLoginCredentials(name, userId, password);
	}

	@Override
	public int checkManagerCredentials(String name, int userId, String password) {
		
		return loginDao.retrieveManagerLoginCredentials(name, userId, password);
	}

	@Override
	public int checkUserCredentials(String name, int userId, String password) {
		
		return loginDao.retrieveUserLoginCredentials(name, userId, password);
	}

}
