package com.codingraja.sunelectronics.payment.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.codingraja.sunelectronics.commons.domain.SunEcommerceCurrency;
import com.codingraja.sunelectronics.core.domain.Customer;

public class PaymentLog {
	private Long id;
	private String userName;
	private Date transactionTimestamp;
	private Long paymentInfoId;
	private Customer customer;
	private String paymentInfoReferenceNumber;
	private String transactionType;
	private Boolean transactionSuccess = false;
	private String exceptionMessage;
	private String logType;
	private BigDecimal amountPaid;
	private SunEcommerceCurrency currency;
	public PaymentLog(){}
}
