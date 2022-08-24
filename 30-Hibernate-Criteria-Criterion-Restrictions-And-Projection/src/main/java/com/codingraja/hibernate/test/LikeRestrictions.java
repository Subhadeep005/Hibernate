package com.codingraja.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.codingraja.hibernate.domain.Order;

public class LikeRestrictions {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Order.class);
		
		/*Criterion criterion1 = Restrictions.gt("id", 2L);
		Criterion criterion2 = Restrictions.lt("id", 7L);
		LogicalExpression logicalExpression = Restrictions.and(criterion1, criterion2);
		criteria.add(logicalExpression);*/
		
		//criteria.add(Restrictions.and(Restrictions.gt("id", 2L), Restrictions.lt("id", 7L)));
		
		//criteria.add(Restrictions.and(Restrictions.like("itemName", "%p%"))); //Case Sensitive
		//criteria.add(Restrictions.and(Restrictions.ilike("itemName", "%p%"))); //Case Insensitive
		//criteria.add(Restrictions.and(Restrictions.like("itemName", null, MatchMode.ANYWHERE))); //Not throw the Exception
		//criteria.add(Restrictions.and(Restrictions.ilike("itemName", null, MatchMode.ANYWHERE))); //Throw the Exception
		criteria.add(Restrictions.and(Restrictions.like("itemName", "p", MatchMode.ANYWHERE)));
		
		List<Order> orderList = criteria.list();
		session.close();
		
		Iterator<Order> itr = orderList.iterator();
		while(itr.hasNext()){
			Order order = itr.next();
			System.out.println(order);
		}
	}
}
