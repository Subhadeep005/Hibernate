/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.payment.domain.PaymentInfo;

/**
 * @author CL Verma
 *
 */
@Entity
@Table(name = "SUN_ORDER_MASTER")
public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_ID")
	private Long id;
	@Column(name = "ORDER_NAME")
	private String name;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "TOTAL_QUANTITY")
	private Integer totalQuantity;
	@Column(name = "SUB_TOTAL")
	private BigDecimal subTotal;
	@Column(name = "TOTAL_TAX")
	private BigDecimal totalTax;
	@Column(name = "TOTAL_FULFILLMENT_CHARGES")
	private BigDecimal totalFulfillmentCharges;
	@Column(name = "TOTAL_DISCOUNT")
	private BigDecimal totalDiscount;
	@Column(name = "TOTAL")
	private BigDecimal total;
	@Column(name = "SUBMIT_DATE")
	private Date submitDate;
	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;
	@Column(name = "CURRENCY")
	private String currency;
	@Column(name = "LOCALE")
	private String locale;

	@OneToMany(cascade = { CascadeType.REMOVE, CascadeType.REFRESH })
	@JoinColumn(name = "ORDER_ID")
	private Set<OrderItem> orderItems = new HashSet<>();

	@OneToMany(mappedBy = "order")
	private List<PaymentInfo> paymentInfos = new ArrayList<>();

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;

	public Order() {
		// Do Nothing
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public BigDecimal getTotalFulfillmentCharges() {
		return totalFulfillmentCharges;
	}

	public void setTotalFulfillmentCharges(BigDecimal totalFulfillmentCharges) {
		this.totalFulfillmentCharges = totalFulfillmentCharges;
	}

	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public List<PaymentInfo> getPaymentInfos() {
		return paymentInfos;
	}

	public void setPaymentInfos(List<PaymentInfo> paymentInfos) {
		this.paymentInfos = paymentInfos;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(super.getClass().isAssignableFrom(obj.getClass())))
			return false;
		Order other = (Order) obj;

		if ((this.id != null) && (other.id != null)) {
			return this.id.equals(other.id);
		}

		if (this.name == null)
			if (other.name != null)
				return false;
			else if (!(this.name.equals(other.name)))
				return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}
}
