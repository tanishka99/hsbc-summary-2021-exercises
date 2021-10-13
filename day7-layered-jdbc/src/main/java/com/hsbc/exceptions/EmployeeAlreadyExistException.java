package com.hsbc.exceptions;

@SuppressWarnings("serial")
public class EmployeeAlreadyExistException extends Exception {
	public EmployeeAlreadyExistException() {
		super();
	}

	public EmployeeAlreadyExistException(String message) {
		super(message);
	}

}
