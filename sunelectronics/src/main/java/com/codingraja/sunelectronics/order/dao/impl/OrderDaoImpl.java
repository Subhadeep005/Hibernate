/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * 
 */
package com.codingraja.sunelectronics.order.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.order.dao.OrderDao;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.domain.OrderItemRequestDto;
import com.codingraja.sunelectronics.order.domain.OrderStatus;
import com.codingraja.sunelectronics.payment.domain.PaymentInfo;

/**
 * @author CL Verma
 *
 */
@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

	private static final Logger LOGGER = Logger.getLogger(OrderDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#createNewCartForCustomer(com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	public Order createNewCartForCustomer(Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#createNamedOrderForCustomer(java.lang.String,
	 *      com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	public Order createNamedOrderForCustomer(String name, Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#findNamedOrderForCustomer(java.lang.String,
	 *      com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	public Order findNamedOrderForCustomer(String name, Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#findOrderById(java.lang.Long)
	 */
	@Override
	public Order findOrderById(Long orderId) {
		return this.sessionFactory.getCurrentSession().get(Order.class, orderId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#findCartForCustomer(com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	public Order findCartForCustomer(Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#findOrdersForCustomer(com.codingraja.sunelectronics.core.domain.Customer)
	 */
	@Override
	public List<Order> findOrdersForCustomer(Customer customer) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#findOrdersForCustomer(com.codingraja.sunelectronics.core.domain.Customer,
	 *      com.codingraja.sunelectronics.order.domain.OrderStatus)
	 */
	@Override
	public List<Order> findOrdersForCustomer(Customer customer, OrderStatus status) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#findPaymentInfosForOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	public List<PaymentInfo> findPaymentInfosForOrder(Order order) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#saveOrder(com.codingraja.sunelectronics.order.domain.Order,
	 *      java.lang.Boolean)
	 */
	@Override
	public Order saveOrder(Order order, Boolean priceOrder) {
		Session session = this.sessionFactory.getCurrentSession();
		if (priceOrder) {
			try {
				Order order1 = session.get(Order.class, order.getId());
				order1.setTotalQuantity(order.getTotalQuantity());
				order1.setSubTotal(order.getSubTotal());
				order1.setTotalDiscount(order.getTotalDiscount());
				order.setTotalFulfillmentCharges(order.getTotalFulfillmentCharges());
				order1.setTotal(order.getTotal());

				session.saveOrUpdate(order1);
			} catch (Exception ex) {
				LOGGER.error(ex.getMessage());
			}
		} else {
			session.save(order);
		}

		return session.get(Order.class, order.getId());
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#cancelOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	public void cancelOrder(Order order) {

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#getNullOrder()
	 */
	@Override
	public Order getNullOrder() {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#confirmOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	public Order confirmOrder(Order order) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#addItem(java.lang.Long,
	 *      com.codingraja.sunelectronics.order.domain.OrderItemRequestDto,
	 *      boolean)
	 */
	@Override
	public Long addItem(OrderItem orderItem) {
		return (Long) this.sessionFactory.getCurrentSession().save(orderItem);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#updateItemQuantity(java.lang.Long,
	 *      com.codingraja.sunelectronics.order.domain.OrderItemRequestDto,
	 *      boolean)
	 */
	@Override
	public Order updateItemQuantity(Long orderId, OrderItemRequestDto orderItemRequestDto, boolean priceOrder) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#removeItem(java.lang.Long,
	 *      java.lang.Long, boolean)
	 */
	@Override
	public OrderItem removeItem(Long orderId, Long orderItemId) {
		OrderItem orderItem = this.sessionFactory.getCurrentSession().get(OrderItem.class, orderItemId);
		if (orderItem != null)
			this.sessionFactory.getCurrentSession().delete(orderItem);
		return orderItem;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#addItemFromNamedOrder(com.codingraja.sunelectronics.order.domain.Order,
	 *      com.codingraja.sunelectronics.order.domain.OrderItem, boolean)
	 */
	@Override
	public Order addItemFromNamedOrder(Order namedOrder, OrderItem orderItem, boolean priceOrder) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#addAllItemsFromNamedOrder(com.codingraja.sunelectronics.order.domain.Order,
	 *      boolean)
	 */
	@Override
	public Order addAllItemsFromNamedOrder(Order namedOrder, boolean priceOrder) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#deleteOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	public void deleteOrder(Order cart) {

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderDao#printOrder(com.codingraja.sunelectronics.order.domain.Order)
	 */
	@Override
	public void printOrder(Order order) {

	}

}
