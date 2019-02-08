/**
 * This class extends the Exception class
 * Executed when wrong data is provided for account creation
 */
package com.epam.bank.exceptions;

public class WrongDataException extends Exception{

	/**
	 * @author Ananya_Goel
	 */
	private static final long serialVersionUID = 7223132254268537142L;
	
	public WrongDataException(String exceptionMessage)
	{
		super(exceptionMessage);
	}
}
