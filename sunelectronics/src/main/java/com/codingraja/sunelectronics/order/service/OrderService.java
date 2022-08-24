/**
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.order.service;

import java.util.List;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.domain.OrderItemRequestDto;
import com.codingraja.sunelectronics.order.domain.OrderStatus;
import com.codingraja.sunelectronics.payment.domain.PaymentInfo;

/**
 * The general interface for interacting with shopping carts and completed
 * Orders. In Sun eCommerce, a Cart and an Order are the same thing. A "cart"
 * becomes an order after it has been submitted.
 *
 * Most of the methods in this order are used to modify the cart. However, it is
 * also common to use this service for "named" orders (wishlists).
 * 
 * @author CL Verma
 *
 */
public interface OrderService {
	/**
	 * Creates a new Order for the given customer. Generally, you will want to
	 * use the customer that is on the current request, which can be grabbed by
	 * utilizing the CustomerState utility class.
	 */
	public Order createNewCartForCustomer(Customer customer);

	/**
	 * Creates a new Order for the given customer with the given name.
	 * Typically, this represents a "wishlist" order that the customer can save
	 * but not check out with.
	 */
	public Order createNamedOrderForCustomer(String name, Customer customer);

	/**
	 * Looks up an Order by the given customer and a specified order name.
	 * 
	 * This is typically used to retrieve a "wishlist" order.
	 */
	public Order findNamedOrderForCustomer(String name, Customer customer);

	/**
	 * Looks up an Order by its database id
	 */
	public Order findOrderById(Long orderId);

	/**
	 * Looks up the current shopping cart for the customer. Note that a shopping
	 * cart is simply an Order with OrderStatus = IN_PROCESS. If for some reason
	 * the given customer has more than one current IN_PROCESS Order, the
	 * default Sun eCommerce implementation will return the first match found.
	 * Furthermore, also note that the current shopping cart for a customer must
	 * never be named -- an Order with a non-null "name" property indicates that
	 * it is a wishlist and not a shopping cart.
	 */
	public Order findCartForCustomer(Customer customer);

	/**
	 * Looks up all Orders for the specified customer, regardless of current
	 * OrderStatus
	 */
	public List<Order> findOrdersForCustomer(Customer customer);

	/**
	 * Looks up all Orders for the specified customer that are in the specified
	 * OrderStatus.
	 */
	public List<Order> findOrdersForCustomer(Customer customer, OrderStatus status);

	/**
	 * Returns all PaymentInfo objects that are associated with the given order
	 */
	public List<PaymentInfo> findPaymentInfosForOrder(Order order);

	/**
	 * Persists the given order to the database. If the priceOrder flag is set
	 * to true, the pricing workflow will execute before the order is written to
	 * the database. Generally, you will want to price the order in every
	 * request scope once, and preferably on the last call to save() for
	 * performance reasons.
	 */
	public Order saveOrder(Order order, Boolean priceOrder);

	/**
	 * Deletes the given order. Note that the default Sun eCommerce
	 * implementation in OrderServiceImpl will actually remove the Order
	 * instance from the database.
	 */
	public void cancelOrder(Order order);

	/**
	 * The null order is the default order for all customers when they initially
	 * enter the site. Upon the first addition of a product to a cart, a
	 * non-null order will be provisioned for the user.
	 */
	public Order getNullOrder();

	/**
	 * Changes the OrderStatus to SUBMITTED
	 * 
	 * @param order
	 *            to confirm
	 * @return the order that was confirmed
	 */
	public Order confirmOrder(Order order);

	/**
	 * Initiates the addItem workflow that will attempt to add the given
	 * quantity of the specified item to the Order. The item to be added can be
	 * determined in a few different ways.
	 *
	 * The minimum required parameters for OrderItemRequest are: productId and
	 * quantity
	 */
	public Long addItem(OrderItem orderItem);

	/**
	 * Initiates the updateItem workflow that will attempt to update the item
	 * quantity for the specified OrderItem in the given Order. The new quantity
	 * is specified in the OrderItemRequestDto
	 * 
	 * Minimum required parameters for OrderItemRequest: orderItemId, quantity
	 */
	public Order updateItemQuantity(Long orderId, OrderItemRequestDto orderItemRequestDto, boolean priceOrder);

	/**
	 * Initiates the removeItem workflow that will attempt to remove the
	 * specified OrderItem from the given Order
	 */
	public OrderItem removeItem(Long orderId, Long orderItemId);

	/**
	 * Adds the passed in orderItem to the current cart for the same Customer
	 * that owns the named order. This method will remove the item from the
	 * wishlist based on whether the {@link setMoveNamedOrderItems} flag is set.
	 * 
	 * Note that if an item was in a wishlist and is no longer able to be added
	 * to the cart, the item will still be removed from the wishlist.
	 */
	public Order addItemFromNamedOrder(Order namedOrder, OrderItem orderItem, boolean priceOrder);

	/**
	 * Adds all orderItems to the current cart from the same Customer that owns
	 * the named order. This method will remove the item from the wishlist based
	 * on whether the {@link setMoveNamedOrderItems} flag is set.
	 */
	public Order addAllItemsFromNamedOrder(Order namedOrder, boolean priceOrder);

	public void deleteOrder(Order cart);

	/**
	 * This debugging method will print out the current state of the order,
	 * including the items in the order and all pricing related information for
	 * the order.
	 */
	public void printOrder(Order order);
}
