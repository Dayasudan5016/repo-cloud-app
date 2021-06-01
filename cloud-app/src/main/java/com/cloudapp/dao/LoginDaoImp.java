package com.cloudapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cloudapp.entity.LoginCredentials;

@Transactional
@Repository
public class LoginDaoImp implements LoginDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Admin
	
	@Override
	public int retrieveAdminLoginCredentials(String name, int userId, String password) {
		
		String query = "SELECT * from login_credentials WHERE name=?";
		RowMapper<LoginCredentials> rowMapper = new BeanPropertyRowMapper<LoginCredentials>(LoginCredentials.class);
		LoginCredentials loginCredentials  = jdbcTemplate.queryForObject(query, rowMapper, name);
		
		if(!(loginCredentials.getUserType().equals("Admin"))) {
			return -1;
		}
		else if(loginCredentials.getUserId()==userId && loginCredentials.getPassword().equals(password)) {
			return 1;
		}
		return 0;
	}
	
	//Manager
	
	@Override
	public int retrieveManagerLoginCredentials(String name, int userId, String password) {
		
		String query = "SELECT * from login_credentials WHERE name=?";
		RowMapper<LoginCredentials> rowMapper = new BeanPropertyRowMapper<LoginCredentials>(LoginCredentials.class);
		LoginCredentials loginCredentials  = jdbcTemplate.queryForObject(query, rowMapper, name);
		
		if(!(loginCredentials.getUserType().equals("Manager"))) {
			return -1;
		}
		else if(loginCredentials.getUserId()==userId && loginCredentials.getPassword().equals(password)) {
			return 1;
		}
		return 0;
	}
	
	//User

	@Override
	public int retrieveUserLoginCredentials(String name, int userId, String password) {
		
		String query = "SELECT * from login_credentials WHERE name=?";
		RowMapper<LoginCredentials> rowMapper = new BeanPropertyRowMapper<LoginCredentials>(LoginCredentials.class);
		LoginCredentials loginCredentials  = jdbcTemplate.queryForObject(query, rowMapper, name);
		
		if(!(loginCredentials.getUserType().equals("User"))) {
			return -1;
		}
		else if(loginCredentials.getUserId()==userId && loginCredentials.getPassword().equals(password)) {
			return 1;
		}
		return 0;
	}
}