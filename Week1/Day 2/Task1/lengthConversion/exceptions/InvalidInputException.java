/**
 * This Exception is invoked whenever the user input is not in the expected format
 * Expected InpuValue format : "value unit"		(eg: 100 inch)
 */
package com.epam.jan09.lengthConversion.exceptions;

/**
 * @author Ananya_Goel
 *
 */
public class InvalidInputException extends Exception{

	private static final long serialVersionUID = -5131733443989869431L;
	public InvalidInputException()
	{
		super("Unsupported/Invalid input format");
	}
}
