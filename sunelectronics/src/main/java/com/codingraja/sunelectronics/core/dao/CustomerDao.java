/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.core.dao;

import com.codingraja.sunelectronics.core.domain.Customer;

/**
 * @author CL Verma
 *
 */
public interface CustomerDao {
	public Long saveCustomer(Customer customer);

	public Customer findCustomerById(Long id);

	public void updateCustomer(Customer customer);
}
