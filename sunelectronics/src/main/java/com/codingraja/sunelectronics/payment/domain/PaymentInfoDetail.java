package com.codingraja.sunelectronics.payment.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.codingraja.sunelectronics.commons.domain.SunEcommerceCurrency;

public class PaymentInfoDetail {
	private Long id;
	private PaymentInfo paymentInfo;
	private String type;
	private BigDecimal amount;
	private SunEcommerceCurrency currency;
	private Date date;
	public PaymentInfoDetail(){}
}
