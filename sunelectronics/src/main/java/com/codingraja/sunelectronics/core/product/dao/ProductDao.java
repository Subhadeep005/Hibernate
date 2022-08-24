/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.product.dao;

import com.codingraja.sunelectronics.catalog.domain.Product;

/**
 * @author CL Verma
 *
 */
public interface ProductDao {
	public Long saveNewProduct(Product product);

	public Product findProductById(Long productId);

	public Double findProductPrice(Long productId);

	public Integer findProductAvailableQuantity(Long productId);

	public void updateProductPrice(Long productId, Double updatedPrice);

	public void updateProductQuantity(Long productId, Integer updatedQuantity);
}
