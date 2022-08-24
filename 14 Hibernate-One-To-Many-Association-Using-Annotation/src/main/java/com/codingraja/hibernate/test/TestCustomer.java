package com.codingraja.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Address;
import com.codingraja.hibernate.domain.Customer;

public class TestCustomer {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		List<Address> addresses=new ArrayList<Address>();
		Address add1=new Address("KA-501", "Roopena Agrahara", "Blore", "KA", 560068);
		Address add2=new Address("KA-1001", "BTM Layout", "Blore", "KA", 560072);
		addresses.add(add1);
		addresses.add(add2);
		Customer customer = new Customer("Babai","Mallick","babai@yahoo.com", addresses);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
