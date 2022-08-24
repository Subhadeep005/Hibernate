package com.codingraja.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Order;
import com.codingraja.hibernate.domain.Customer;

public class GetCustomer {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		
		/*This Is bidirectional One-To-One association, so if you have Customer ID 
		then you can fetch Customer record as well as Orders of Customer*/
		Session session = factory.openSession();
		Customer customer = session.get(Customer.class, new Long(1));
		List<Order> orders = customer.getOrders();
		session.close();
		
		System.out.println("********Fetching Customer and Orders using Customer Id********");
		System.out.println("Customer ID :"+customer.getId());
		System.out.println("Customer First Name :"+customer.getFname());
		System.out.println("Customer Last Name :"+customer.getLname());
		System.out.println("Customer Email :"+customer.getEmail());
		System.out.println("Customer Mobile :"+customer.getMobile());
		
		Iterator it = orders.iterator();
		while(it.hasNext()){
			Order order=(Order)it.next();
			System.out.println("Order ID : "+order.getId());
			System.out.println("Product Name : "+order.getProductName());
			System.out.println("Brand : "+order.getBrand());
			System.out.println("Model : "+order.getModel());
			System.out.println("Price : "+order.getPrice());
		}
		
		/*if you have Order ID then you can fetch both Customer Order and Customer record, because this is bidirectional.*/
		Session session1 = factory.openSession();
		Order orders1 = session1.get(Order.class, new Long(1));
		Customer customer1=orders1.getCustomer();
		session1.close();
		
		System.out.println("********Fetching Customer and Order using Order Id********");
		System.out.println("Customer Id :"+customer1.getId());
		System.out.println("Customer First Name :"+customer1.getFname());
		System.out.println("Customer Last Name : "+customer1.getLname());
		System.out.println("Customer Email : "+customer1.getEmail());
		System.out.println("Customer Mobile : "+customer1.getMobile());
		System.out.println("Order ID : "+orders1.getId());
		System.out.println("Product Name : "+orders1.getProductName());
		System.out.println("Brand : "+orders1.getBrand());
		System.out.println("Model : "+orders1.getModel());
		System.out.println("Price : "+orders1.getPrice());
		System.out.println("Object has been saved successfully");
	}

}
