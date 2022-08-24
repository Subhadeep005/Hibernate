package com.codingraja.hibernate.test;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class HqlFromClause {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql="FROM Customer";
		/*String hql="from Customer cust";
		String hql="from Customer as cust";*/
		Query query = session.createQuery(hql);
		List<Customer> customerList = query.list();
		session.close();
		
		Iterator<Customer> itr = customerList.iterator();
		while(itr.hasNext()){
			Customer customer = itr.next();
			System.out.println(customer);
		}
	}

}
