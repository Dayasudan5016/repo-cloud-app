package com.cloudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudapp.dao.CoursesDAO;
import com.cloudapp.entity.Courses;
@Service
public class CoursesServiceImpl implements CoursesService {

	private CoursesDAO coursesDAO;
	
	@Autowired
	public CoursesServiceImpl(@Qualifier("coursesDAOJpaImpl") CoursesDAO theCoursesDAO) {
		coursesDAO = theCoursesDAO;
	}
	
	@Override
	@Transactional
	public List<Courses> findAll() {
		return coursesDAO.findAll();
	}

	@Override
	@Transactional
	public Courses findById(int theId) {
		return coursesDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Courses theCourses) {
		coursesDAO.save(theCourses);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		coursesDAO.deleteById(theId);
	}

}

