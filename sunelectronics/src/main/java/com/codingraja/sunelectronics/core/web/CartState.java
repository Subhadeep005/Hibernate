/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * 
 */
package com.codingraja.sunelectronics.core.web;

import java.math.BigDecimal;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderStatus;

/**
 * @author CL Verma
 *
 */
@Component
public class CartState {

	private static final String CART_STATE = "cart";

	private CartState() {
		// Do Nothing
	}

	public static Order getCart(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute(CART_STATE) == null) {
			Order cart = new Order();
			cart.setName("CART");
			cart.setStatus(OrderStatus.IN_PROCESS.getType());
			cart.setCurrency("INR");
			cart.setLocale(Locale.ENGLISH.toString());
			cart.setTotalQuantity(0);
			cart.setSubTotal(BigDecimal.valueOf(0.0));
			cart.setTotalDiscount(BigDecimal.valueOf(0.0));
			cart.setTotalFulfillmentCharges(BigDecimal.valueOf(0.0));
			cart.setTotalTax(BigDecimal.valueOf(0.0));
			cart.setTotal(BigDecimal.valueOf(0.0));

			return cart;
		} else {
			return (Order) session.getAttribute(CART_STATE);
		}
	}

	public static void setCart(Order cart, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute(CART_STATE, cart);
	}
}
