package com.creditcardgenerator.exception;

public class CreditCardGeneratorException extends Exception{
	
	private String message;
	
	public CreditCardGeneratorException(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
