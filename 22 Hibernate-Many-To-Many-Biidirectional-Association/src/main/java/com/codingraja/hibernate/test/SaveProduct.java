package com.codingraja.hibernate.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Color;
import com.codingraja.hibernate.domain.Product;

public class SaveProduct {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Set<Color> colors=new HashSet<Color>();
		Session session = factory.openSession();
		//colors.add(session.get(Color.class, new Long(1)));
		//colors.add(session.get(Color.class, new Long(2)));
		colors.add(session.get(Color.class, new Long(3)));
		colors.add(session.get(Color.class, new Long(4)));
		colors.add(session.get(Color.class, new Long(5)));
			Product product = new Product("Laptop", "Inspiron", "Dell", 45000, colors);
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(product);
			transaction.commit();
			session.close();
			System.out.println("Product is saved successfully");
	}
}
