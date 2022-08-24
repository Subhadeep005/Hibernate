package com.codingraja.hibernate.domain;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="CUSTOMER_MASTER29")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CUST_ID")
	private long id;
	@Column(name="FIRST_NAME")
	private String fname;
	@Column(name="LAST_NAME")
	private String lname;
	@Column(name="EMAIL")
	private String email;
	@Column(name="MOBILE")
	private long mobile;
	
	@OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
	//@JoinColumn(name="CUST_ID")
	private List<Order> orders;
	
	public Customer(){ System.out.println("Customer Object is created");}



	public Customer(String fname, String lname, String email, long mobile, List<Order> orders) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.orders = orders;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer ID =" + id + "\nFirst Name=" + fname + "\nLast Name=" + lname + "\nEmail=" + email + "\nMobile="
				+ mobile;
	}
	
}
