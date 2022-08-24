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
		list.add(764862L);
		list.add(791438L);
		list.add(4648291L);
		list.add(456789L);
		list.add(567890L);
		list.add(987654L);
		Customer customer = new Customer("Babai","Mallick","babai@yahoo.com", list);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
