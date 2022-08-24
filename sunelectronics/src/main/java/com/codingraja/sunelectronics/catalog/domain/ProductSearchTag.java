/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.catalog.domain;

/**
 * @author CL Verma
 *
 */
public class ProductSearchTag {
	private int id;
	private String tagName;
	
	public ProductSearchTag(){}
	public ProductSearchTag(int id, String tagName) {
		super();
		this.id = id;
		this.tagName = tagName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
}
