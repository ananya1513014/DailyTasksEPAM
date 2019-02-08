/**
 * This class extends the Exception class
 * Executed when user account has reached maximum balance limit
 */
package com.epam.bank.exceptions;

public class OverBalanceLimitException extends Exception{

	/**
	 * @author Ananya_Goel
	 */
	private static final long serialVersionUID = -4971409348180583375L;

	public OverBalanceLimitException(String exceptionMessage)
	{
		super(exceptionMessage);
	}
}
