/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.checkout.service.workflow;

import com.codingraja.sunelectronics.order.domain.Order;

/**
 * @author CL Verma
 *
 */
public interface CheckoutResponse {
	public abstract Order getOrder();
}
