/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.order.service.exception;

/**
 * @author CL Verma
 *
 */
public class AddToCartException extends Exception {
	private static final long serialVersionUID = 1L;

	public AddToCartException() {
	}

	public AddToCartException(String message, Throwable cause) {
		super(message, cause);
	}

	public AddToCartException(String message) {
		super(message);
	}

	public AddToCartException(Throwable cause) {
		super(cause);
	}
}
