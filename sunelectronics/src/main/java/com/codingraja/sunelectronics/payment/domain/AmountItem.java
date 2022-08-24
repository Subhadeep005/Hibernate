package com.codingraja.sunelectronics.payment.domain;

import java.math.BigDecimal;

public class AmountItem {
	private Long id;
	private String shortDescription;
	private String description;
	private BigDecimal unitPrice;
	private Long quantity;
	private String systemId;
	private PaymentInfo paymentInfo;
	public AmountItem(){}
}
