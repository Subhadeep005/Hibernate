package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Address;
import com.codingraja.hibernate.domain.Customer;

public class SaveCustomer {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Address add=new Address("KA-1001", "BTM Layout", "Bangalore", "Karnataka", 560076);
		Customer customer = new Customer("Subhadep","Mallick","subhadeep@gmail.com", 8345096411L, add);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
