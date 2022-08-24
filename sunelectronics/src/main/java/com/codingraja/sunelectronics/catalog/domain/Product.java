/**
 * Copyright (c) 2015-2017, www.codingraja.com and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.catalog.domain;

import java.io.Serializable;
/**
* @author  CL Verma
*/
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "SUN_PRODUCT_MASTER")
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	private Long id;
	@Column(name = "PRODUCT_URL")
	private String url;
	@Column(name = "PRODUCT_NAME")
	private String name;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "MANUFACTURER")
	private String manufacturer;
	@Column(name = "CATEGORY")
	private String category;
	@Column(name = "SUB_CATEGORY")
	private String subCategory;
	@Column(name = "PRICE")
	private BigDecimal price;
	@Column(name = "QUANTITY")
	private Integer quantity;
	@Column(name = "DESCRIPTION", length = 1000)
	private String description;
	@Column(name = "ADDITIONAL_INFO", length = 500)
	private String additionalInfo;

	@OneToMany(mappedBy = "product")
	private List<ProductAttribute> productAttributes = new ArrayList<>();

	@OneToMany(mappedBy = "product")
	private List<ProductImage> productImages = new ArrayList<>();

	@Transient
	private transient List<RelatedProduct> relatedProducts = new ArrayList<>();

	public Product() {
		// Do Nothing
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public List<ProductAttribute> getProductAttributes() {
		return productAttributes;
	}

	public void setProductAttributes(List<ProductAttribute> productAttributes) {
		this.productAttributes = productAttributes;
	}

	public List<ProductImage> getProductImages() {
		return productImages;
	}

	public void setProductImages(List<ProductImage> productImages) {
		this.productImages = productImages;
	}

	public List<RelatedProduct> getRelatedProducts() {
		return relatedProducts;
	}

	public void setRelatedProducts(List<RelatedProduct> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(super.getClass().isAssignableFrom(obj.getClass())))
			return false;
		Product other = (Product) obj;

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
