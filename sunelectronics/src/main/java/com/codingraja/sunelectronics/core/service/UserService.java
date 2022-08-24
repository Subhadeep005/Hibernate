/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.core.service;

import com.codingraja.sunelectronics.core.domain.User;

/**
 * @author CL Verma
 *
 */
public interface UserService {
	public Long saveUser(User user);

	public void updateUser(User user);

	public User findUserByUsername(String username);
}
