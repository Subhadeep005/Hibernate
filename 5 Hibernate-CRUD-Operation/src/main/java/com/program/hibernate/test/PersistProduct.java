package com.program.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.program.hibernate.domain.Product;

public class PersistProduct {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //Configuration is a class.
		//configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory(); //SessionFactory is a interface.
		Product product = new Product("Mac", "MacBook Pro", "Apple", 75000.00);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		//long pid= (Long)session.save(product);
		session.persist(product); //It will return void.
		transaction.commit();
		session.persist(product);
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
