package com.codingraja.sunelectronics.payment.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.codingraja.sunelectronics.commons.domain.SunEcommerceCurrency;
import com.codingraja.sunelectronics.core.domain.Customer;

public class PaymentResponseItem {
	private Long id;
	private String userName;
	private BigDecimal amountPaid;
	private BigDecimal transactionAmount;
	private String authorizationCode;
	private String middlewareResponseCode;
	private String middlewareResponseText;
	private String processorResponseCode;
	private String processorResponseText;
	private String implementorResponseCode;
	private String implementorResponseText;
	private String referenceNumber;
	private Boolean transactionSuccess = false;
	private Date transactionTimestamp;
	private String transactionId;
	private String avsCode;
	private BigDecimal remainingBalance;
	private String transactionType;
	private Map<String, String> additionalFields = new HashMap<String, String>();
	private Long paymentInfoId;
	private Customer customer;
	private String paymentInfoReferenceNumber;
	private SunEcommerceCurrency currency;
	private PaymentInfo paymentInfo;
	public PaymentResponseItem(){}
}
