package com.cloudapp.dao;

import java.util.List;

import com.cloudapp.entity.ManagerRegistrationDetails;


public interface RegistrationDao {
	
	//Manager
	
	public List<ManagerRegistrationDetails> getDetailsOfAllManagers();
	
	public void updateApprovalDataById(int userId);
	
	public void rejectApprovedDataById(int userId);
	
	public void addManagerResgistrationDetails(int id, String firstName, String lastName, int age, String gender, String phoneNumber, String address, String email, String password);

	public void addApprovedManagerDetailsById(int id);
	
	//User
	
	public void addUserResgistrationDetails(int id, String firstName, String lastName, int age, String gender, String phoneNumber, String address, String email, String password);
}
