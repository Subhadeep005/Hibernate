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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.core.dao.ContactusDao;
import com.codingraja.sunelectronics.core.domain.Contactus;
import com.codingraja.sunelectronics.core.service.ContactusService;

/**
 * @author CL Verma
 *
 */
@Service
@Transactional
public class ContactusServiceImpl implements ContactusService {

	@Autowired
	private ContactusDao contactusDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.ContactusService#
	 * saveContactusForm(com.codingraja.sunelectronics.core.domain.Contactus)
	 */
	public Long saveContactusForm(Contactus contactus) {
		return this.contactusDao.saveContactusForm(contactus);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.ContactusService#
	 * findContactDetailById(java.lang.Long)
	 */
	public Contactus findContactDetailById(Long id) {
		return this.contactusDao.findContactDetailById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.ContactusService#
	 * findAllContactDetails()
	 */
	public List<Contactus> findAllContactDetails() {
		return this.contactusDao.findAllContactDetails();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.ContactusService#
	 * findAllContactDetails(java.lang.Integer)
	 */
	public List<Contactus> findAllContactDetails(Integer limit) {
		return this.contactusDao.findAllContactDetails(limit);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.ContactusService#
	 * findContactDetailsByDate(java.lang.String)
	 */
	public List<Contactus> findContactDetailsByDate(String date) {
		return this.contactusDao.findContactDetailsByDate(date);
	}

}
