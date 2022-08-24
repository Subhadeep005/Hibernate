package com.codingraja.hibernate.domain;

import javax.persistence.*;

@Entity
@Table(name="ORDER_MASTER29")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ORDER_ID")
	private long id;
	@Column(name="ITEM_NAME")
	private String itemName;
	@Column(name="MODEL")
	private String model;
	@Column(name="BRAND")
	private String brand;
	@Column(name="PRICE")
	private double price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUST_ID")
	private Customer customer;
	
	public Order(){}
	
	
	public Order(String itemName, String model, String brand, double price) {
		super();
		this.itemName = itemName;
		this.model = model;
		this.brand = brand;
		this.price = price;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Order ID=" + id + "\nItem Name=" + itemName + "\nModel=" + model + "\nBrand=" + brand + "\nPrice="
				+ price;
	}
	
}
