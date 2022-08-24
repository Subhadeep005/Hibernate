package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class GetCustomer2 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory =configuration.buildSessionFactory();
		
		Session session1 = factory.openSession();
		Customer customer1 =  session1.get(Customer.class, 1L);
		session1.close();
		
		Session session2 = factory.openSession();
		Customer customer2 =  session2.get(Customer.class, 1L);
		session2.close();
		
		System.out.println("Customer Name : "+customer1.getFirstName());
		System.out.println("Customer Name : "+customer2.getFirstName());
	}

}
