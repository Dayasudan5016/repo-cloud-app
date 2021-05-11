package com.cloudapp.hibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.cloudapp.entity.Student;

public class CreateStudent {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			System.out.println("Creating new student object.");
			Student tempStudent1=new Student("Ajay","K","ajay@gmail.com");
			Student tempStudent2=new Student("Priya","R","priya@gmail.com");
			Student tempStudent3=new Student("Vinay","S","vinay@gmail.com");
			session.beginTransaction();
			System.out.println("Saving the students.....");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.getTransaction().commit();
			System.out.println("Done!!");
		}
		finally {
			factory.close();
			session.close();
		}
	}
}