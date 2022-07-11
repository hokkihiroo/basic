package com.hokiess.web;

public class AlreadyExistingNumberException extends RuntimeException{
	public AlreadyExistingNumberException(String message) {
		super(message);
	}
}
