package com.cloudapp.dao;

import java.util.List;

import com.cloudapp.entity.*;

public interface TollDao {
	
	//
	
	public void addDetails(int id, String from, String to, int count, String cities, int amount);

	public void editDetails(int id, String from, String to, int count, String cities, int amount);
	
	public List<TollGateDetails> getDetails();
	
	public void updateApprovalDataById(int id);

	public void rejectApprovedDataById(int id);
	
	//
	
	public List<TollDetails> getTollCities();
	
	public void addCityDetails(int id, String city, int nooflanes, int classAlaneno, String classAlanevehicles,	int classBlaneno, String classBlanevehicles, int classClaneno, String classClanevehicles, int classDlaneno,	String classDlanevehicles);

	public void editCityDetails(int id, String city, int nooflanes, int classAlaneno, String classAlanevehicles, int classBlaneno, String classBlanevehicles, int classClaneno, String classClanevehicles, int classDlaneno, String classDlanevehicles);
	
	public void updateCityApprovalDataById(int id);

	public void rejectCityApprovedDataById(int id);
	
	//

	public List<TollGateDetails> getApprovedTollsByLocations(String from, String to);

	public List<TollDetails> getApprovedTollsByCities(String from, String to);

}