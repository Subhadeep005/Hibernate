package com.codingraja.hibernate.test;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Color;
import com.codingraja.hibernate.domain.Product;

public class GetProduct {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
			Product product = session.get(Product.class, new Long(2));
			System.out.println("Product ID :"+product.getId());
			System.out.println("Product Name :"+product.getName());
			System.out.println("Product Model :"+product.getModel());
			System.out.println("Product Brand :"+product.getBrand());
			System.out.println("Product Price :"+product.getPrice());
			System.out.println("Product Color :"+product.getColors());
			session.close();
			System.out.println("Product is Get successfully");
	}
}
