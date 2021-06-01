package com.cloudapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cloudapp.entity.TollDetails;
import com.cloudapp.entity.TollGateDetails;

@Repository
@Transactional
public class TollDaoImpl implements TollDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addDetails(int id, String from, String to, int count, String cities, int amount) {
		
		String query = "INSERT INTO toll_gate_generator(id, from_place, to_place, no_of_tolls, cities_crossing_by, avg_rate, approval) VALUES(?,?,?,?,?,?,?)";
		jdbcTemplate.update(query, id, from, to, count, cities, amount, "not approved");
	}

	@Override
	public void editDetails(int id, String from, String to, int count, String cities, int amount) {
		
		String query = "UPDATE toll_gate_generator SET from_place=?, to_place=?, no_of_tolls=?, cities_crossing_by=?, avg_rate=?, approval=? WHERE id=?";
		jdbcTemplate.update(query, from, to, count, cities, amount, "not approved", id);
	}
	
	@Override
	public List<TollGateDetails> getDetails() {
		
		String query = "SELECT * from toll_gate_generator";
		RowMapper<TollGateDetails> rowMapper = new BeanPropertyRowMapper<TollGateDetails>(TollGateDetails.class);
		List<TollGateDetails> list = jdbcTemplate.query(query, rowMapper);
		
		return list;
	}

	@Override
	public void updateApprovalDataById(int id) {
		
		String query = "UPDATE toll_gate_generator SET approval='approved' WHERE id=?";
		jdbcTemplate.update(query, id);		
	}

	@Override
	public void rejectApprovedDataById(int id) {
		
		String query = "UPDATE toll_gate_generator SET approval='rejected' WHERE id=?";
		jdbcTemplate.update(query, id);
	}
	
	//
	
	@Override
	public void addCityDetails(int id, String city, int nooflanes, int classAlaneno, String classAlanevehicles,	int classBlaneno, String classBlanevehicles, int classClaneno, String classClanevehicles, int classDlaneno, String classDlanevehicles) {
		
		String query = "INSERT INTO toll_details (toll_id, highway_city, no_of_lanes, class_A_lane_no, class_A_lane_vehicles, class_B_lane_no, class_B_lane_vehicles, class_C_lane_no, class_C_lane_vehicles, class_D_lane_no, class_d_lane_vehicles, approval) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(query, id, city, nooflanes, classAlaneno, classAlanevehicles, classBlaneno, classBlanevehicles, classClaneno, classClanevehicles, classDlaneno, classDlanevehicles, "not approved");
	}

	@Override
	public void editCityDetails(int id, String city, int nooflanes, int classAlaneno, String classAlanevehicles, int classBlaneno, String classBlanevehicles, int classClaneno, String classClanevehicles, int classDlaneno, String classDlanevehicles) {
		
		String query = "UPDATE toll_details SET highway_city=?, no_of_lanes=?, class_A_lane_no=?, class_A_lane_vehicles=?, class_B_lane_no=?, class_B_lane_vehicles=?, class_C_lane_no=?, class_C_lane_vehicles=?, class_D_lane_no=?, class_D_lane_vehicles=?, approval=? WHERE toll_id=?";
		jdbcTemplate.update(query, city, nooflanes, classAlaneno, classAlanevehicles, classBlaneno, classBlanevehicles, classClaneno, classClanevehicles, classDlaneno, classDlanevehicles, "not approved", id);
	}
	
	@Override
	public List<TollDetails> getTollCities() {
		
		String query = "SELECT * from toll_details";
		RowMapper<TollDetails> rowMapper = new BeanPropertyRowMapper<TollDetails>(TollDetails.class);
		List<TollDetails> list = jdbcTemplate.query(query, rowMapper);
		
		return list;
	}
	
	@Override
	public void updateCityApprovalDataById(int id) {
		
		String query = "UPDATE toll_details SET approval='approved' WHERE toll_id=?";
		jdbcTemplate.update(query, id);
	}

	@Override
	public void rejectCityApprovedDataById(int id) {
		
		String query = "UPDATE toll_details SET approval='rejected' WHERE toll_id=?";
		jdbcTemplate.update(query, id);
	}
	
	//

	@Override
	public List<TollGateDetails> getApprovedTollsByLocations(String from, String to) {
		
		String query = "SELECT * from toll_gate_generator WHERE from_place=? AND to_place=? AND approval=? ORDER BY id";
		RowMapper<TollGateDetails> rowMapper = new BeanPropertyRowMapper<TollGateDetails>(TollGateDetails.class);
		List<TollGateDetails> list = jdbcTemplate.query(query, rowMapper, from, to, "approved");
		
		return list;
	}

	@Override
	public List<TollDetails> getApprovedTollsByCities(String from, String to) {
		
		String query1 = "SELECT cities_crossing_by from toll_gate_generator WHERE from_place=? AND to_place=? AND approval=?";
		RowMapper<TollGateDetails> rowMapper1 = new BeanPropertyRowMapper<TollGateDetails>(TollGateDetails.class);
		TollGateDetails tollGateDetails = jdbcTemplate.queryForObject(query1, rowMapper1, from, to, "approved");
		
		String cities = tollGateDetails.getCitiesCrossingBy();
		
		String str[] = cities.split(", ");
		List<TollDetails> list = new ArrayList<TollDetails>();
		RowMapper<TollDetails> rowMapper2 = new BeanPropertyRowMapper<TollDetails>(TollDetails.class);
		
		for(String n : str) {
			String query2 = "SELECT * from toll_details WHERE highway_city=? AND approval=?";
			TollDetails tollDetails = jdbcTemplate.queryForObject(query2, rowMapper2, n, "approved");
			list.add(tollDetails);
		}
		
		return list;
	}
}