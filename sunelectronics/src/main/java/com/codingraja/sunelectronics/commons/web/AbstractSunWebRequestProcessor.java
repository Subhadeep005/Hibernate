/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons.web;

import org.springframework.web.context.request.WebRequest;

/**
 * Provides no-op implementations to optional methods
 * 
 * @author CL Verma
 *
 */
public abstract class AbstractSunWebRequestProcessor implements SunWebRequestProcessor {

	@Override
	public void postProcess(WebRequest request) {
		// Do Nothing
	}

}
