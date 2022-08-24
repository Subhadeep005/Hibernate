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

import com.codingraja.sunelectronics.core.dao.UserDao;
import com.codingraja.sunelectronics.core.domain.User;
import com.codingraja.sunelectronics.core.service.UserService;

/**
 * @author CL Verma
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.UserService#saveUser(com.
	 * codingraja.sunelectronics.core.domain.User)
	 */
	@Transactional
	public Long saveUser(User user) {
		return this.userDao.saveUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.service.UserService#updateUser(com.
	 * codingraja.sunelectronics.core.domain.User)
	 */
	@Transactional
	public void updateUser(User user) {
		this.userDao.updateUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.core.service.UserService#findUserByUsername
	 * (java.lang.String)
	 */
	@Transactional
	public User findUserByUsername(String username) {
		return this.userDao.findUserByUsername(username);
	}
}
