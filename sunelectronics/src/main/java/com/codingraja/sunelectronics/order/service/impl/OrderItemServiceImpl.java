/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.order.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.order.dao.OrderItemDao;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.service.OrderItemService;

/**
 * @author CL Verma
 *
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemDao orderItemDao;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderItemService#findOrderItemById(java.lang.Long)
	 */
	@Override
	@Transactional
	public OrderItem findOrderItemById(Long orderItemId) {
		return this.orderItemDao.findOrderItemById(orderItemId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderItemService#saveOrderItem(com.codingraja.sunelectronics.order.domain.OrderItem)
	 */
	@Override
	@Transactional
	public Long saveOrderItem(OrderItem orderItem) {
		return this.orderItemDao.saveOrderItem(orderItem);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderItemService#delete(com.codingraja.sunelectronics.order.domain.OrderItem)
	 */
	@Override
	@Transactional
	public void delete(Long orderItemId) {
		this.orderItemDao.delete(orderItemId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderItemService#priceOrderItem(com.codingraja.sunelectronics.order.domain.OrderItem)
	 */
	@Override
	public void priceOrderItem(OrderItem paramOrderItem) {
		// TODO Auto-generated method stub

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderItemService#updateOrderItemQuantity(java.lang.Long,
	 *      java.lang.Integer)
	 */
	@Override
	@Transactional
	public void updateOrderItemQuantity(Long orderItemId, Integer quantity) {
		this.orderItemDao.updateOrderItemQuantity(orderItemId, quantity);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderItemService#findOrderItemsByOrderId(java.lang.Long)
	 */
	@Override
	@Transactional
	public Set<OrderItem> findOrderItemsByOrderId(Long orderId) {
		return this.orderItemDao.findOrderItemsByOrderId(orderId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderItemService#findOrderItemQuantity(java.lang.Long)
	 */
	@Override
	@Transactional
	public Integer findOrderItemQuantity(Long orderItemId) {
		return this.orderItemDao.findOrderItemQuantity(orderItemId);
	}

}
