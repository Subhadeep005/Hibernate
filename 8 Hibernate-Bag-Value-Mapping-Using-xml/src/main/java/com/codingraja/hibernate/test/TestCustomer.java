package com.codingraja.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class TestCustomer {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		List<Long> list=new ArrayList<Long>();
		list.add(4256718L);
		list.add(11111111L);
		list.add(92882392L);
		list.add(419272929L);
		list.add(79256282L);
		list.add(762378778L);
		Customer customer = new Customer("Subhadeep","Mallick","subhadeep@gmail.com", list);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}
}
