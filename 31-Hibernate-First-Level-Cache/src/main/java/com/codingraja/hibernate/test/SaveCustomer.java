package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class SaveCustomer {
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory =configuration.buildSessionFactory();
		Customer customer = new Customer( "Hitesh", "Kumar", "hitesh.kumar@gmail.com", 9876543219L);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		System.out.println("Record Has Been Saved Successfully");
	}
}
