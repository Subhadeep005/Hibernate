/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons.email.service.info;

import java.io.IOException;

/**
 * Implementation of EmailInfo that will not send an Email. The out of box
 * configuration for sun framework does not send emails but does have hooks to
 * send emails for use cases like registration, forgot password, etc.
 *
 * The email send functionality will not send an email if the passed in
 * EmailInfo is an instance of this class.
 * 
 * @author CL Verma
 *
 */
public class NullEmailInfo extends EmailInfo {

	private static final long serialVersionUID = 1L;

	public NullEmailInfo() throws IOException {
		super();
	}

}
