package com.codingraja.hibernate.domain;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNT_MASTER28")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACC_MUMBER")
	private long accNo;
	@Column(name="BALANCE")
	private double balance;
	@Column(name="CUSTOMER_ID")
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
