package com.codingraja.hibernate.domain;

public class SavingAccount extends Account {
	private double interestRate;
	public SavingAccount(){}
	public SavingAccount(double balance, long customerId, double interestRate) {
		super(balance, customerId);
		this.interestRate = interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
