package com.cloudapp.hibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.cloudapp.entity.Student;

public class DeleteStudentData {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			int studentId=4;
			session=factory.getCurrentSession();
			session.beginTransaction();
			System.out.println("\nGetting student with id: "+studentId);
			Student myStudent=session.get(Student.class, studentId);
			System.out.println("Deleting student "+myStudent);
			session.delete(myStudent);
			System.out.println("Deleting student with id 4");
			session.createQuery("delete from Student where id=4").executeUpdate();
			session.getTransaction().commit();
			System.out.println("Done!!");
		}
		finally {
			factory.close();
		}
	}
}