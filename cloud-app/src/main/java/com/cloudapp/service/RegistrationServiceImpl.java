package com.cloudapp.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudapp.dao.RegistrationDao;
import com.cloudapp.entity.ManagerRegistrationDetails;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationDao registrationDao;
	
	//Manager
	
	@Override
	public List<ManagerRegistrationDetails> getDetails() {
		
		return registrationDao.getDetailsOfAllManagers();
	}

	@Override
	public void updateApprovalDataById(int userId) {
		
		registrationDao.updateApprovalDataById(userId);
	}

	@Override
	public void rejectApprovedDataById(int userId) {
		
		registrationDao.rejectApprovedDataById(userId);	
	}

	@Override
	public void addManagerResgistrationDetails(int id, String firstName, String lastName, int age, String gender, String phoneNumber, String address, String email, String password) {
		
		registrationDao.addManagerResgistrationDetails(id, firstName, lastName, age, gender, phoneNumber, address, email, password);
	}
	
	@Override
	public void addApprovedManagerDetailsById(int id) {
		
		registrationDao.addApprovedManagerDetailsById(id);
	}

	//User

	@Override
	public void addUserResgistrationDetails(int id, String firstName, String lastName, int age, String gender, String phoneNumber, String address, String email, String password) {
		
		registrationDao.addUserResgistrationDetails(id, firstName, lastName, age, gender, phoneNumber, address, email, password);
	}

	

}
