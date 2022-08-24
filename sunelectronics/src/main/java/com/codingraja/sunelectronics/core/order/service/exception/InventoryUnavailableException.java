/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.order.service.exception;

/**
 * @author CL Verma
 *
 */
public class InventoryUnavailableException extends Exception {
	private static final long serialVersionUID = 1L;
	protected Long skuId;
	protected Integer quantityRequested;
	protected Integer quantityAvailable;

	public InventoryUnavailableException(String msg) {
		super(msg);
	}

	public InventoryUnavailableException(Long skuId, Integer quantityRequested, Integer quantityAvailable) {
		this.skuId = skuId;
		this.quantityAvailable = quantityAvailable;
		this.quantityRequested = quantityRequested;
	}

	public InventoryUnavailableException(String arg0, Long skuId, Integer quantityRequested,
			Integer quantityAvailable) {
		super(arg0);
		this.skuId = skuId;
		this.quantityAvailable = quantityAvailable;
		this.quantityRequested = quantityRequested;
	}

	public InventoryUnavailableException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public Long getSkuId() {
		return this.skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public int getQuantityRequested() {
		return this.quantityRequested.intValue();
	}

	public void setQuantityRequested(int quantityRequested) {
		this.quantityRequested = Integer.valueOf(quantityRequested);
	}

	public int getQuantityAvailable() {
		return this.quantityAvailable.intValue();
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = Integer.valueOf(quantityAvailable);
	}
}
