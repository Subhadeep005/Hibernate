/**
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.catalog.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codingraja.sunelectronics.catalog.domain.ProductSearchTag;

/**
 * @author CL Verma
 *
 */

@Controller
public class ProductSearchController {

	private static final Logger LOGGER = Logger.getLogger(CatalogController.class);

	private List<ProductSearchTag> data = new ArrayList<ProductSearchTag>();

	public ProductSearchController() {
		// init data for testing
		data.add(new ProductSearchTag(1, "Digital Camera"));
		data.add(new ProductSearchTag(2, "Laptop"));
		data.add(new ProductSearchTag(3, "Computers"));
		data.add(new ProductSearchTag(4, "Sound Devices"));
		data.add(new ProductSearchTag(5, "Washing Machine"));
		data.add(new ProductSearchTag(6, "Televisions"));
		data.add(new ProductSearchTag(7, "Accessories"));
		data.add(new ProductSearchTag(8, "Mobiles"));

		LOGGER.info("Product Search Data is Initialized");
	}

	@GetMapping("/product/tags")
	public @ResponseBody List<ProductSearchTag> getTags(@RequestParam String tagName) {
		return simulateSearchResult(tagName);
	}

	private List<ProductSearchTag> simulateSearchResult(String tagName) {

		List<ProductSearchTag> result = new ArrayList<ProductSearchTag>();

		// iterate a list and filter by tagName
		for (ProductSearchTag tag : data) {
			String tag1 = tag.getTagName().toLowerCase();
			String tag2 = tagName.toLowerCase();
			if (tag1.contains(tag2)) {
				result.add(tag);
			}
		}

		return result;
	}
}
