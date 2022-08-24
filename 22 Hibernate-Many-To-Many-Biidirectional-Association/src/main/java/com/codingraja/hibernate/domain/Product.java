package com.codingraja.hibernate.domain;

import java.util.*;
import javax.persistence.*;

@Entity(name="product")
@Table(name="PRODUCT_MASTER_22")
public class Product {
	private long id;
	private String name;
	private String model;
	private String brand;
	private double price;
	private Set<Color> colors;
	
	public Product(){}

	public Product(String name, String model, String brand, double price, Set<Color> colors) {
		super();
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.colors = colors;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PRODUCT_ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name="PRODUCT_NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="PRODUCT_MODEL")
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name="PRODUCT_BRAND")
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name="PRODUCT_PRICE")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@ManyToMany(cascade=CascadeType.MERGE)
	@JoinTable(name="PRODUCT22_COLOR22", 
	joinColumns={@JoinColumn(columnDefinition="PRODUCT_ID")}, 
	inverseJoinColumns={@JoinColumn(columnDefinition="COLOR_ID")})
	public Set<Color> getColors() {
		return colors;
	}

	public void setColors(Set<Color> colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "Id=" + id + ", Name=" + name + ", Model=" + model + ", Brand=" + brand + ", Price=" + price
				+ ", Colors=" + colors+"\n";
	}
}
