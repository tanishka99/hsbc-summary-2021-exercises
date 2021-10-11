package com.hsbc.exceptions;

public class EmployeeAlreadyExistException extends Exception {
	public EmployeeAlreadyExistException() {
		super();
	}

	public EmployeeAlreadyExistException(String message) {
		super(message);
	}

}
