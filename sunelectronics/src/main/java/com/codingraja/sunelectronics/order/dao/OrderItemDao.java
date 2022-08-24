/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.order.dao;

import java.util.Set;

import com.codingraja.sunelectronics.order.domain.OrderItem;

/**
 * @author CL Verma
 *
 */
public interface OrderItemDao {
	public OrderItem findOrderItemById(Long orderItemId);

	public Long saveOrderItem(OrderItem orderItem);

	public void delete(Long orderItemId);

	public void priceOrderItem(OrderItem paramOrderItem);

	public void updateOrderItemQuantity(Long orderItemId, Integer quantity);

	public Set<OrderItem> findOrderItemsByOrderId(Long orderId);

	public Integer findOrderItemQuantity(Long orderItemId);
}
