package com.codingraja.hibernate.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("LOAN_ACCOUNT")
public class LoanAccount extends Account {
	@Column(name="INTEREST_RATE")
	private double interestRate;
	@Column(name="EMI")
	private double emi;
	@Column(name="LOAN_LIMIT")
	private double loanLimit;
	@Column(name="OUT_STD_AMT")
	private double outStdAmount;
	
	public LoanAccount(){}

	public LoanAccount(double balance, long customerId, double interestRate, double emi,
			double outStdAmount, double loanLimit) {
		super(balance, customerId);
		this.interestRate = interestRate;
		this.emi = emi;
		this.loanLimit = loanLimit;
		this.outStdAmount = outStdAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public double getOutStdAmount() {
		return outStdAmount;
	}

	public void setOutStdAmount(double outStdAmount) {
		this.outStdAmount = outStdAmount;
	}
	
}
