/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons.currency.domain;

/**
 * The SunCurrencyResolver can be implemented to set the currency (e.g.
 * CurrencyToUse).
 * 
 * This may differ from the currency that was requested (e.g. from the locale,
 * etc.)
 * 
 * By storing the desired currency, we have the opportunity for a later module
 * (like PriceLists) to check the DesiredCurrency and possibly alter the
 * currency for the request.
 * 
 * 
 * @author CL Verma
 *
 */
public class SunRequestedCurrencyDTO {
	private SunCurrency currencyToUse;
	private SunCurrency requestedCurrency;

	public SunRequestedCurrencyDTO(SunCurrency currencyToUse, SunCurrency requestedCurrency) {
		super();
		this.currencyToUse = currencyToUse;
		this.requestedCurrency = requestedCurrency;
	}

	public SunCurrency getCurrencyToUse() {
		return currencyToUse;
	}

	public void setCurrencyToUse(SunCurrency currencyToUse) {
		this.currencyToUse = currencyToUse;
	}

	public SunCurrency getRequestedCurrency() {
		return requestedCurrency;
	}

	public void setRequestedCurrency(SunCurrency requestedCurrency) {
		this.requestedCurrency = requestedCurrency;
	}
}
