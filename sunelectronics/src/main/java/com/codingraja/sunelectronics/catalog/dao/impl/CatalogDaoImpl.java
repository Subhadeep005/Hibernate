/*
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 *
 * @author  CL Verma
 */

/**
 * 
 */
package com.codingraja.sunelectronics.catalog.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.catalog.dao.CatalogDao;
import com.codingraja.sunelectronics.catalog.domain.Product;

/**
 * @author CL Verma
 *
 */

@Repository
public class CatalogDaoImpl implements CatalogDao {

	@Autowired
	private SessionFactory sessionFactory;
	public CatalogDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#saveProduct(com.codingraja.sunelectronics.catalog.domain.Product)
	 */
	public Long saveProduct(Product product) {
		// TODO Auto-generated method stub
		return (Long)this.sessionFactory.getCurrentSession()
					.save(product);
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findProductById(java.lang.Long)
	 */
	public Product findProductById(Long productId) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
					.get(Product.class, productId);
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findProductsByName(java.lang.String)
	 */
	public List<Product> findProductsByName(String searchName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findProductsByName(java.lang.String, int)
	 */
	public List<Product> findProductsByName(String searchName, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findAllProducts()
	 */
	@SuppressWarnings("unchecked")
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
					.createCriteria(Product.class)
					.list();
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findAllProducts(int)
	 */
	public List<Product> findAllProducts(int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findProductsByCategory(java.lang.String)
	 */
	public List<Product> findProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findProductsByCategory(java.lang.String, int)
	 */
	public List<Product> findProductsByCategory(String category, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findProductsByCategoryAndManufacturer(java.lang.String, java.lang.String, int)
	 */
	public List<Product> findProductsByCategoryAndManufacturer(String category, String manufacturer, int limit) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findProductByCategoryAndSubcategory(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Product> findProductByCategoryAndSubcategory(String category, String subCategory) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				   .createCriteria(Product.class)
				   .add(Restrictions.and(
						   Restrictions.eq("category", category), 
						   Restrictions.eq("subCategory", subCategory)))
				   .list();
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findRelatedProductsByCategory(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Product> findRelatedProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				.createCriteria(Product.class)
				.add(Restrictions.eq("category", category))
				.setMaxResults(4)
				.list();
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findNewProducts(int)
	 */
	@SuppressWarnings("unchecked")
	public List<Product> findNewProducts(int limit) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				.createCriteria(Product.class)
				.addOrder(Order.desc("id"))
				.setMaxResults(limit)
				.list();
	}

	/* (non-Javadoc)
	 * @see com.codingraja.sunelectronics.catalog.dao.ProductDao#findPopularProducts(int)
	 */
	public List<Product> findPopularProducts(int limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
