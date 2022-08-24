package com.codingraja.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.codingraja.hibernate.dao.CustomerDao;
import com.codingraja.hibernate.domain.Customer;
import com.codingraja.hibernate.util.HibernateUtil;

public class CustomerDaoImpl implements CustomerDao {
	
	private SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
	
	public Long saveCustomer(Customer customer) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Long id = (Long)session.save(customer);
		transaction.commit();
		session.close();
		return id;
	}

	public void deleteCustomerById(Long id) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		transaction.commit();
		session.close();
	}

	public void updateCustomer(Customer customer) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		session.close();
	}
	
	public Customer findCustomerById(Long id) {
		Session session = this.sessionFactory.openSession();
		Customer customer = session.get(Customer.class, id);
		session.close();
		return customer;
	}

	public List<Customer> findAllCustomers() {
		Session session = this.sessionFactory.openSession();
		List<Customer> customerList = session.createCriteria(Customer.class).list();
		session.close();
		return customerList;
	}

}
