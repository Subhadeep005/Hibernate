/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.checkout.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.core.web.CustomerState;

/**
 * @author CL Verma
 *
 */
@Controller
@RequestMapping("/checkout")
public class CheckoutController {

	private static final Logger LOGGER = Logger.getLogger(CheckoutController.class);

	private static final String CHECKOUT_PAGE = "checkout/checkout";
	private static final String REDIRECT_LOGIN_PAGE = "redirect:/login";

	@GetMapping("")
	public String checkoutPage(HttpServletRequest request, Model model) {
		LOGGER.info("Checkout Page is Rendreing");
		Customer customer = CustomerState.getCustomer(request);

		/*
		 * if ("ROLE_ANONYMOUS".equals(customer.getType())) return
		 * REDIRECT_LOGIN_PAGE;
		 */
		return CHECKOUT_PAGE;
	}
}
