/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.core.dao.AddressDao;
import com.codingraja.sunelectronics.core.domain.Address;
import com.codingraja.sunelectronics.core.service.AddressService;

/**
 * @author CL Verma
 *
 */
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDao addressDao;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.AddressService#saveAddress(com.codingraja.sunelectronics.core.domain.Address)
	 */
	@Override
	@Transactional
	public Long saveAddress(Address address) {
		return this.addressDao.saveAddress(address);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.AddressService#updateAddress(com.codingraja.sunelectronics.core.domain.Address)
	 */
	@Override
	@Transactional
	public void updateAddress(Address address) {
		this.addressDao.updateAddress(address);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.service.AddressService#deleteAddress(java.lang.Long)
	 */
	@Override
	@Transactional
	public void deleteAddress(Long addressId) {
		this.addressDao.deleteAddress(addressId);
	}

}
