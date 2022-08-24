/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.web.checkout.model;

import java.io.Serializable;

/**
 * A form to model checking out as guest
 * 
 * @author CL Verma
 *
 */
public class OrderInfoForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
