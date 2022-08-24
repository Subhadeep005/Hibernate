package com.program.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.program.hibernate.domain.Product;

public class SaveOrUpdateProduct {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //Configuration is a class.
		//configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory(); //SessionFactory is a interface.
		
		Session session = factory.openSession();
		Transaction txn=session.beginTransaction();
		Product product = session.get(Product.class, new Long(8));
		//Product product = new Product("Mac", "Micromax Bolt", "Apple", 75000.00);
		product.setName("Samsung Mobile");
		product.setModel("Samsung Galaxy");
		product.setBrand("Samsung Smart Mobile");
		product.setPrice(50000);
		//If the identifier exist, it will call update method else the save method will be called. 
		//session.saveOrUpdate(product);
		session.saveOrUpdate("One Plus",product);
		
		System.out.println("Product Id :"+ product.getId());
		System.out.println("Model :"+ product.getModel());
		System.out.println("Brand :"+ product.getBrand());
		System.out.println("Price :"+ product.getPrice());
		txn.commit();
		session.close();
		System.out.println("Data Updated Successfully");
	}

}
