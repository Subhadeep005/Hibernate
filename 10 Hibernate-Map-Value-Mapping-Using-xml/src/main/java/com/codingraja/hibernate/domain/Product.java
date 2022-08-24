package com.codingraja.hibernate.domain;

import java.util.*;

public class Product {
	private long id;
	private String name;
	private String model;
	private String brand;
	private long price;
	private Map<String,String> props;
	
	public Product(){}

	public Product(String name, String model, String brand, long price, Map<String,String> props) {
		super();
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.price=price;
		this.props = props;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Map<String,String> getProps() {
		return props;
	}

	public void setProps(Map<String,String> props) {
		this.props = props;
	}
}
