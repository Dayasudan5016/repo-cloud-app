package com.cloudapp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudapp.entity.Courses;

@Repository
public class CoursesDAOImpl implements CoursesDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public CoursesDAOImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}

	@Override
	public List<Courses> findAll() {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Courses> theQuery= currentSession.createQuery("from Courses",Courses.class);
		List<Courses> courses= theQuery.getResultList();	
		return courses;
	}

	@Override
	public Courses findById(int theId) {
		Session currentSession=entityManager.unwrap(Session.class);
		Courses theCourses= currentSession.get(Courses.class, theId);
		return theCourses;
	}

	@Override
	public void save(Courses theCourses) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theCourses);
		
	}

	@Override
	public void deleteById(int theId) {
		Session currentSession=entityManager.unwrap(Session.class);
		Query theQuery=currentSession.createQuery("delete from Courses where id=:courseId");
		theQuery.setParameter("courseId", theId);
		theQuery.executeUpdate();
		
	}

}
