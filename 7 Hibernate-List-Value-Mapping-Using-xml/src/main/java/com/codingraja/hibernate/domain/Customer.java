package com.codingraja.hibernate.domain;

import java.util.List;

public class Customer {
	private long id;
	private String fname;
	private String lname;
	private String email;
	private List<Long> mobiles;
	
	public Customer(){}
	
	public Customer(String fname, String lname, String email, List<Long> mobiles) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobiles = mobiles;
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

	public List<Long> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Long> mobiles) {
		this.mobiles = mobiles;
	}
	
}
