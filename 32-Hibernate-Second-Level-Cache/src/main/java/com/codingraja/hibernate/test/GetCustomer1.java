package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class GetCustomer1 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory =configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		Customer customer1 =  session.get(Customer.class, 2L);
		Customer customer2 =  session.get(Customer.class, 2L);
		session.close();
		
		System.out.println("Customer Name : "+customer1.getFirstName());
		System.out.println("Customer Name : "+customer2.getFirstName());
	}

}
