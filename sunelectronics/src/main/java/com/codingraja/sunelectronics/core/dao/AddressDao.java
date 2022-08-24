/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.dao;

import com.codingraja.sunelectronics.core.domain.Address;

/**
 * @author CL Verma
 *
 */
public interface AddressDao {
	public Long saveAddress(Address address);

	public void updateAddress(Address address);

	public void deleteAddress(Long addressId);
}
