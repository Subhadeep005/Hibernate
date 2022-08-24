/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.order.service.exception;

/**
 * @author CL Verma
 *
 */
public class ProductOptionValidationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	protected String attributeName;
	protected String attributeValue;
	protected String validationString;
	protected String errorMessage;
	protected String errorCode;

	public ProductOptionValidationException() {
	}

	public ProductOptionValidationException(String message, String errorCode, String attributeName,
			String attributeValue, String validationString, String errorMessage, Throwable cause) {
		super(message, cause);
		setAttributeName(attributeName);
		setAttributeValue(attributeValue);
		setErrorMessage(errorMessage);
		setValidationString(validationString);
		setErrorCode(errorCode);
	}

	public ProductOptionValidationException(String message, String errorCode, String attributeName,
			String attributeValue, String validationString, String errorMessage) {
		super(message);
		setAttributeName(attributeName);
		setAttributeValue(attributeValue);
		setErrorMessage(errorMessage);
		setValidationString(validationString);
		setErrorCode(errorCode);
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return this.attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public String getValidationString() {
		return this.validationString;
	}

	public void setValidationString(String validationString) {
		this.validationString = validationString;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}