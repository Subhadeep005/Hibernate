package com.codingraja.hibernate.test;


import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class AssociationAndJoin {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		/*String hql="SELECT cust.fname, ord.itemName from Customer cust,"+
							"Order ord where cust.id=ord.customer.id";*/
		
		/*String hql="SELECT cust.fname, ord.itemName from Customer cust "+
				"INNER JOIN Order ord ON cust.id=ord.customer.id";*/
		
		/*String hql="SELECT cust.fname, ord.itemName from Customer cust "+
				"LEFT JOIN Order ord ON cust.id=ord.customer.id";*/
		
		String hql="SELECT cust.fname, ord.itemName from Customer cust "+
				"RIGHT JOIN Order ord ON cust.id=ord.customer.id";
		
		//Full Join is Not Supported By MySQL
		/*String hql="SELECT cust.fname, ord.itemName from Customer cust "+
				"FULL JOIN Order ord ON cust.id=ord.customer.id";*/
		
		Query query = session.createQuery(hql);
		List customerList = query.list();
		session.close();
		
		Iterator<Object[]> itr = customerList.iterator();
		while(itr.hasNext()){
			Object[] obj = itr.next();
			System.out.println("Customer Name : "+obj[0]+", Item Name : "+obj[1]);
		}
	}

}
