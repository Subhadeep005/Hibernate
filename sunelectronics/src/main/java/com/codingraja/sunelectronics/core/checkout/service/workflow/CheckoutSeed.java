/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.checkout.service.workflow;

import java.util.HashMap;
import java.util.Map;

import com.codingraja.sunelectronics.order.domain.Order;

/**
 * @author CL Verma
 *
 */
public class CheckoutSeed implements CheckoutResponse {
	protected Order order;
	protected Map<String, Object> userDefinedFields = new HashMap<>();

	public CheckoutSeed(Order order, Map<String, Object> userDefinedFields) {
		this.order = order;
		this.userDefinedFields = userDefinedFields;
	}

	@Override
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Map<String, Object> getUserDefinedFields() {
		return this.userDefinedFields;
	}
}
