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
		
		/*This Is bidirectional One-To-One association, so if you have Customer ID 
		then you can fetch Customer record as well as Address of Customer*/
		Session session = factory.openSession();
		Customer customer = session.get(Customer.class, new Long(1));
		Address address = customer.getAddress();
		session.close();
		
		System.out.println("********Fetching Customer and Address using Customer Id********");
		System.out.println("Customer ID :"+customer.getId());
		System.out.println("Customer First Name :"+customer.getFname());
		System.out.println("Customer City :"+address.getCity());
		System.out.println("Street :"+address.getStreet());
		
		/*if you have Address ID then you can fetch both Customer Address and Customer record, because this is bidirectional.*/
		Session session1 = factory.openSession();
		Address address1 = session1.get(Address.class, new Long(1));
		Customer customer1=address1.getCustomer();
		session1.close();
		
		System.out.println("********Fetching Customer and Address using Address Id********");
		System.out.println("Customer Id :"+customer1.getId());
		System.out.println("Customer First Name :"+customer1.getFname());
		System.out.println("Customer City :"+address1.getCity());
		System.out.println("Street :"+address1.getStreet());
		System.out.println("Object has been saved successfully");
	}

}
