package com.program.hibernate.domain;

public class Product {
	private long id;
	private String name;
	private String model;
	private String brand;
	private double price;
	
	public Product(){}

	public Product(String name, String model, String brand, double price) {
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public long getId() {
		System.out.println("getid");
		return id;
	}

	public void setId(long id) {
		System.out.println("setid");
		this.id = id;
	}

	public String getName() {
		System.out.println("getname");
		return name;
	}

	public void setName(String name) {
		System.out.println("setname");
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
