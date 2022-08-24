package com.codingraja.hibernate.test;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class RuntimeParameter {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		System.out.println("Enter Custome id : ");
		Scanner scanner = new Scanner(System.in);
		long custId=scanner.nextLong();
		
		//Using Label
		/*String hql="from Customer cust WHERE cust.id=:cid";
		Query query = session.createQuery(hql);
		query.setParameter("cid", custId);*/
		
		String hql="from Customer cust WHERE cust.id=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, custId);
		
		List list = query.list();
		Customer customer = (Customer)list.get(0);
		System.out.println(customer);
		session.close();
		}
}
