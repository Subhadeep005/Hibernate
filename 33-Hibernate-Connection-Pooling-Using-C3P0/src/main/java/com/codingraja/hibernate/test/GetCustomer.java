package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class GetCustomer {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory =configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		Customer customer =  session.get(Customer.class, 1L);
		session.close();
		
		System.out.println("Customer Name : "+customer.getFirstName());
		System.out.println("Execute MySQL Console Using this Command - SHOW STATUS LIKE 'CON%'; ");
	}

}
