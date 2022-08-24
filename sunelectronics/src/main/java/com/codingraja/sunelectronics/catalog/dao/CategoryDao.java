/**
 * Copyright (c) 2015-2017, www.codingraja.com and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.catalog.dao;

/**
* @author  CL Verma
*/
import java.util.List;

import com.codingraja.sunelectronics.catalog.domain.Category;

public interface CategoryDao {
	public Category saveCategory(Category category);
	public void removeCategory(Category category);
	public Category findCategoryById(Long categoryId);
	public Category findCategoryByName(String categoryName);
	public List<Category> findCategoriesByName(String categoryName);
	public List<Category> findCategoriesByName(String categoryName, int limit);
	public List<Category> findAllCategories();
	public List<Category> findAllCategories(int limit);
}
