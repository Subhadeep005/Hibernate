package com.codingraja.hibernate.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		
		Session session = factory.openSession();
		Customer customer = session.get(Customer.class, new Long(1));
		System.out.println("Customer ID :"+customer.getId());
		System.out.println("First Name :"+customer.getFname());
		System.out.println("Last Name :"+customer.getLname());
		System.out.println("Email :"+customer.getEmail());
		System.out.println("Customer Address");
		
		List<Address> addresses =customer.getAddress();
		Iterator<Address> itr= addresses.iterator();
		while(itr.hasNext()){
			Address address=itr.next();
			System.out.println("Customer Address ID :"+address.getId());
			System.out.println("Customer House No :"+address.getHouseNo());
			System.out.println("Customer Street :"+address.getStreet());
			System.out.println("Customer City :"+address.getCity());
			System.out.println("Customer State :"+address.getState());
			System.out.println("Customer Zipcode :"+address.getZipcode());
		}
		session.close();;
		System.out.println("Object has been saved successfully");
	}

}
