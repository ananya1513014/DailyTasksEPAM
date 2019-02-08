/**
 * This class extends the Exception class
 * Executed when the user account does not have sufficient balance to perform current transaction
 */
package com.epam.bank.exceptions;

public class NotEnoughBalanceException extends Exception{

	/**
	 * @author Ananya_Goel
	 */
	private static final long serialVersionUID = 6010251636991706086L;

	public NotEnoughBalanceException(String exceptionMessage)
	{
		super(exceptionMessage);
	}
}
