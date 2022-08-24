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

public class UpdateHqlQuery {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer id : ");
		long custId=scanner.nextLong();
		System.out.println("Enter Mobile : ");
		long mobile=scanner.nextLong();
		System.out.println("Enter Email : ");
		String email=scanner.next();
		//scanner.nextLine();
		
		String hql="update Customer cust set cust.email=?, cust.mobile=?" +" where cust.id=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, email);
		query.setParameter(1, mobile);
		query.setParameter(2, custId);
		
		Transaction transaction = session.beginTransaction();
		query.executeUpdate();
		transaction.commit();
		session.close();
		
		System.out.println("Customer Record Hasbeen Updated");
		}
	}
