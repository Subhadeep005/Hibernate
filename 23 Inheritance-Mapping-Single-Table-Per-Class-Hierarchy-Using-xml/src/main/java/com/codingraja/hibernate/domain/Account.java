package com.codingraja.hibernate.domain;

public class Account {
	private long accNo;
	private double balance;
	private long customerId;
	
	public Account(){}
	
	public Account(double balance, long customerId) {
		super();
		this.balance = balance;
		this.customerId = customerId;
	}


	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
}
