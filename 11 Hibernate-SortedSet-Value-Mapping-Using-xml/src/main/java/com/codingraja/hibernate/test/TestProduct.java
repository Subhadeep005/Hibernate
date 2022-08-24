package com.codingraja.hibernate.test;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Product;

public class TestProduct {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		
		Set<String> set=new TreeSet<String>();
		set.add("Yellow");
		set.add("Brown");
		set.add("Grey");
		set.add("Green");
		set.add("White");
		Product product = new Product("T-Shirt","Polo","GAP", 1000L , set);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
