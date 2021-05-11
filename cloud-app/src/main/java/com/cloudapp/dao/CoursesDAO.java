package com.cloudapp.dao;

import java.util.List;

import com.cloudapp.entity.Courses;

public interface CoursesDAO {
	public List<Courses> findAll();
	
	public Courses findById(int theId);
	
	public void save(Courses theCourses);
	
	public void deleteById(int theId);
}