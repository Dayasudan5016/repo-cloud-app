package com.cloudapp.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cloudapp.entity.ManagerRegistrationDetails;

@Repository
@Transactional
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Manager
	
	@Override
	public List<ManagerRegistrationDetails> getDetailsOfAllManagers() {
		
		String query = "SELECT * from manager_registration_details";
		RowMapper<ManagerRegistrationDetails> rowMapper = new BeanPropertyRowMapper<ManagerRegistrationDetails>(ManagerRegistrationDetails.class);
		List<ManagerRegistrationDetails> list = jdbcTemplate.query(query, rowMapper);

		return list;
	}

	@Override
	public void updateApprovalDataById(int userId) {
		
		String query = "UPDATE manager_registration_details SET approval='approved' WHERE id=?";
		jdbcTemplate.update(query, userId);		
	}

	@Override
	public void rejectApprovedDataById(int userId) {
		
		String query = "UPDATE manager_registration_details SET approval='rejected' WHERE id=?";
		jdbcTemplate.update(query, userId);
		String query2 = "DELETE from login_credentials WHERE user_id=?";
		jdbcTemplate.update(query2, userId);		
	}

	@Override
	public void addManagerResgistrationDetails(int id, String firstName, String lastName, int age, String gender, String phoneNumber, String address, String email, String password) {
		
		String query = "INSERT into manager_registration_details(id, first_name, last_name, age, phone_number, address, gender, email, password, approval) VALUES(?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(query, id, firstName, lastName, age, phoneNumber, address, gender, email, password, "not approved");
	}

	@Override
	public void addApprovedManagerDetailsById(int id) {
		
		String query1 = "SELECT * from manager_registration_details WHERE id=?";
		String query2 = "INSERT INTO login_credentials(user_id, user_type, name, password) VALUES(?,?,?,?)";
		
		RowMapper<ManagerRegistrationDetails> rowMapper = new BeanPropertyRowMapper<ManagerRegistrationDetails>(ManagerRegistrationDetails.class);
		ManagerRegistrationDetails managerRegistrationDetails = jdbcTemplate.queryForObject(query1, rowMapper, id);
		jdbcTemplate.update(query2,	managerRegistrationDetails.getId(),	"Manager", managerRegistrationDetails.getFirstName()+" "+managerRegistrationDetails.getLastName(), managerRegistrationDetails.getPassword());
	}
	
	//User

	@Override
	public void addUserResgistrationDetails(int id, String firstName, String lastName, int age, String gender, String phoneNumber, String address, String email, String password) {
		
		String query1 = "INSERT into user_registration_details(id, first_name, last_name, age, phone_number, address, gender, email, password, approval) VALUES(?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(query1, id, firstName, lastName, age, phoneNumber, address, gender, email, password, "auto approved");
		
		String query2 = "INSERT INTO login_credentials(user_id, user_type, name, password) VALUES(?,?,?,?)";
		jdbcTemplate.update(query2, id, "User", firstName+" "+lastName, password);
	}
}