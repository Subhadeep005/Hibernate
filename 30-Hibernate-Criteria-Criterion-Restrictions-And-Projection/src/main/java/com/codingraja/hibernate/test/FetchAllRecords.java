package com.codingraja.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class FetchAllRecords {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		List<Customer> customerList = criteria.list();
		session.close();
		
		Iterator<Customer> itr = customerList.iterator();
		while(itr.hasNext()){
			Customer customer = itr.next();
			System.out.println(customer);
		}
	}
}
