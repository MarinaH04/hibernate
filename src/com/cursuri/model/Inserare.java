package com.cursuri.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;





public class Inserare {
	public static SessionFactory connect() {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cursuri.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		return sf;
	}
	
	
		
	
	public static void insera(int idcurs,String nume) {
		Session session = connect().openSession();
		Transaction tx = session.beginTransaction();
		Cursuri curs = new Cursuri();
		curs.setIdCurs(idcurs);
		curs.setNumeCurs(nume);
		session.save(curs);
		tx.commit();
	}
	
	public static void modifica(int idcurs, String numecurs) {
		Session session = connect().openSession();
		Transaction tx = session.beginTransaction();
		Cursuri curs = (Cursuri) session.load(Cursuri.class, idcurs);
		curs.setNumeCurs(numecurs);
		session.update(curs);
		tx.commit();
	}
	
	
	public static void delete(int idcurs) {
		Session session = connect().openSession();
		Transaction tx = session.beginTransaction();
		Cursuri curs = (Cursuri) session.load(Cursuri.class, idcurs);
		session.delete(curs);
		tx.commit();
	}


	
}
