package com.codingraja.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Address;
import com.codingraja.hibernate.domain.Customer;

public class SaveCustomer {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		List<Address> addresses=new ArrayList<Address>();
		Address add1=new Address("KA-501", "Roopena Agrahara", "Blore", "KA", 560068);
		Address add2=new Address("KA-1001", "BTM Layout", "Blore", "KA", 560072);
		addresses.add(add1);
		addresses.add(add2);
		
		List<Address> addresses1=new ArrayList<Address>();
		Address add3=new Address("SIL-001", "SILDA", "MEDINIPUR", "WB", 721515);
		Address add4=new Address("BA-201", "2nd Feder Road", "Bankura", "WB", 712342);
		addresses1.add(add3);
		addresses1.add(add4);
		
		Customer customer = new Customer("Babai","Mallick","babai@yahoo.com", addresses);
		Customer customer1 = new Customer("Subhadeep","Mallick","subhadeep@gmail.com", addresses1);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		
		Session session1 = factory.openSession();
		Transaction transaction1 = session1.beginTransaction();
		session1.save(customer1);
		transaction1.commit();
		session1.close();
		System.out.println("Object has been saved successfully");
	}

}
