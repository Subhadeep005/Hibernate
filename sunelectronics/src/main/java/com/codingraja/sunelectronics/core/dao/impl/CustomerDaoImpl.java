/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.core.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.core.dao.CustomerDao;
import com.codingraja.sunelectronics.core.domain.Customer;

/**
 * @author CL Verma
 *
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.dao.CustomerDao#saveCustomer(com.
	 * codingraja.sunelectronics.core.domain.Customer)
	 */
	public Long saveCustomer(Customer customer) {
		return (Long) this.sessionFactory.getCurrentSession().save(customer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.dao.CustomerDao#findCustomerById(java.
	 * lang.Long)
	 */
	public Customer findCustomerById(Long id) {
		return this.sessionFactory.getCurrentSession().get(Customer.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.dao.CustomerDao#updateCustomer(com.
	 * codingraja.sunelectronics.core.domain.Customer)
	 */
	public void updateCustomer(Customer customer) {
		this.sessionFactory.getCurrentSession().update(customer);
	}

}
