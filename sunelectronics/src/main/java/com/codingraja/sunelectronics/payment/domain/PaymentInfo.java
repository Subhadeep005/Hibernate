/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.payment.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.codingraja.sunelectronics.core.domain.Address;
import com.codingraja.sunelectronics.order.domain.Order;

/**
 * @author CL Verma
 *
 */
@Entity
@Table(name = "SUN_PAYMENT_INFO_MASTER")
public class PaymentInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PAYMENT_ID")
	private Long id;

	@Column(name = "MOBILE")
	private String mobile;
	@Column(name = "AMOUNT")
	private BigDecimal amount;
	@Column(name = "REFERENCE_NUMBER")
	private String referenceNumber;
	@Column(name = "TYPE")
	private String type;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ORDER_ID")
	private Order order;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	/*
	 * private List<AmountItem> amountItems = new ArrayList<AmountItem>();
	 * private String customerIpAddress; private Map<String, String>
	 * additionalFields = new HashMap<String, String>(); private
	 * List<PaymentInfoDetail> details = new ArrayList<PaymentInfoDetail>();
	 * private List<PaymentResponseItem> paymentResponseItems = new
	 * ArrayList<PaymentResponseItem>(); private Map<String, String[]>
	 * requestParameterMap = new HashMap<String, String[]>();
	 */
	public PaymentInfo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
