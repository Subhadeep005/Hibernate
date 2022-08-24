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

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author CL Verma
 *
 */
public class CustomerDto {
	@NotEmpty(message = "First Name can't be empty!")
	private String firstName;
	@NotEmpty(message = "Last Name can't be empty!")
	private String lastName;
	@NotEmpty(message = "Email can't be empty!")
	@Email(message = "Invalid Email ID")
	private String email;
	@Pattern(regexp = "[789][0-9]{9}", message = "Invalid Mobile Number")
	private String mobile;
	@NotEmpty(message = "Password can't be empty!")
	private String password;
	private String confirmPassword;
	private Boolean newsletter = true;

	public CustomerDto() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Boolean getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(Boolean newsletter) {
		this.newsletter = newsletter;
	}
}
