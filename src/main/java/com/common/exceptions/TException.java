package com.common.exceptions;

public class TException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TException(String message) {
		super(message);
	}

	public TException(String message, Throwable cause) {
		super(message, cause);
	}
}
