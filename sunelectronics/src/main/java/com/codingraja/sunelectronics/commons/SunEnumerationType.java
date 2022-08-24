/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons;

/**
 * In order for the Sun Administration to display enumerated values with
 * meaningful labels, enumerations should implement this interface.
 * 
 * @author CL Verma
 *
 */
public interface SunEnumerationType {
	public String getType();

	public String getFriendlyType();
}
