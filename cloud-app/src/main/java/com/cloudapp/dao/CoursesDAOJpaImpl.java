package com.cloudapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudapp.entity.Courses;
@Repository
public class CoursesDAOJpaImpl implements CoursesDAO {

	private EntityManager entityManager;
	
	@Autowired
	public CoursesDAOJpaImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Courses> findAll() {

		// create a query
		Query theQuery = entityManager.createQuery("from Courses");
		
		// execute query and get result list
		List<Courses> courses = theQuery.getResultList();
		
		// return the results		
		return courses;
	}

	@Override
	public Courses findById(int theId) {

		// get employee
		Courses theCourses = entityManager.find(Courses.class, theId);
		
		// return employee
		return theCourses;
	}

	@Override
	public void save(Courses theCourses) {

		// save or update the employee
		Courses dbCourses = entityManager.merge(theCourses);
		
		// update with id from db ... so we can get generated id for save/insert
		theCourses.setId(dbCourses.getId());
		
	}

	@Override
	public void deleteById(int theId) {

		// delete object with primary key
		Query theQuery = entityManager.createQuery("delete from Courses where id=:courseId");
		
		theQuery.setParameter("courseId", theId);
		
		theQuery.executeUpdate();
	}

}