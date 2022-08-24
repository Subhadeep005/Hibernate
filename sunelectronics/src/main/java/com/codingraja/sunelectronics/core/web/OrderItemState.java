/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * 
 */
package com.codingraja.sunelectronics.core.web;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.codingraja.sunelectronics.catalog.domain.Product;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItem;

/**
 * @author CL Verma
 *
 */
@Component
public class OrderItemState {

	private OrderItemState() {
		// Do Nothing
	}

	public static OrderItem getOrderItem(Product product) {
		OrderItem item = new OrderItem();

		item.setProductId(product.getId());
		item.setUrl(product.getUrl());
		item.setName(product.getName());
		item.setModel(product.getModel());
		item.setManufacturer(product.getManufacturer());
		item.setCategory(product.getCategory());
		item.setSubCategory(product.getSubCategory());
		item.setRetailPrice(product.getPrice());
		item.setSalePrice(product.getPrice());
		item.setDiscount(new BigDecimal(0));
		item.setQuantity(1);
		item.setShippingCharge(new BigDecimal(0));

		return item;
	}

	public static OrderItem contains(Order order, Long productId) {
		if (order == null)
			return null;
		else {
			Set<OrderItem> orderItems = order.getOrderItems();
			if (orderItems != null) {
				for (OrderItem orderItem : orderItems) {
					if (orderItem.getProductId().equals(productId))
						return orderItem;
				}
			}
			return null;
		}
	}
}
