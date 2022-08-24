/**
 *Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.commons.email.service.info;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.codingraja.sunelectronics.commons.email.service.message.Attachment;

/**
 * @author CL Verma
 *
 */
public class EmailInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String emailType;
	private String emailTemplate;
	private String subject;
	private String fromAddress;
	private String messageBody;
	private String encoding = "UTF8";
	private List<Attachment> attachments = new ArrayList<Attachment>();

	private String sendEmailReliableAsync;
	private String sendAsyncPriority;

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public String getEmailTemplate() {
		return emailTemplate;
	}

	public void setEmailTemplate(String emailTemplate) {
		this.emailTemplate = emailTemplate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public String getSendEmailReliableAsync() {
		return sendEmailReliableAsync;
	}

	public void setSendEmailReliableAsync(String sendEmailReliableAsync) {
		this.sendEmailReliableAsync = sendEmailReliableAsync;
	}

	public String getSendAsyncPriority() {
		return sendAsyncPriority;
	}

	public void setSendAsyncPriority(String sendAsyncPriority) {
		this.sendAsyncPriority = sendAsyncPriority;
	}
}
