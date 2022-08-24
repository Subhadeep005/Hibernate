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

import java.util.List;

import com.codingraja.sunelectronics.core.domain.Contactus;

/**
 * @author CL Verma
 *
 */
public interface ContactusDao {
	public Long saveContactusForm(Contactus contactus);

	public Contactus findContactDetailById(Long id);

	public List<Contactus> findAllContactDetails();

	public List<Contactus> findAllContactDetails(Integer limit);

	public List<Contactus> findContactDetailsByDate(String date);
}
