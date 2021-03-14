package com.capg.empapp.exceptions;

public class InvalidEmployeeIDException extends Exception {
	public String toString() {
		return "InvalidEmployeeException:- Entered Employee ID is Not a Valid ID ";
	}
}
