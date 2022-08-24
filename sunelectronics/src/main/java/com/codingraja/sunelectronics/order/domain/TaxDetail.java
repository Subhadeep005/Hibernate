/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * 
 */
package com.codingraja.sunelectronics.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.codingraja.sunelectronics.commons.domain.SunEcommerceCurrency;

/**
 * @author CL Verma
 *
 */
@Entity
@Table(name = "SUN_TAX_DETAIL_MASTER")
public class TaxDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TAX_DETAIL_ID")
	private Long id;
	private String type;
	private BigDecimal amount;
	private BigDecimal rate;

	@Column(name = "JURISDICTION_NAME")
	private String jurisdictionName;
	private String country;
	private String region;

	@Column(name = "TAX_NAME")
	private String taxName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CURRENCY_ID")
	private SunEcommerceCurrency currency;

	public TaxDetail() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getJurisdictionName() {
		return jurisdictionName;
	}

	public void setJurisdictionName(String jurisdictionName) {
		this.jurisdictionName = jurisdictionName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getTaxName() {
		return taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	public SunEcommerceCurrency getCurrency() {
		return currency;
	}

	public void setCurrency(SunEcommerceCurrency currency) {
		this.currency = currency;
	}
}
