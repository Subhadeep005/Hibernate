/**
 * Copyright (c) 2015-2017, www.codingraja.com and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.catalog.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author CL Verma
 */
@Entity
@Table(name = "SUN_PRODUCT_CATEGORY_MASTER")
public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CATEGORY_ID")
	private Long id;
	@Column(name = "CATEGORY_NAME")
	private String name;
	@Column(name = "CATEGORY_VALUE")
	private String value;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private Set<SubCategory> subCategories;

	public Category() {
		// Do Nothing
	}

	public Category(String name, String value) {
		this.name = name;
		this.value = value;
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

	@Override
	public boolean equals(Object object) {
		return false;
	}

	@Override
	public int hashCode() {
		return 1;
	}
}