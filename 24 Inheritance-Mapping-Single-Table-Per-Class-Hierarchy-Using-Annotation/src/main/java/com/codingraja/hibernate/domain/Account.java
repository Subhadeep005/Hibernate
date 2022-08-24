package com.codingraja.hibernate.domain;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNT_MASTER24")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ACC_TYPE", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("ACC")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
