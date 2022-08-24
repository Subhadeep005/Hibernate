package com.codingraja.sunelectronics.checkout.model;

import java.io.Serializable;

import com.codingraja.sunelectronics.core.domain.Address;

public class CheckoutForm implements Serializable {

	private static final long serialVersionUID = 8866879738364589339L;

	private String emailAddress;
	private Address shippingAddress = new Address();
	private Address billingAddress = new Address();
	private String creditCardNumber;
	private String creditCardCvvCode;
	private String creditCardExpMonth;
	private String creditCardExpYear;
	private String selectedCreditCardType;
	private boolean isSameAddress;

	public CheckoutForm() {
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardCvvCode() {
		return creditCardCvvCode;
	}

	public void setCreditCardCvvCode(String creditCardCvvCode) {
		this.creditCardCvvCode = creditCardCvvCode;
	}

	public String getCreditCardExpMonth() {
		return creditCardExpMonth;
	}

	public void setCreditCardExpMonth(String creditCardExpMonth) {
		this.creditCardExpMonth = creditCardExpMonth;
	}

	public String getCreditCardExpYear() {
		return creditCardExpYear;
	}

	public void setCreditCardExpYear(String creditCardExpYear) {
		this.creditCardExpYear = creditCardExpYear;
	}

	public String getSelectedCreditCardType() {
		return selectedCreditCardType;
	}

	public void setSelectedCreditCardType(String selectedCreditCardType) {
		this.selectedCreditCardType = selectedCreditCardType;
	}

	public boolean isSameAddress() {
		return isSameAddress;
	}

	public void setSameAddress(boolean isSameAddress) {
		this.isSameAddress = isSameAddress;
	}

}
