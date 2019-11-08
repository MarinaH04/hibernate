package com.student.model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class Update {
	public static void main(String[] args) {
		
	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	SessionFactory sf = con.buildSessionFactory(reg);
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	Student student = (Student) session.load(Student.class, 2);
	student.setUsername("ioana1");
	session.update(student);
	tx.commit();
}
	
}
