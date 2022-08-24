/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;
import org.springframework.web.context.request.WebRequest;

/**
 * @author CL Verma
 *
 */
public class RequestDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String requestURI;

	private String fullUrlWithQueryString;

	private Boolean secure;

	public RequestDTO() {
	}

	public RequestDTO(HttpServletRequest request) {
		requestURI = request.getRequestURI();
		fullUrlWithQueryString = request.getRequestURL().toString();
		if (StringUtils.isEmpty(request.getQueryString())) {
			fullUrlWithQueryString += "?" + request.getQueryString();
		}
		secure = ("HTTPS".equalsIgnoreCase(request.getScheme()) || request.isSecure());
	}

	public RequestDTO(WebRequest request) {
		// Page level targeting does not work for WebRequest.
		secure = request.isSecure();
	}

	public String getRequestURI() {
		return requestURI;
	}

	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}

	public String getFullUrlWithQueryString() {
		return fullUrlWithQueryString;
	}

	public void setFullUrlWithQueryString(String fullUrlWithQueryString) {
		this.fullUrlWithQueryString = fullUrlWithQueryString;
	}

	public Boolean getSecure() {
		return secure;
	}

	public void setSecure(Boolean secure) {
		this.secure = secure;
	}
}
