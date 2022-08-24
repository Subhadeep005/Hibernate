package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Color;

public class SaveColor {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();

			Color color = new Color("Silver");
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(color);
			transaction.commit();
			session.close();
			System.out.println("Color is saved successfully");
	}
}
