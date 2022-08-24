package com.program.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.program.hibernate.domain.Product;

public class DeleteProduct {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //Configuration is a class.
		//configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory(); //SessionFactory is a interface.
		Session session = factory.openSession();
		Transaction txn=session.beginTransaction();
		Product product = session.get(Product.class, new Long(10));
		//session.delete(product);
		session.delete("Galaxy", product);
		txn.commit();
		session.close();
		System.out.println("Data Updated Successfully");
	}

}
