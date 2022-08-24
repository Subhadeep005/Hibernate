/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.security.service;

/**
 * @author CL Verma
 *
 */
public interface LoginService {
	public String findLoggedInUsername();

	public void autologin(String username, String password);
}
