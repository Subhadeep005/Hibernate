/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

/**
 * Generic interface that should be used for processing requests from Servlet
 * Filters, Spring interceptors or Portlet filters. Note that the actual type of
 * the request passed in should be something that extends
 * {@link NativeWebRequest}.
 * 
 * <p>
 * Also note that you should always instantiate the {@link WebRequest} with as
 * much information available. In the above example, this means using both the
 * {@link HttpServletRequest} and {@link HttpServletResponse} when instantiating
 * the {@link ServletWebRequest}
 * </p>
 * 
 * @author CL Verma
 *
 */
public interface SunWebRequestProcessor {

	/**
	 * Process the current request. Examples would be setting the currently
	 * logged in customer on the request or handling anonymous customers in
	 * session
	 * 
	 * @param request
	 */
	public void process(WebRequest request);

	/**
	 * Should be called if work needs to be done after the request has been
	 * processed.
	 * 
	 * @param request
	 */
	public void postProcess(WebRequest request);

}
