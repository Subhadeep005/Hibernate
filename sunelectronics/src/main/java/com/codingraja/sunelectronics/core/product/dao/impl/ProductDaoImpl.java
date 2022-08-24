/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.product.dao.impl;

import java.math.BigDecimal;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.catalog.domain.Product;
import com.codingraja.sunelectronics.core.product.dao.ProductDao;

/**
 * @author CL Verma
 *
 */
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.dao.ProductDao#saveNewProduct(com.codingraja.sunelectronics.catalog.domain.Product)
	 */
	@Override
	public Long saveNewProduct(Product product) {
		return (Long) this.sessionFactory.getCurrentSession().save(product);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.dao.ProductDao#findProductById(java.lang.Long)
	 */
	@Override
	public Product findProductById(Long productId) {
		return this.sessionFactory.getCurrentSession().get(Product.class, productId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.dao.ProductDao#findProductPrice(java.lang.Long)
	 */
	@Override
	public Double findProductPrice(Long productId) {
		Product product = this.sessionFactory.getCurrentSession().get(Product.class, productId);
		if (product != null)
			return product.getPrice().doubleValue();
		return 0.0;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.dao.ProductDao#findProductAvailableQuantity(java.lang.Long)
	 */
	@Override
	public Integer findProductAvailableQuantity(Long productId) {
		Product product = this.sessionFactory.getCurrentSession().get(Product.class, productId);
		if (product != null)
			return product.getQuantity();
		return 0;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.dao.ProductDao#updateProductPrice(java.lang.Long,
	 *      java.lang.Integer)
	 */
	@Override
	public void updateProductPrice(Long productId, Double updatedPrice) {
		Product product = this.sessionFactory.getCurrentSession().get(Product.class, productId);
		if (product != null) {
			product.setPrice(new BigDecimal(updatedPrice));
			this.sessionFactory.getCurrentSession().update(product);
		}
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.dao.ProductDao#updateProductQuantity(java.lang.Long,
	 *      java.lang.Integer)
	 */
	@Override
	public void updateProductQuantity(Long productId, Integer updatedQuantity) {
		Product product = this.sessionFactory.getCurrentSession().get(Product.class, productId);
		if (product != null) {
			product.setQuantity(updatedQuantity);
			this.sessionFactory.getCurrentSession().update(product);
		}
	}

}
