/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.core.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author CL Verma
 *
 */
@Entity
@Table(name = "SUN_CUSTOMER_MASTER")
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID")
	private Long id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL", unique = true)
	private String email;
	@Column(name = "MOBILE")
	private String mobile;
	@Column(name = "NEWSLETTER")
	private Boolean newsletter = true;
	@Column(name = "CUSTOMER_LOCALE")
	private Locale customerLocale;
	@Column(name = "TYPE")
	private String type;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID")
	private List<Address> addresses = new ArrayList<>();

	/*
	 * @OneToMany(cascade = CascadeType.ALL) private List<PaymentInfo>
	 * paymentInfo = new ArrayList<PaymentInfo>();
	 */

	public Customer() {
		// Do Nothing
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Boolean getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(Boolean newsletter) {
		this.newsletter = newsletter;
	}

	public Locale getCustomerLocale() {
		return customerLocale;
	}

	public void setCustomerLocale(Locale customerLocale) {
		this.customerLocale = customerLocale;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	/*
	 * public List<PaymentInfo> getPaymentInfo() { return paymentInfo; }
	 * 
	 * public void setPaymentInfo(List<PaymentInfo> paymentInfo) {
	 * this.paymentInfo = paymentInfo; }
	 */
}
