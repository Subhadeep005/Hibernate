package com.codingraja.hibernate.domain;

import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;
@Entity
@Table(name="CUSTOMER_MASTER6")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CUST_ID")
	private long id;
	private String fname;
	private String lname;
	private String email;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="CUST_ID")
	private List<Address> address;
	
	public Customer(){}
	
	public Customer(String fname, String lname, String email, List<Address> address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		System.out.println("getname");
		return fname;
	}

	public void setFname(String fname) {
		System.out.println("setname");
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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
}
