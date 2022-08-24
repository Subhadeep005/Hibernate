package com.codingraja.hibernate.domain;

import java.util.*;

public class Product {
	private long id;
	private String name;
	private String model;
	private String brand;
	private long price;
	private Set<String> colors;
	
	public Product(){}

	public Product(String name, String model, String brand, long price, Set<String> colors) {
		super();
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.price=price;
		this.colors = colors;
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

	public Set<String> getColors() {
		return colors;
	}

	public void setColors(Set<String> colors) {
		this.colors = colors;
	}
}
