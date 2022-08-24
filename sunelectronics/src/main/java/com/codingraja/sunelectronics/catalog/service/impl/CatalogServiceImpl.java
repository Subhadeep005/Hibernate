/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.catalog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.catalog.dao.CatalogDao;
import com.codingraja.sunelectronics.catalog.domain.Product;
import com.codingraja.sunelectronics.catalog.service.CatalogService;

/**
 * @author CL Verma
 *
 */

@Service
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private CatalogDao catalogDao;

	public CatalogServiceImpl(CatalogDao catalogDao) {
		super();
		this.catalogDao = catalogDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.codingraja.sunelectronics.catalog.service.ProductService#saveProduct(
	 * com.codingraja.sunelectronics.catalog.domain.Product)
	 */
	@Override
	@Transactional
	public Long saveProduct(Product product) {
		return this.catalogDao.saveProduct(product);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findProductById(java.lang.Long)
	 */
	@Override
	@Transactional
	public Product findProductById(Long productId) {
		return this.catalogDao.findProductById(productId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findProductsByName(java.lang.String)
	 */
	@Override
	public List<Product> findProductsByName(String searchName) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findProductsByName(java.lang.String, int)
	 */
	@Override
	public List<Product> findProductsByName(String searchName, int limit) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findAllProducts()
	 */
	@Override
	@Transactional
	public List<Product> findAllProducts() {
		return this.catalogDao.findAllProducts();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findAllProducts(int)
	 */
	@Override
	public List<Product> findAllProducts(int limit) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findProductsByCategory(java.lang.String)
	 */
	@Override
	public List<Product> findProductsByCategory(String category) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findProductsByCategory(java.lang.String, int)
	 */
	@Override
	public List<Product> findProductsByCategory(String category, int limit) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findProductsByCategoryAndManufacturer(java.lang.String, java.lang.String,
	 * int)
	 */
	@Override
	public List<Product> findProductsByCategoryAndManufacturer(String category, String manufacturer, int limit) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findProductByCategoryAndSubcategory(java.lang.String, java.lang.String)
	 */
	@Override
	@Transactional
	public List<Product> findProductByCategoryAndSubcategory(String category, String subCategory) {
		return this.catalogDao.findProductByCategoryAndSubcategory(category, subCategory);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findRelatedProductsByCategory(java.lang.String)
	 */
	@Override
	@Transactional
	public List<Product> findRelatedProductsByCategory(String category) {
		return this.catalogDao.findRelatedProductsByCategory(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findNewProducts(int)
	 */
	@Override
	@Transactional
	public List<Product> findNewProducts(int limit) {
		return this.catalogDao.findNewProducts(limit);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.catalog.service.ProductService#
	 * findPopularProducts(int)
	 */
	@Override
	public List<Product> findPopularProducts(int limit) {
		return null;
	}

}
