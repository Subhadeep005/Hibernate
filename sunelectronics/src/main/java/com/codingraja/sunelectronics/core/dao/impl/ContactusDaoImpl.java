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

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.core.dao.ContactusDao;
import com.codingraja.sunelectronics.core.domain.Contactus;

/**
 * @author CL Verma
 *
 */
@Repository
public class ContactusDaoImpl implements ContactusDao {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.dao.ContactusDao#saveContactusForm(com
	 * .codingraja.sunelectronics.core.domain.Contactus)
	 */
	public Long saveContactusForm(Contactus contactus) {
		return (Long) this.sessionFactory.getCurrentSession().save(contactus);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.dao.ContactusDao#findContactDetailById
	 * (java.lang.Long)
	 */
	public Contactus findContactDetailById(Long id) {
		return this.sessionFactory.getCurrentSession().get(Contactus.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.dao.ContactusDao#findAllContactDetails
	 * ()
	 */
	@SuppressWarnings("unchecked")
	public List<Contactus> findAllContactDetails() {
		return this.sessionFactory.getCurrentSession().createCriteria(Contactus.class).list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.dao.ContactusDao#findAllContactDetails
	 * (java.lang.Integer)
	 */
	@SuppressWarnings("unchecked")
	public List<Contactus> findAllContactDetails(Integer limit) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createCriteria(Contactus.class).setMaxResults(limit).list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.dao.ContactusDao#
	 * findContactDetailsByDate(java.lang.String)
	 */
	public List<Contactus> findContactDetailsByDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

}
