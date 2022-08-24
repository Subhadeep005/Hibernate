package com.codingraja.hibernate.domain;

import javax.persistence.*;

@Entity
@Table(name="CURRENT_ACCOUNT_MASTER26")
public class CurrentAccount extends Account {
	@Column(name="MAB")
	private double mab; //Monthly Average Balance
	@Column(name="MAX_TXN_LIMIT")
	private long maxTxn; //Max Transaction Limit
	
	public CurrentAccount(){}

	public CurrentAccount(double balance, long customerId, double mab, long maxTxn) {
		super(balance, customerId);
		this.mab = mab;
		this.maxTxn = maxTxn;
	}

	public double getMab() {
		return mab;
	}

	public void setMab(double mab) {
		this.mab = mab;
	}

	public long getMaxTxn() {
		return maxTxn;
	}

	public void setMaxTxn(long maxTxn) {
		this.maxTxn = maxTxn;
	}
	
}
