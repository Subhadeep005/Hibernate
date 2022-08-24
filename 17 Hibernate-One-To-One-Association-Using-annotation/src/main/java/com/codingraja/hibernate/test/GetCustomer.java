package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Address;
import com.codingraja.hibernate.domain.Customer;

public class GetCustomer {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		
		/*This Is One-To-One association, so if you have Customer ID 
		then you can fetch Customer record as well as Address of Customer*/
		Session session = factory.openSession();
		Customer customer = session.get(Customer.class, new Long(2));
		Address address = customer.getAddress();
		session.close();
		
		System.out.println("Customer ID :"+customer.getId());
		System.out.println("Customer City :"+address.getCity());
		System.out.println("Street :"+address.getStreet());
		
		/*if you have Address ID then you can fetch only Address not Customer record, because this is unidirectional.*/
		Session session1 = factory.openSession();
		Address address1 = session1.get(Address.class, new Long(2));
		System.out.println("State :"+address1.getState());
		System.out.println("Zipcode :"+address1.getZipcode());
		session1.close();
		System.out.println("Object has been saved successfully");
	}

}
