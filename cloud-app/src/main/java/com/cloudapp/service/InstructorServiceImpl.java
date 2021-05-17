package com.cloudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudapp.dao.InstructorDao;

/*
 * A Service Implementation class which implements instructor service interface
 */
@Service
public class InstructorServiceImpl implements InstructorService {

	// defining a field
	@Autowired
	private InstructorDao instructorDao;

	@Override
	public void saveInstructor() {
		instructorDao.saveInstructor();

	}

	@Override
	public void deleteInstructor(int instructorId) {
		instructorDao.deleteInstructor(instructorId);

	}

	@Override
	public void getInstructor() {
		instructorDao.getInstructor();

	}

	@Override
	public void saveInstructorDetails() {
		instructorDao.saveInstructorDetails();
	}

	@Override
	public void deleteInstructorDetails(int instructoDetailsId) {
		instructorDao.deleteInstructorDetails(instructoDetailsId);

	}

	@Override
	public void getInstructorDetails(int instructorDetailsId) {
		instructorDao.getInstructorDetails(instructorDetailsId);

	}

	@Override
	public void saveCourses() {
		instructorDao.saveCourses();

	}

	@Override
	public void deleteCourses(int courseId) {
		instructorDao.deleteCourses(courseId);

	}

	@Override
	public void getCourses(int courseId) {
		instructorDao.getCourses(courseId);

	}

	@Override
	public void doLazyLoading() {
		instructorDao.doLazyLoading();

	}

}