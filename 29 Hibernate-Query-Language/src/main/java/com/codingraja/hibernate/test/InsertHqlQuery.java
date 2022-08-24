package com.codingraja.hibernate.test;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Customer;

public class InsertHqlQuery {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql="INSERT INTO OrderView(id,itemName,price)"
							+" SELECT ord.id, ord.itemName, ord.price FROM Order ord";
		Query query = session.createQuery(hql);
		
		Transaction transaction = session.beginTransaction();
		query.executeUpdate();
		transaction.commit();
		session.close();
		
		System.out.println("Dump is Created");
		}
	}
