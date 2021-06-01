package com.cloudapp.service;

import java.util.List;

import com.cloudapp.entity.*;

public interface TollService {
	
	//toll_gate_generator table
	
	public void addDetails(int id, String from, String to, int count, String cities, int amount);

	public void editDetails(int id, String from, String to, int count, String cities, int amount);
	
	public List<TollGateDetails> getDetails();
	
	public void updateApprovalDataById(int id);

	public void rejectApprovedDataById(int id);
	
	//toll_details table
	
	public List<TollDetails> getTollCities();
	
	public void addCityDetails(int id, String city, int nooflanes, int classAlaneno, String classAlanevehicles,	int classBlaneno, String classBlanevehicles, int classClaneno, String classClanevehicles, int classDlaneno,	String classDlanevehicles);
	
	public void editCityDetails(int id, String city, int nooflanes, int classAlaneno, String classAlanevehicles,	int classBlaneno, String classBlanevehicles, int classClaneno, String classClanevehicles, int classDlaneno,	String classDlanevehicles);
	
	public void updateCityApprovalDataById(int id);

	public void rejectCityApprovedDataById(int id);
	
	//HomePage

	public List<TollGateDetails> getApprovedTollsByLocations(String from, String to);

	public List<TollDetails> getApprovedTollsByCities(String from, String to);

}