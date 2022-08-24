package com.codingraja.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.codingraja.hibernate.domain.Customer;
import com.codingraja.hibernate.domain.Order;

public class SaveCustomer {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("Apple MacBook Air", "MacBook Pro", "Apple", 85000));
		orders.add(new Order("Lenovo Thinkpad", "G80", "Lenovo", 125000));
		orders.add(new Order("OPPO Smart Mobile", "F3", "OPPO", 20000));
		Customer customer = new Customer("Babai","Mallick","babai@gmail.com", 9066074856L, orders);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
