/*
 * Copyright (c) 2012 Spout LLC <http://www.spout.org>
 * All Rights Reserved, unless otherwise granted permission.
 *
 * You may use and modify for private use, fork the official repository
 * for contribution purposes, contribute code, and reuse your own code.
 */
package org.spout.platform.chat.model;

public class ChatMessage {
	private String message;
	private Friend sender;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Friend getSender() {
		return sender;
	}

	public void setSender(Friend sender) {
		this.sender = sender;
	}
}
