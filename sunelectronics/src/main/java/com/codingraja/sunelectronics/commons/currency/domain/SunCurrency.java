/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons.currency.domain;

import java.io.Serializable;

/**
 * @author CL Verma
 *
 */
public class SunCurrency implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String currencyCode;

	private String friendlyName;

	private Boolean defaultFlag = false;

	private java.util.Currency javaCurrency;

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public Boolean getDefaultFlag() {
		if (defaultFlag == null) {
			return false;
		}
		return defaultFlag.booleanValue();
	}

	public void setDefaultFlag(Boolean defaultFlag) {
		this.defaultFlag = defaultFlag;
	}

	public java.util.Currency getJavaCurrency() {
		if (javaCurrency == null && getCurrencyCode() != null) {
			javaCurrency = java.util.Currency.getInstance(getCurrencyCode());
		}
		return javaCurrency;
	}

	public void setJavaCurrency(java.util.Currency javaCurrency) {
		this.javaCurrency = javaCurrency;
	}

	public String getMainEntityName() {
		if (getFriendlyName() != null) {
			return getFriendlyName() + " (" + getCurrencyCode() + ")";
		} else {
			return getCurrencyCode();
		}
	}
}
