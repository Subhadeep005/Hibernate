package com.codingraja.hibernate.test;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;
import com.codingraja.hibernate.domain.Order;

public class HqlWhereClause {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql="from Order ord WHERE ord.price > 50000";
		Query query = session.createQuery(hql);
		List<Order> orderList = query.list();
		session.close();
		
		Iterator<Order> itr = orderList.iterator();
		while(itr.hasNext()){
			Order order = itr.next();
			System.out.println(order);
		}
	}

}
