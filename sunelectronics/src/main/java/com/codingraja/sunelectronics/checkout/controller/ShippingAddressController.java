/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.checkout.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.codingraja.sunelectronics.core.domain.Address;

/**
 * @author CL Verma
 *
 */
@Controller
@RequestMapping("/checkout")
public class ShippingAddressController extends AbstractShippingAddressController {

	private static final Logger LOGGER = Logger.getLogger(ShippingAddressController.class);

	private static final String MESSAGE = "message";

	/**
	 * This method loads the address form by AJAX call in checkout page
	 * 
	 * @return
	 */
	@GetMapping("/shipping-address")
	public ModelAndView shippingAddressForm() {
		LOGGER.info("Address form is loading");
		return new ModelAndView("checkout/shippingAddressFrom", "address", new Address());
	}

	/**
	 * This method saves the new shipping address, call by AJAX and return some
	 * attributes and values. And update the address on checkout
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping("/shipping-address/add")
	public @ResponseBody Map<String, Object> saveShippingAddress(HttpServletRequest request) {
		Address address = new Address();
		address.setAddressLine1(request.getParameter("addressLine1"));
		address.setAddressLine2(request.getParameter("addressLine2"));
		address.setAddressLine3(request.getParameter("addressLine3"));
		address.setCity(request.getParameter("city"));
		address.setLandmark(request.getParameter("landmark"));
		address.setState(request.getParameter("state"));
		address.setZipcode(request.getParameter("zipcode"));
		address.setPhone(request.getParameter("phone"));

		if ("true".equals(request.getParameter("isDefault")))
			address.setDefault(true);
		if ("true".equals(request.getParameter("isBusiness")))
			address.setBusiness(true);

		super.save(address, request);

		Map<String, Object> responseMap = new LinkedHashMap<>();

		responseMap.put(MESSAGE, "Shipping Address has been saved successfully!");
		return responseMap;
	}

	/**
	 * This method loads the existing address from database into the address
	 * form to update.
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping(value = "/shipping-address/update")
	public @ResponseBody Map<String, Object> updateShippingAddress(HttpServletRequest request) {
		Map<String, Object> responseMap = new LinkedHashMap<>();
		responseMap.put(MESSAGE, "Shipping Address has been updated successfully!");
		return responseMap;
	}

	/**
	 * Deletes the existing shipping address from the database.
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping(value = "/shipping-address/delete")
	public @ResponseBody Map<String, Object> deleteShippingAddress(HttpServletRequest request) {
		Map<String, Object> responseMap = new LinkedHashMap<>();
		responseMap.put(MESSAGE, "Shipping Address has been deleted successfully!");
		return responseMap;
	}
}
