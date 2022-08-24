package com.program.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.program.hibernate.domain.Product;

public class MergeProduct {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //Configuration is a class.
		//configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory(); //SessionFactory is a interface.
		
		Session session = factory.openSession();
		Transaction txn=session.beginTransaction();
		Product product = session.get(Product.class, new Long(5));
		product.setName("MacBook");
		product.setModel("Macbook-pro");
		product.setBrand("Apple");
		product.setPrice(75000);
		session.merge(product);
		//session.merge("Micromax",product);
		//Product product = session.load(Product.class, new Long(4));
		System.out.println("Product Id :"+ product.getId());
		System.out.println("Model :"+ product.getModel());
		System.out.println("Brand :"+ product.getBrand());
		System.out.println("Price :"+ product.getPrice());
		txn.commit();
		session.close();
		System.out.println("Data Updated Successfully");
	}

}
