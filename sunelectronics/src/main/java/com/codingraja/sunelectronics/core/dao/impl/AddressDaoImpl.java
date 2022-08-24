/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.core.dao.AddressDao;
import com.codingraja.sunelectronics.core.domain.Address;

/**
 * @author CL Verma
 *
 */
@Repository
public class AddressDaoImpl implements AddressDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.dao.AddressDao#saveAddress(com.codingraja.sunelectronics.core.domain.Address)
	 */
	@Override
	public Long saveAddress(Address address) {
		return (Long) this.sessionFactory.getCurrentSession().save(address);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.dao.AddressDao#updateAddress(com.codingraja.sunelectronics.core.domain.Address)
	 */
	@Override
	public void updateAddress(Address address) {
		this.sessionFactory.getCurrentSession().merge(address);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.dao.AddressDao#deleteAddress(java.lang.Long)
	 */
	@Override
	public void deleteAddress(Long addressId) {
		Address address = this.sessionFactory.getCurrentSession().get(Address.class, addressId);
		this.sessionFactory.getCurrentSession().delete(address);
	}

}
