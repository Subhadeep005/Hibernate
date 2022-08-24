package com.codingraja.hibernate.domain;

import javax.persistence.*;

@Entity
@Table(name="ORDER_VIEW_MASTER29")
public class OrderView {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ORDER_ID")
	private long id;
	@Column(name="ITEM_NAME")
	private String itemName;
	@Column(name="PRICE")
	private double price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUST_ID")
	private Customer customer;
	
	public OrderView(){}

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
		return "Order ID=" + id + "\nItem Name=" + itemName + "\nModel=" + "\nPrice="+ price;
	}
	
}
