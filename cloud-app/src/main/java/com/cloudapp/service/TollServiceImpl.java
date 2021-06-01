package com.cloudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloudapp.dao.TollDao;
import com.cloudapp.entity.*;

@Service
public class TollServiceImpl implements TollService {

	@Autowired
	private TollDao tollDao;
	
	//toll_gate_generator table
	
	@Override
	public void addDetails(int id, String from, String to, int count, String cities, int amount) {
		
		tollDao.addDetails(id, from, to, count, cities, amount);
	}

	@Override
	public void editDetails(int id, String from, String to, int count, String cities, int amount) {
		
		tollDao.editDetails(id, from, to, count, cities, amount);
	}

	@Override
	public List<TollGateDetails> getDetails() {
		
		return tollDao.getDetails();
	}

	@Override
	public void updateApprovalDataById(int id) {
		
		tollDao.updateApprovalDataById(id);
	}

	@Override
	public void rejectApprovedDataById(int id) {
		
		tollDao.rejectApprovedDataById(id);	
	}
	
	//toll_details table
	
	@Override
	public List<TollDetails> getTollCities() {
		
		return tollDao.getTollCities();
	}
	
	@Override
	public void addCityDetails(int id, String city, int nooflanes, int classAlaneno, String classAlanevehicles,	int classBlaneno, String classBlanevehicles, int classClaneno, String classClanevehicles, int classDlaneno, String classDlanevehicles) {
		
		tollDao.addCityDetails(id, city, nooflanes, classAlaneno, classAlanevehicles, classBlaneno, classBlanevehicles, classClaneno, classClanevehicles, classDlaneno, classDlanevehicles);
	}

	@Override
	public void editCityDetails(int id, String city, int nooflanes, int classAlaneno, String classAlanevehicles, int classBlaneno, String classBlanevehicles, int classClaneno, String classClanevehicles, int classDlaneno, String classDlanevehicles) {
		
		tollDao.editCityDetails(id, city, nooflanes, classAlaneno, classAlanevehicles, classBlaneno, classBlanevehicles, classClaneno, classClanevehicles, classDlaneno, classDlanevehicles);
	}
	
	@Override
	public void updateCityApprovalDataById(int id) {
		
		tollDao.updateCityApprovalDataById(id);
	}

	@Override
	public void rejectCityApprovedDataById(int id) {
		
		tollDao.rejectCityApprovedDataById(id);
	}

	//Home Page
	
	@Override
	public List<TollGateDetails> getApprovedTollsByLocations(String from, String to) {
		
		return tollDao.getApprovedTollsByLocations(from, to);
	}

	@Override
	public List<TollDetails> getApprovedTollsByCities(String from, String to) {
		
		return tollDao.getApprovedTollsByCities(from, to);
	}
}