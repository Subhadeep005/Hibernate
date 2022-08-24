package com.codingraja.hibernate.domain;

import javax.persistence.*;

@Entity
@Table(name="ORDER_MASTER_20")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Order_Id")
	private long id;
	private String productName;
	private String brand;
	private String model;
	private double price;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumns(value=@JoinColumn(name="CUST_ID"))
	private Customer customer; //One-To-One Bidirectional
	
	public Order(){ System.out.println("Order Object is created");}

	public Order(String productName, String brand, String model, double price) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
}
