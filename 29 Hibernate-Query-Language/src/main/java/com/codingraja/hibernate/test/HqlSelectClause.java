package com.codingraja.hibernate.test;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class HqlSelectClause {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql="SELECT cust.id, cust.fname from Customer cust";
		/*String hql="select cust.id, cust.fname from Customer as cust";*/
		Query query = session.createQuery(hql);
		List customerList = query.list();
		session.close();
		
		Iterator<Object[]> itr = customerList.iterator();
		while(itr.hasNext()){
			Object[] obj = itr.next();
			System.out.println("Customer ID :"+obj[0]+", First Name: "+obj[1]);
		}
	}

}
