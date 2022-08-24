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
		
		Map<String, String> map=new TreeMap<String, String>();
		map.put("RAM", "4GB");
		map.put("Memory", "1TB");
		map.put("Processor", "Intel i5");
		Product product = new Product("Dell Laptop","Dell-Inspiron","DELL", 1000L , map);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		System.out.println("Object has been saved successfully");
	}

}
