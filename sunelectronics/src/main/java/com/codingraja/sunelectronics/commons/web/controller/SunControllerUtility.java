/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

/**
 * Commonly used Sun Controller operations. - ajaxRedirects - isAjaxRequest -
 * ajaxRender
 * 
 * SunAbstractController provides convenience methods for this functionality.
 * Implementors who are not able (or willing) to have their Controllers extend
 * SunAbstractController can utilize this utility class to achieve some of the
 * same benefits.
 * 
 * @author CL Verma
 *
 */
public class SunControllerUtility {
	protected static final Logger LOGGER = Logger.getLogger(SunControllerUtility.class);

	public static final String SUN_REDIRECT_ATTRIBUTE = "blc_redirect";
	public static final String SUN_AJAX_PARAMETER = "sunAjax";

	private SunControllerUtility() {
		// Do Nothing
	}

	/**
	 * A helper method that returns whether or not the given request was invoked
	 * via an AJAX call
	 * 
	 * Returns true if the request contains the XMLHttpRequest header or a
	 * sunAjax=true parameter.
	 * 
	 * @param request
	 * @return - whether or not it was an AJAX request
	 */
	public static boolean isAjaxRequest(HttpServletRequest request) {
		return isAjaxRequest(new ServletWebRequest(request));
	}

	public static boolean isAjaxRequest(WebRequest request) {
		String ajaxParameter = request.getParameter(SUN_AJAX_PARAMETER);
		String requestedWithHeader = request.getHeader("X-Requested-With");
		boolean result = (ajaxParameter != null && "true".equals(ajaxParameter))
				|| "XMLHttpRequest".equals(requestedWithHeader);

		if (LOGGER.isTraceEnabled()) {
			StringBuilder sb = new StringBuilder().append("Request URL: [").append(request.getContextPath()).append("]")
					.append(" - ").append("ajaxParam: [").append(String.valueOf(ajaxParameter)).append("]")
					.append(" - ").append("X-Requested-With: [").append(requestedWithHeader).append("]").append(" - ")
					.append("Returning: [").append(result).append("]");
			LOGGER.trace(sb.toString());
		}

		return result;
	}
}
