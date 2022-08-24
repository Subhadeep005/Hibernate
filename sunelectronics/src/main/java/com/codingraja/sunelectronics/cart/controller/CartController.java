/**
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.cart.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codingraja.sunelectronics.core.web.CartState;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItemRequestDto;

/**
 * @author CL Verma
 */
@Controller
@RequestMapping("/cart")
public class CartController extends AbstractCartController {

	private static final Logger LOGGER = Logger.getLogger(CartController.class);

	private static final String QUANTITY = "quantity";
	private static final String PRODUCT_ID = "productId";
	private static final String CART_PRICE = "cartPrice";
	private static final String ITEM_ID = "itemId";

	/**
	 * Displays the shopping cart, all the items added into shopping cart and
	 * all the necessary attributes that we want to display on view cart page.
	 */
	@GetMapping("/init")
	public String shoppingCartPage() {
		LOGGER.info("Shopping cart is loading");
		return SHOPPING_CART_PAGE;
	}

	/**
	 * The Sun eCommerce does not show the cart when a product is added.
	 * Instead, when the product is added via an AJAX POST request. We only need
	 * to return a few attributes to update the state of the page. The most
	 * efficient way to do this is to call the regular add controller method,
	 * but instead return a map that contains the necessary attributes. By using
	 * the @ResposeBody tag, Spring will automatically use Jackson to convert
	 * the returned object into JSON for easy processing via JavaScript.
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping(value = "/add", produces = "application/json")
	public @ResponseBody Map<String, String> addItemToCartByJson(HttpServletRequest request) {

		Map<String, String> responseMap = new LinkedHashMap<>();
		String id = request.getParameter(PRODUCT_ID);
		String quantity = request.getParameter(QUANTITY);

		OrderItemRequestDto requestDto = new OrderItemRequestDto();
		requestDto.setProductId(Long.parseLong(id));
		requestDto.setQuantity(Integer.parseInt(quantity));

		Order cart = super.add(requestDto, request);
		CartState.setCart(cart, request);

		responseMap.put(QUANTITY, Integer.toString(cart.getOrderItems().size()));
		responseMap.put(CART_PRICE, "" + cart.getTotal());

		return responseMap;
	}

	/**
	 * This method updates the quantity of OrderItem in the cart . User can
	 * update the quantity by visiting on view Cart page Instead, when the
	 * product is updated via an AJAX POST request. We only need to return a few
	 * attributes to update the state of the page. The most efficient way to do
	 * this is to call the regular add controller method, but instead return a
	 * map that contains the necessary attributes. By using the @ResposeBody
	 * tag, Spring will automatically use Jackson to convert the returned object
	 * into JSON for easy processing via JavaScript.
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping(value = "/update", produces = "application/json")
	public @ResponseBody Map<String, String> updateQuantityByJson(HttpServletRequest request) {

		Map<String, String> responseMap = new LinkedHashMap<>();
		String itemId = request.getParameter(ITEM_ID);
		String productId = request.getParameter(PRODUCT_ID);
		String quantity = request.getParameter(QUANTITY);

		OrderItemRequestDto requestDto = new OrderItemRequestDto();
		requestDto.setItemId(Long.parseLong(itemId));
		requestDto.setProductId(Long.parseLong(productId));
		requestDto.setQuantity(Integer.parseInt(quantity));

		Order cart = super.update(requestDto, request);
		CartState.setCart(cart, request);

		responseMap.put(QUANTITY, Integer.toString(cart.getOrderItems().size()));
		responseMap.put(CART_PRICE, "" + cart.getTotal());

		return responseMap;
	}

	/**
	 * The Sun eCommerce does not show the cart when a product is removed.
	 * Instead, when the product is removed via an AJAX POST request. We only
	 * need to return a few attributes to update the state of the page. The most
	 * efficient way to do this is to call the regular add controller method,
	 * but instead return a map that contains the necessary attributes. By using
	 * the @ResposeBody tag, Spring will automatically use Jackson to convert
	 * the returned object into JSON for easy processing via JavaScript.
	 * 
	 * @param request
	 * @return
	 */
	@PostMapping(value = "/remove", produces = "application/json")
	public @ResponseBody Map<String, String> removeItemFromCartByJson(HttpServletRequest request) {

		Map<String, String> responseMap = new LinkedHashMap<>();
		String itemId = request.getParameter(ITEM_ID);
		String productId = request.getParameter(PRODUCT_ID);
		String quantity = request.getParameter(QUANTITY);

		OrderItemRequestDto requestDto = new OrderItemRequestDto();
		requestDto.setItemId(Long.parseLong(itemId));
		requestDto.setProductId(Long.parseLong(productId));
		requestDto.setQuantity(Integer.parseInt(quantity));

		Order cart = super.remove(requestDto, request);
		CartState.setCart(cart, request);

		responseMap.put(QUANTITY, Integer.toString(cart.getOrderItems().size()));
		responseMap.put(CART_PRICE, "" + cart.getTotal());

		return responseMap;
	}

	/*
	 * @PostMapping(value = "/add", produces = "text/html") public String
	 * addItemToCart(HttpServletRequest request) { String id =
	 * request.getParameter("productId"); String quantity =
	 * request.getParameter("quantity");
	 * 
	 * return "redirect:/"; }
	 */
}
