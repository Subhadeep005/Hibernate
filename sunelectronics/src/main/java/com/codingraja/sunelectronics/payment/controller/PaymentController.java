/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author CL Verma
 *
 */
@Controller
@RequestMapping("/payment")
public class PaymentController {

	private static final String PAYMENT_OPTION_PAGE = "payment/payment";

	@GetMapping("")
	public ModelAndView paymentOptionPage() {
		return new ModelAndView(PAYMENT_OPTION_PAGE);
	}
}
