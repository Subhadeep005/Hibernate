/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.checkout.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.codingraja.sunelectronics.core.domain.Address;
import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.core.service.AddressService;
import com.codingraja.sunelectronics.core.web.CustomerState;

/**
 * @author CL Verma
 *
 */
public abstract class AbstractShippingAddressController {

	@Autowired
	private AddressService addressService;

	protected void save(Address address, HttpServletRequest request) {
		Customer customer = CustomerState.getCustomer(request);
		address.setCustomer(customer);
		Long addressId = this.addressService.saveAddress(address);
		if (addressId != null) {
			address.setId(addressId);
			customer.getAddresses().add(address);
			CustomerState.setCustomer(customer, request);
		}
	}

	protected Address update(Address address, HttpServletRequest request) {
		this.addressService.updateAddress(address);
		return address;
	}

	protected void delete(Long addressId, HttpServletRequest request) {
		this.addressService.deleteAddress(addressId);
	}
}
