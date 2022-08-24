package com.codingraja.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.codingraja.hibernate.domain.Customer;
import com.codingraja.hibernate.domain.Order;

public class TestProjection {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		/*Criteria criteria = session.createCriteria(Customer.class);
		criteria.setProjection(Projections.rowCount());
		List rowCount = criteria.list();
		System.out.println("Number of Row : "+rowCount.get(0));*/
		
		//Aggregation Using Projection 
		/*Criteria criteria = session.createCriteria(Order.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.avg("price"));
		projectionList.add(Projections.min("price"));
		projectionList.add(Projections.max("price"));
		projectionList.add(Projections.sum("price"));
		projectionList.add(Projections.count("price"));
		
		criteria.setProjection(projectionList);
		List<Object[]> agg = criteria.list();
		Object[] obj = agg.get(0);
		
		System.out.println("Avg Price : "+obj[0]);
		System.out.println("Min Price : "+obj[1]);
		System.out.println("Max Price : "+obj[2]);
		System.out.println("Sum of  Price : "+obj[3]);
		System.out.println("No of  order : "+obj[4]);*/
		
		
		/*Criteria criteria2= session.createCriteria(Order.class);
		criteria2.setProjection(Projections.property("itemName"));
		List<String> itemList = criteria2.list();
		for(String str : itemList){
			System.out.println(str);
		}*/
		
		Criteria criteria3= session.createCriteria(Order.class);
		ProjectionList projectionList2 = Projections.projectionList();
		projectionList2.add(Projections.property("itemName"));
		projectionList2.add(Projections.property("price"));
		criteria3.setProjection(projectionList2);
		
		List<Object[]> itemList = criteria3.list();
		for(Object[] obj1 : itemList){
			System.out.println("Item Name : "+obj1[0] +", Price : "+obj1[1]);
		}
		
		session.close();
		
	}
}
