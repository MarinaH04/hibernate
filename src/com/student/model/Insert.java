package com.student.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




public class Insert {
	public static void main(String[] args) {
		Student student = new Student();
		student.setIdstudent(4);
		student.setUsername("andreea");
		student.setEmail("andreea@yahoo.com");
		student.setPassword("12345");
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(student);
		
		tx.commit();
		System.out.println(student);
	}
}
