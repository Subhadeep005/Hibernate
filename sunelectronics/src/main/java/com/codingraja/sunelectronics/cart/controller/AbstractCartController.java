/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.cart.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.core.order.strategy.OrderPriceStrategy;
import com.codingraja.sunelectronics.core.product.service.ProductService;
import com.codingraja.sunelectronics.core.service.CustomerService;
import com.codingraja.sunelectronics.core.web.CartState;
import com.codingraja.sunelectronics.core.web.CustomerState;
import com.codingraja.sunelectronics.core.web.OrderItemState;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.domain.OrderItemRequestDto;
import com.codingraja.sunelectronics.order.service.OrderItemService;
import com.codingraja.sunelectronics.order.service.OrderService;

/**
 * @author CL Verma
 *
 */
public abstract class AbstractCartController {

	protected static final String SHOPPING_CART_PAGE = "cart/cart";
	protected static final String REDIRECT_TO_SHOPPING_CART = "redirect:/cart/init";

	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderItemService orderItemService;
	@Autowired
	private ProductService productService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private OrderPriceStrategy orderPriceStrategy;

	public AbstractCartController() {
		// Do Nothing
	}

	/**
	 * This method Adds the item to the cart, first get the cart from
	 * {@link CartState#getCart(HttpServletRequest)} than get the OrderItem
	 * details from
	 * {@link OrderItemState#getOrderItem(com.codingraja.sunelectronics.catalog.domain.Product)}.
	 * And add that to the cart, update and set to current session.
	 * 
	 * @param requestDto
	 * @param request
	 * @return
	 */
	protected Order add(OrderItemRequestDto requestDto, HttpServletRequest request) {
		Order cart = CartState.getCart(request);
		OrderItem orderItem = OrderItemState
				.getOrderItem(this.productService.findProductById(requestDto.getProductId()));

		if (cart.getId() == null) {
			cart = this.orderService.saveOrder(cart, false);
			Customer customer = CustomerState.getCustomer(request);
			CustomerState.setCustomer(customer, request);

			if (customer.getId() == null) {
				Long id = this.customerService.saveCustomer(customer);
				customer.setId(id);
			}

			cart.setCustomer(customer);
			cart.setEmailAddress(customer.getEmail());
		} else {
			cart = this.orderService.findOrderById(cart.getId());
		}

		// Checks, the added OrderItem is already exist in Cart. if exists then
		// update the quantity.
		OrderItem oi = OrderItemState.contains(cart, orderItem.getProductId());
		if (oi != null) {
			OrderItemRequestDto requestDto1 = new OrderItemRequestDto();
			requestDto1.setItemId(oi.getId());
			requestDto1.setQuantity(oi.getQuantity() + 1);
			return this.orderService.saveOrder(updateQuantity(requestDto1, request), true);

		} else {

			orderItem.setOrder(cart);

			// Saves the OrderItem to the database
			this.orderItemService.saveOrderItem(orderItem);

			// Updates the prices of the Cart and returns
			cart = this.orderService.saveOrder(orderPriceStrategy.getUpdatedOrderPrice(cart), true);
		}

		return cart;
	}

	/**
	 * Update the quantity of existing OrderItem in Cart.
	 * 
	 * @param requestDto
	 * @param request
	 * @return
	 */
	protected Order update(OrderItemRequestDto requestDto, HttpServletRequest request) {
		Order cart = CartState.getCart(request);
		cart = updateQuantity(requestDto, request);

		return this.orderService.saveOrder(this.orderPriceStrategy.getUpdatedOrderPrice(cart), true);
	}

	/**
	 * This method removes the item to from cart, first get the cart from
	 * {@link CartState#getCart(HttpServletRequest)} than get the OrderItem
	 * details from
	 * {@link OrderItemState#getOrderItem(com.codingraja.sunelectronics.catalog.domain.Product)}.
	 * And remove that to from cart, update and update to current session.
	 * 
	 * @param requestDto
	 * @param request
	 * @return
	 */
	protected Order remove(OrderItemRequestDto requestDto, HttpServletRequest request) {
		Order cart = CartState.getCart(request);
		cart = this.orderService.findOrderById(cart.getId());

		this.orderItemService.delete(requestDto.getItemId());

		return this.orderService.saveOrder(this.orderPriceStrategy.getUpdatedOrderPrice(cart), true);
	}

	/**
	 * This method updates the quantity of the the existing OrderItem in cart.
	 * 
	 * @param requestDto
	 * @param request
	 * @return
	 */
	private Order updateQuantity(OrderItemRequestDto requestDto, HttpServletRequest request) {
		Order cart = CartState.getCart(request);
		this.orderItemService.updateOrderItemQuantity(requestDto.getItemId(), requestDto.getQuantity());
		return this.orderPriceStrategy.getUpdatedOrderPrice(cart);
	}
}
