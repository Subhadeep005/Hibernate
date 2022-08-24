/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.core.web.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author CL Verma
 *
 */
public class UserDto {
	@NotEmpty(message = "Username can't be empty!")
	private String username;
	@NotEmpty(message = "Password can't be empty!")
	private String password;

	public UserDto() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
