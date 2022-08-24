/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.order.strategy;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codingraja.sunelectronics.core.product.service.ProductService;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.service.OrderItemService;

/**
 * @author CL Verma
 *
 */
@Component
public class OrderPriceStrategy {

	@Autowired
	private ProductService productService;

	@Autowired
	private OrderItemService orderItemService;

	public Order getUpdatedOrderPrice(Order order) {
		// Order order1 = this.orderService.findOrderById(order.getId());
		Set<OrderItem> orderItems = this.orderItemService.findOrderItemsByOrderId(order.getId());

		Integer totalQuantity = 0;
		Double subTotal = 0.0;
		Double totalDiscount = 0.0;
		Double shippingCharge = 0.0;
		Double total;

		for (OrderItem orderItem : orderItems) {
			totalQuantity += getTotalQuantity(orderItem.getId());
			subTotal += getSubTotal(orderItem.getProductId(), orderItem.getQuantity());
		}

		total = subTotal + shippingCharge - totalDiscount;

		order.setTotalQuantity(totalQuantity);
		order.setSubTotal(BigDecimal.valueOf(subTotal));
		order.setTotalFulfillmentCharges(BigDecimal.valueOf(shippingCharge));
		order.setTotalDiscount(BigDecimal.valueOf(totalDiscount));
		order.setTotal(BigDecimal.valueOf(total));

		order.setOrderItems(orderItems);

		return order;
	}

	// private methods implementation for updating Cart details

	private Integer getTotalQuantity(Long orderItemId) {
		return this.orderItemService.findOrderItemQuantity(orderItemId);
	}

	private Double getSubTotal(Long productId, Integer quantity) {
		return quantity * this.productService.findProductPrice(productId);
	}
}
