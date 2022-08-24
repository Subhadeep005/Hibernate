package com.codingraja.hibernate.domain;

public class Product {
	private long id;
	private String name;
	private String model;
	private String brand;
	private String price;
	
	public Product(){ System.out.println("Default Constructor");}

	public Product(String name, String model, String brand, String price) {
		System.out.println("Parmaterized Constructor");
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
		System.out.println("setmodel");
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("setbrand");
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("setprice");
		this.price = price;
	}
	
}
