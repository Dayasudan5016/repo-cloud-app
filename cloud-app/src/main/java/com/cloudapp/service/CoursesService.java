package com.cloudapp.service;

import java.util.List;

import com.example.springBoot.CRUD.entity.Courses;

public interface CoursesService {
	public List<Courses> findAll();
	
	public Courses findById(int theId);
	
	public void save(Courses theCourses);
	
	public void deleteById(int theId);
}
