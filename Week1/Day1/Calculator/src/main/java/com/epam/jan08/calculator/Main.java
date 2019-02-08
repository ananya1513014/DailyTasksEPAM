/*
 * A calculator application in java using clean code practices
 */
package com.epam.jan08.calculator;
/**
 * @author Ananya Goel
 *
 */

import com.epam.jan08.calculator.io.*;
import com.epam.jan08.calculator.math.*;

public class Main {
	
	public static void main (String[] args)
	{
		Output.inputMessage();	//prints a message to user asking for input
		
	    Input inputObj = new Input();	//creates & initializes the object of Input class
	    
	    double result = Helper.calculateResult(inputObj);	//performs the calculation & stores result in result variable
	    
	    Output.printResult(result);	//prints the result
	}
}