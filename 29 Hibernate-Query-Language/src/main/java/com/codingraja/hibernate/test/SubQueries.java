package com.codingraja.hibernate.test;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class SubQueries {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql="SELECT ord.itemName, ord.price from Order ord WHERE ord.price >" +"(SELECT avg (ord.price) from Order ord)";
		
		Query query = session.createQuery(hql);
		List priceList = query.list();
		
		session.close();
		
		Iterator<Object[]> itr = priceList.iterator();
		while(itr.hasNext()){
			Object[] obj = itr.next();
			System.out.println("Item Name : "+obj[0]+", Price : "+obj[1]);
		}
	}
}
