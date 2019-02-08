/*
 * This class extends the Exception class
 * Invoked by Calculator.class object
 */
package com.epam.calculator.calculatorException;

/**
 * @author Ananya Goel
 *
 */

public class OutOfRangeException extends Exception{
	
		private static final long serialVersionUID = 1L;
		
		public OutOfRangeException(String exceptionMessage) 
	    { 
			super(exceptionMessage);
	    } 
}
