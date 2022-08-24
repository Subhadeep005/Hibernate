/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.order.dao.impl;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.order.dao.OrderItemDao;
import com.codingraja.sunelectronics.order.domain.OrderItem;

/**
 * @author CL Verma
 *
 */
@Repository
public class OrderItemDaoImpl implements OrderItemDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderItemDao#findOrderItemById(java.lang.Long)
	 */
	@Override
	public OrderItem findOrderItemById(Long orderItemId) {
		return this.sessionFactory.getCurrentSession().get(OrderItem.class, orderItemId);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderItemDao#saveOrderItem(com.codingraja.sunelectronics.order.domain.OrderItem)
	 */
	@Override
	public Long saveOrderItem(OrderItem orderItem) {
		Long id = (Long) this.sessionFactory.getCurrentSession().save(orderItem);
		return id;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderItemDao#delete(com.codingraja.sunelectronics.order.domain.OrderItem)
	 */
	@Override
	public void delete(Long orderItemId) {
		OrderItem orderItem = this.sessionFactory.getCurrentSession().get(OrderItem.class, orderItemId);
		this.sessionFactory.getCurrentSession().delete(orderItem);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderItemDao#priceOrderItem(com.codingraja.sunelectronics.order.domain.OrderItem)
	 */
	@Override
	public void priceOrderItem(OrderItem paramOrderItem) {
		// TODO Auto-generated method stub

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderItemDao#updateOrderItemQuantity(java.lang.Long,
	 *      java.lang.Integer)
	 */
	@Override
	public void updateOrderItemQuantity(Long orderItemId, Integer quantity) {
		System.out.println("Order Item ID: " + orderItemId);
		System.out.println("Order Item Quantity: " + quantity);
		OrderItem orderItem = this.sessionFactory.getCurrentSession().get(OrderItem.class, orderItemId);
		orderItem.setQuantity(quantity);
		this.sessionFactory.getCurrentSession().update(orderItem);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderItemDao#findOrderItemsByOrderId(java.lang.Long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Set<OrderItem> findOrderItemsByOrderId(Long orderId) {
		String hql = "FROM OrderItem ot WHERE ot.order.id=?";
		List<OrderItem> list = this.sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, orderId).list();
		return new LinkedHashSet<>(list);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.codingraja.sunelectronics.order.dao.OrderItemDao#findOrderItemQuantity(java.lang.Long)
	 */
	@Override
	public Integer findOrderItemQuantity(Long orderItemId) {
		return this.sessionFactory.getCurrentSession().get(OrderItem.class, orderItemId).getQuantity();
	}

}
