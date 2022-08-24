/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.core.dao.CustomerDao;
import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.core.service.CustomerService;

/**
 * @author CL Verma
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.service.CustomerService#saveCustomer(
	 * com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Transactional
	public Long saveCustomer(Customer customer) {
		return this.customerDao.saveCustomer(customer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.CustomerService#
	 * findCustomerById(java.lang.Long)
	 */
	@Transactional
	public Customer findCustomerById(Long id) {
		return this.customerDao.findCustomerById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.service.CustomerService#updateCustomer
	 * (com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Transactional
	public void updateCustomer(Customer customer) {
		this.customerDao.updateCustomer(customer);
	}

}
