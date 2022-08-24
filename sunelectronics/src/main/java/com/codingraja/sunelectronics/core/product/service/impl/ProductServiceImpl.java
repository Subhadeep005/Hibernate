/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.catalog.domain.Product;
import com.codingraja.sunelectronics.core.product.dao.ProductDao;
import com.codingraja.sunelectronics.core.product.service.ProductService;

/**
 * @author CL Verma
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.service.ProductService#saveNewProduct(com.codingraja.sunelectronics.catalog.domain.Product)
	 */
	@Override
	@Transactional
	public Long saveNewProduct(Product product) {
		return this.productDao.saveNewProduct(product);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.service.ProductService#findProductById(java.lang.Long)
	 */
	@Override
	@Transactional
	public Product findProductById(Long productId) {
		return this.productDao.findProductById(productId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.service.ProductService#findProductPrice(java.lang.Long)
	 */
	@Override
	@Transactional
	public Double findProductPrice(Long productId) {
		return this.productDao.findProductPrice(productId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.service.ProductService#findProductAvailableQuantity(java.lang.Long)
	 */
	@Override
	@Transactional
	public Integer findProductAvailableQuantity(Long productId) {
		return this.productDao.findProductAvailableQuantity(productId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.service.ProductService#updateProductPrice(java.lang.Long,
	 *      java.lang.Double)
	 */
	@Override
	@Transactional
	public void updateProductPrice(Long productId, Double updatedPrice) {
		this.productDao.updateProductPrice(productId, updatedPrice);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.core.product.service.ProductService#updateProductQuantity(java.lang.Long,
	 *      java.lang.Integer)
	 */
	@Override
	@Transactional
	public void updateProductQuantity(Long productId, Integer updatedQuantity) {
		this.productDao.updateProductQuantity(productId, updatedQuantity);
	}

}
