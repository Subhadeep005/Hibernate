package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class TestCustomer {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Customer customer = new Customer("Subhadeep", "subha005@gmail.com", "9066074856");
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		/*long id=(Long)*/session.save(customer);
		//System.out.println(id);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
