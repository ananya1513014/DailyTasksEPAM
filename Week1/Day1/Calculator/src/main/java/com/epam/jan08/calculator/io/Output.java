/*
 * This class contains methods to print result, errors and message for user
 */
package com.epam.jan08.calculator.io;

import org.apache.log4j.Logger;

/**
 * @author Ananya Goel
 *
 */
public class Output {
	
	private static Logger loggerObj = Logger.getLogger(Output.class);
	
	private Output()
	{
		//left blank intentionally
	}
	public static void printResult(double result)
	{
	     loggerObj.info("Result = " + result);
	}
	
	public static void printError()
	{
	     loggerObj.info("Wrong Choice");
	}

	public static void inputMessage() {
	     loggerObj.info("Enter your choice\n\t1.Add\n\t2.Substract\n\t3.Multiply\n\t4.Divide\n\nEnter 2 Operands");
	}
}