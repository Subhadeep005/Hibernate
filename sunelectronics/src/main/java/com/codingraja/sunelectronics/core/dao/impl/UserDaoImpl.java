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

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.core.dao.UserDao;
import com.codingraja.sunelectronics.core.domain.User;

/**
 * @author CL Verma
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.dao.UserDao#saveUser(com.codingraja.
	 * sunelectronics.core.domain.User)
	 */
	@Override
	public Long saveUser(User user) {
		return (Long) this.sessionFactory.getCurrentSession().save(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.dao.UserDao#updateUser(com.codingraja.
	 * sunelectronics.core.domain.User)
	 */
	@Override
	public void updateUser(User user) {
		this.sessionFactory.getCurrentSession().update(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.dao.UserDao#findUserByUsername(java.
	 * lang.String)
	 */
	@Override
	public User findUserByUsername(String username) {
		logger.info("Calling find User By Username");
		return (User) this.sessionFactory.getCurrentSession().createCriteria(User.class)
				.add(Restrictions.eq("username", username)).list().get(0);
	}

}
