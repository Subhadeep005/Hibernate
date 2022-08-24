/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

/**
 * 
 */
package com.codingraja.sunelectronics.order.domain;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author CL Verma
 *
 */
public class TaxType {
	private static final Map<String, TaxType> TYPES = new LinkedHashMap<String, TaxType>();

	public static final TaxType CITY = new TaxType("CITY", "City");
	public static final TaxType STATE = new TaxType("STATE", "State");
	public static final TaxType DISTRICT = new TaxType("DISTRICT", "District");
	public static final TaxType COUNTY = new TaxType("COUNTY", "County");
	public static final TaxType COUNTRY = new TaxType("COUNTRY", "Country");
	public static final TaxType SHIPPING = new TaxType("SHIPPING", "Shipping");

	// Used by SimpleTaxModule to represent total taxes owed.
	public static final TaxType COMBINED = new TaxType("COMBINED", "Combined");

	public static TaxType getInstance(final String type) {
		return TYPES.get(type);
	}

	private String type;
	private String friendlyType;

	public TaxType() {
		// do nothing
	}

	public TaxType(final String type, final String friendlyType) {
		this.friendlyType = friendlyType;
		setType(type);
	}

	public String getType() {
		return type;
	}

	public String getFriendlyType() {
		return friendlyType;
	}

	private void setType(final String type) {
		this.type = type;
		if (!TYPES.containsKey(type)) {
			TYPES.put(type, this);
		}
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
		TaxType other = (TaxType) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
