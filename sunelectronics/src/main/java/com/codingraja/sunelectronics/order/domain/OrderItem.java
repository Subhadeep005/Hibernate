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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author CL Verma
 *
 */
@Entity
@Table(name = "SUN_ORDER_ITEM_MASTER")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ITEM_ID")
	private Long id;
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "ITEM_URL")
	private String url;
	@Column(name = "ITEM_NAME")
	private String name;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "MANUFACTURER")
	private String manufacturer;
	@Column(name = "CATEGORY")
	private String category;
	@Column(name = "SUB_CATEGORY")
	private String subCategory;
	@Column(name = "RETAIL_PRICE")
	private BigDecimal retailPrice;
	@Column(name = "SALE_PRICE")
	private BigDecimal salePrice;
	@Column(name = "QUANTITY")
	private Integer quantity;
	@Column(name = "DISCOUNT")
	private BigDecimal discount;
	@Column(name = "SHIPPING_CHARGE")
	private BigDecimal shippingCharge;

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumns(value = @JoinColumn(name = "ORDER_ID"))
	private Order order;

	public OrderItem() {
		// Do Nothing
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public BigDecimal getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(BigDecimal shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(super.getClass().isAssignableFrom(obj.getClass())))
			return false;
		OrderItem other = (OrderItem) obj;

		if ((this.id != null) && (other.id != null)) {
			return this.id.equals(other.id);
		}

		if (this.productId == null)
			if (other.productId != null)
				return false;
			else if (!(this.productId.equals(other.productId)))
				return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + ((this.productId == null) ? 0 : this.productId.hashCode());
		return result;
	}
}
