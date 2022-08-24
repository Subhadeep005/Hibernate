package com.codingraja.hibernate.domain;

import java.util.Set;

import javax.persistence.*;

@Entity(name="color")
@Table(name="COLOR_MASTER_22")
public class Color {
	private long id;
	private String colName;
	private Set<Product> product;
	
	public Color(){}

	public Color(String colName) {
		super();
		this.colName = colName;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COLOR_ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name="COLOR_NAME", unique=true)
	public String getColName() {
		return colName;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	@ManyToMany(mappedBy="colors")
	public Set<Product> getProduct() {
		return product;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}
	@Override
	public String toString() {
		return colName;
	}
}
