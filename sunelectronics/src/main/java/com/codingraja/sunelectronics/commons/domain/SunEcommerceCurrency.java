/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * 
 */
package com.codingraja.sunelectronics.commons.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author CL Verma
 *
 */
@Entity
@Table(name = "SUN_ECOMMERCE_CURRENCY_MASTER")
public class SunEcommerceCurrency implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CURRENCY_ID")
	private Long id;
	@Column(name = "CURRENCY_CODE")
	private String currencyCode;
	@Column(name = "FRIENDLY_NAME")
	private String friendlyName;
	@Column(name = "DEFAULT_FLAG")
	private Boolean defaultFlag = false;

	public SunEcommerceCurrency() {
		// Do Nothing
	}

	public SunEcommerceCurrency(String currencyCode, String friendlyName, Boolean defaultFlag) {
		this.currencyCode = currencyCode;
		this.friendlyName = friendlyName;
		this.defaultFlag = defaultFlag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
		return defaultFlag;
	}

	public void setDefaultFlag(Boolean defaultFlag) {
		this.defaultFlag = defaultFlag;
	}
}
