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

public class TestOrder {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		//Asc Order By Price
		/*Criteria criteria = session.createCriteria(Order.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("itemName"));
		projectionList.add(Projections.property("price"));
		criteria.setProjection(projectionList);
		criteria.addOrder(org.hibernate.criterion.Order.asc("price"));
		
		List<Object[]> itemList = criteria.list();
		for(Object[] obj1 : itemList){
			System.out.println("Item Name : "+obj1[0] +", Price : "+obj1[1]);
		}*/
		
		//DESC Order by OrderId
		Criteria criteria = session.createCriteria(Order.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("itemName"));
		projectionList.add(Projections.property("price"));
		criteria.setProjection(projectionList);
		criteria.addOrder(org.hibernate.criterion.Order.desc("id"));
		
		List<Object[]> itemList = criteria.list();
		for(Object[] obj1 : itemList){
			System.out.println("Item Name : "+obj1[0] +", Price : "+obj1[1]);
		}
		
		session.close();
		
	}
}
