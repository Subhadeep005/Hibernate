package com.codingraja.hibernate.test;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class AggregateFunction {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		
		//Aggregate Function- sum(), avg(), min(), max(), and count().
		Session session = factory.openSession();
		
		//Find the sum of price column
				String hql1="SELECT sum(ord.price) from Order ord";
		
		//Find the avg of price column
				String hql2="SELECT avg(ord.price) from Order ord";
				
		//Find the min of price column
				String hql3="SELECT min(ord.price) from Order ord";
				
		//Find the max of price column
				String hql4="SELECT max(ord.price) from Order ord";
				
		//Find the number of rows
				String hql5="SELECT count(ord.price) from Order ord";
				
		
			Query query1 = session.createQuery(hql1);
			List priceSum = query1.list();
			Double sum = (Double)priceSum.get(0);
			System.out.println("Sum of Price : "+sum);
			
			Query query2 = session.createQuery(hql2);
			List priceAvg = query2.list();
			Double avg = (Double)priceAvg.get(0);
			System.out.println("Avg of Price : "+ avg);
			
			Query query3 = session.createQuery(hql3);
			List priceMin = query3.list();
			Double min = (Double)priceMin.get(0);
			System.out.println("Min of Price : "+ min);
			
			Query query4 = session.createQuery(hql4);
			List priceMax = query4.list();
			Double max = (Double)priceMax.get(0);
			System.out.println("Max of Price : "+ max);
			
			Query query5 = session.createQuery(hql5);
			List noOfOrder = query5.list();
			Long count = (Long)noOfOrder.get(0);
			System.out.println("No of Order : "+ count);
			
		session.close();
	}

}
