/**
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.catalog.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
/**
* @author  CL Verma
* @see catalogService
* @see ProductDao
*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingraja.sunelectronics.catalog.service.CatalogService;

@Controller
@RequestMapping("/product")
public class CatalogController {

	private static final Logger LOGGER = Logger.getLogger(CatalogController.class);

	private static final String PRODUCT_LISTING_PAGE = "catalog/productListingPage";
	private static final String PRODUCT_DETAIL_PAGE = "catalog/productDetailPage";

	@Autowired
	private CatalogService catalogService;

	public CatalogController(CatalogService catalogService) {
		this.catalogService = catalogService;

		LOGGER.info("ProductController is Ready, SessionFactory is Injected");
	}

	/**
	 * Loads List<Product> and add to model object and pass that model to the
	 * PRODUCT_LISTING_PAGE to display all products there customer can check the
	 * product details and Add that item to the cart, and wishlist.
	 * 
	 * @param model
	 * @return view page name
	 */
	@RequestMapping("/viewAllProducts")
	public String productListingPage(Model model) {
		model.addAttribute("productList", this.catalogService.findAllProducts());
		return PRODUCT_LISTING_PAGE;
	}

	/**
	 * Loads List<Product> by passing category and sub-category. And add the
	 * List to model object and pass that model to the PRODUCT_LISTING_PAGE to
	 * display all products there customer can check the product details and Add
	 * that item to the cart, and wishlist.
	 * 
	 * @param category
	 * @param subCategory
	 * @param model
	 * @return
	 */
	@RequestMapping("/{category}/{subCategory}")
	public String productListingPage(@PathVariable String category, @PathVariable String subCategory, Model model) {
		if ("sound-device".equals(subCategory))
			subCategory = "Sound Device";
		if ("washing-machine".equals(subCategory))
			subCategory = "Washing Machine";
		model.addAttribute("productList",
				this.catalogService.findProductByCategoryAndSubcategory(category, subCategory));
		return PRODUCT_LISTING_PAGE;
	}

	/**
	 * Loads a specific Product by passing the product ID. And add that Product
	 * to model object and pass that model to the PRODUCT_DETAIL_PAGE to display
	 * the product specification, there customer can check the product details
	 * and Add that item to the cart, wishlist and also can write the reviews.
	 * 
	 * @param category
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("{category}/{id}/productDetail")
	public String productDetailPage(@PathVariable String category, @PathVariable Long id, Model model) {
		model.addAttribute("product", this.catalogService.findProductById(id));
		model.addAttribute("relatedProducts", this.catalogService.findRelatedProductsByCategory(category));
		return PRODUCT_DETAIL_PAGE;
	}

}
