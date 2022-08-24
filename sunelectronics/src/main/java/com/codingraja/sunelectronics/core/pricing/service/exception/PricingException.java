/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.pricing.service.exception;

/**
 * @author CL Verma
 *
 */
public class PricingException extends Exception {
	private static final long serialVersionUID = 1L;

	public PricingException() {
	}

	public PricingException(String message, Throwable cause) {
		super(message, cause);
	}

	public PricingException(String message) {
		super(message);
	}

	public PricingException(Throwable cause) {
		super(cause);
	}
}
