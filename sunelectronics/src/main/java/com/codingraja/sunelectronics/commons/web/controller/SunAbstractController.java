/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons.web.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * An abstract controller that provides convenience methods and resource
 * declarations for its children
 * 
 * Operations that are shared between all controllers belong here. To use
 * composition rather than extension, implementors can utilize
 * SunControllerUtility.
 * 
 * @see SunControllerUtility
 * 
 * @author CL Verma
 *
 */
public abstract class SunAbstractController {
	protected boolean isAjaxRequest(HttpServletRequest request) {
		return SunControllerUtility.isAjaxRequest(request);
	}

	protected String getContextPath(HttpServletRequest request) {
		String contextPath = request.getContextPath();
		if (StringUtils.isEmpty(contextPath)) {
			return "/";
		}
		if (contextPath.charAt(0) != '/') {
			contextPath = '/' + contextPath;
		}
		if (contextPath.charAt(contextPath.length() - 1) != '/') {
			contextPath = contextPath + '/';
		}

		return contextPath;
	}

	protected String jsonResponse(HttpServletResponse response, Map<?, ?> responseMap)
			throws JsonGenerationException, JsonMappingException, IOException {
		response.setHeader("Content-Type", "application/json");
		new ObjectMapper().writeValue(response.getWriter(), responseMap);
		return null;
	}
}
