/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * 
 */
package com.codingraja.sunelectronics.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.order.dao.OrderDao;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.domain.OrderItemRequestDto;
import com.codingraja.sunelectronics.order.domain.OrderStatus;
import com.codingraja.sunelectronics.order.service.OrderService;
import com.codingraja.sunelectronics.payment.domain.PaymentInfo;

/**
 * @author CL Verma
 *
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#createNewCartForCustomer(com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	@Transactional
	public Order createNewCartForCustomer(Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#createNamedOrderForCustomer(java.lang.String,
	 *      com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	@Transactional
	public Order createNamedOrderForCustomer(String name, Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#findNamedOrderForCustomer(java.lang.String,
	 *      com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	@Transactional
	public Order findNamedOrderForCustomer(String name, Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#findOrderById(java.lang.Long)
	 */
	@Override
	@Transactional
	public Order findOrderById(Long orderId) {
		return this.orderDao.findOrderById(orderId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#findCartForCustomer(com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	@Transactional
	public Order findCartForCustomer(Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#findOrdersForCustomer(com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	@Transactional
	public List<Order> findOrdersForCustomer(Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#findOrdersForCustomer(com.codingraja.sunelectronics.core.domain.Customer,
	 *      com.codingraja.sunelectronics.order.domain.OrderStatus)
	 */
	@Override
	@Transactional
	public List<Order> findOrdersForCustomer(Customer customer, OrderStatus status) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#findPaymentInfosForOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	@Transactional
	public List<PaymentInfo> findPaymentInfosForOrder(Order order) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#saveOrder(com.codingraja.sunelectronics.order.domain.Order,
	 *      java.lang.Boolean)
	 */
	@Override
	@Transactional
	public Order saveOrder(Order order, Boolean priceOrder) {
		return this.orderDao.saveOrder(order, priceOrder);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#cancelOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	@Transactional
	public void cancelOrder(Order order) {

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#getNullOrder()
	 */
	@Override
	@Transactional
	public Order getNullOrder() {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#confirmOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	@Transactional
	public Order confirmOrder(Order order) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#addItem(java.lang.Long,
	 *      com.codingraja.sunelectronics.order.domain.OrderItemRequestDto,
	 *      boolean)
	 */
	@Override
	@Transactional
	public Long addItem(OrderItem orderItem) {
		return this.orderDao.addItem(orderItem);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#updateItemQuantity(java.lang.Long,
	 *      com.codingraja.sunelectronics.order.domain.OrderItemRequestDto,
	 *      boolean)
	 */
	@Override
	@Transactional
	public Order updateItemQuantity(Long orderId, OrderItemRequestDto orderItemRequestDto, boolean priceOrder) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#removeItem(java.lang.Long,
	 *      java.lang.Long, boolean)
	 */
	@Override
	@Transactional
	public OrderItem removeItem(Long orderId, Long orderItemId) {
		return this.orderDao.removeItem(orderId, orderItemId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#addItemFromNamedOrder(com.codingraja.sunelectronics.order.domain.Order,
	 *      com.codingraja.sunelectronics.order.domain.OrderItem, boolean)
	 */
	@Override
	@Transactional
	public Order addItemFromNamedOrder(Order namedOrder, OrderItem orderItem, boolean priceOrder) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#addAllItemsFromNamedOrder(com.codingraja.sunelectronics.order.domain.Order,
	 *      boolean)
	 */
	@Override
	@Transactional
	public Order addAllItemsFromNamedOrder(Order namedOrder, boolean priceOrder) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#deleteOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	@Transactional
	public void deleteOrder(Order cart) {

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.service.OrderService#printOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	@Transactional
	public void printOrder(Order order) {

	}

}
