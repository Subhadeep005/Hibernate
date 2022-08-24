package com.program.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.program.hibernate.domain.Product;

public class LoadProduct {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //Configuration is a class.
		//configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory(); //SessionFactory is a interface.
		
		Session session = factory.openSession();
		Product product = session.load(Product.class, new Long(5));
		//Product product = session.load(Product.class, new Long(4));
		System.out.println("Product Id :"+ product.getId());
		System.out.println("Model :"+ product.getModel());
		System.out.println("Brand :"+ product.getBrand());
		System.out.println("Price :"+ product.getPrice());
		session.close();
	}

}
