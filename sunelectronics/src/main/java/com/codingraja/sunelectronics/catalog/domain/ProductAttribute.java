/**
 * Copyright (c) 2015-2017, www.codingraja.com and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.catalog.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author CL Verma
 */

@Entity
@Table(name = "SUN_PRODUCT_ATTRIBUTE_MASTER")
public class ProductAttribute implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ATTRIBUTE_ID")
	private Long id;
	@Column(name = "ATTRIBUTE_NAME")
	private String name;
	@Column(name = "ATTRIBUTE_VALUE")
	private String value;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;

	public ProductAttribute() {
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public boolean equals(Object object) {
		return false;
	}

	@Override
	public int hashCode() {
		return 1;
	}
}
