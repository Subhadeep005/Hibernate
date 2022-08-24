package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Address;

public class TestAddress {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Address address = new Address("111", "Rupena Agrahara", "Blore", "KA","560068");
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(address);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
