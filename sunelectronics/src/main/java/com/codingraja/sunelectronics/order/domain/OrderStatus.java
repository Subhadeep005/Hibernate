/**
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * 
 */
package com.codingraja.sunelectronics.order.domain;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * An extendible enumeration of order status types.
 * 
 * <ul>
 * <li><b>NAMED</b> - Represents a wishlist</li>
 * <li><b>IN_PROCESS</b> - Represents a cart (non-submitted {@link Order}s)</li>
 * <li><b>SUBMITTED</b> - Used to represent a completed {@link Order}. Note that
 * this also means that the {@link Order} should have its
 * {@link Order#getOrderNumber} set</li>
 * </ul>
 * 
 * @author CL Verma
 *
 */
public class OrderStatus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Map<String, OrderStatus> TYPES = new LinkedHashMap<String, OrderStatus>();

	public static final OrderStatus NAMED = new OrderStatus("NAMED", "Named");
	// public static final OrderStatus QUOTE = new OrderStatus("QUOTE",
	// "Quote");
	public static final OrderStatus IN_PROCESS = new OrderStatus("IN_PROCESS", "In Process");
	public static final OrderStatus SUBMITTED = new OrderStatus("SUBMITTED", "Submitted");
	public static final OrderStatus CANCELLED = new OrderStatus("CANCELLED", "Cancelled");

	public static OrderStatus getInstance(final String type) {
		return TYPES.get(type);
	}

	private String type;
	private String friendlyType;

	public OrderStatus() {
		// do nothing
	}

	public OrderStatus(final String type, final String friendlyType) {
		this.friendlyType = friendlyType;
		setType(type);
	}

	public String getType() {
		return type;
	}

	private void setType(final String type) {
		this.type = type;
		if (!TYPES.containsKey(type)) {
			TYPES.put(type, this);
		}
	}

	public String getFriendlyType() {
		return friendlyType;
	}

	public void setFriendlyType(String friendlyType) {
		this.friendlyType = friendlyType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderStatus other = (OrderStatus) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
