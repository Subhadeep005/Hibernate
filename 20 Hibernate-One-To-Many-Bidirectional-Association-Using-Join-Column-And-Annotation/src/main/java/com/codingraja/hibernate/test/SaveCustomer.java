package com.codingraja.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Order;
import com.codingraja.hibernate.domain.Customer;

public class SaveCustomer {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		
		Order ord1=new Order("iPhone", "Apple", "iPhone 7", 70000);
		Order ord2=new Order("Samsung Galaxy", "Samsung", "Samsung Note 8", 68000);
		Order ord3=new Order("One Plus Phone", "One Plus", "One Plus 5T", 37000);
		List<Order> orders= new ArrayList<Order>();
		orders.add(ord1);
		orders.add(ord2);
		orders.add(ord3);
		
		Customer customer = new Customer("Subhadep","Mallick","subhadeep@gmail.com", 8345096411L, orders);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
