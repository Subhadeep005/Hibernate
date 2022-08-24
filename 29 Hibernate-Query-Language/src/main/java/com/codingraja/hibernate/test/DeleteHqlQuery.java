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

public class DeleteHqlQuery {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Order id : ");
		long ordId=scanner.nextLong();
		
		String hql="delete from Order ord where ord.id=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, ordId);
		
		Transaction transaction = session.beginTransaction();
		query.executeUpdate();
		transaction.commit();
		session.close();
		
		System.out.println("Order Record Hasbeen Deleted");
		}
	}
