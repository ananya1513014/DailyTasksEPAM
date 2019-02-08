/*
 * This class contains Addition function for Integers
 */
package com.epam.calculator;

/**
 * @author Ananya Goel
 *
 */

import com.epam.calculator.calculatorException.OutOfRangeException;

public class Calculate {
	
	/**
	 * @author Ananya Goel
	 *
	 */

	final int INT_MAX_VALUE=Integer.MAX_VALUE;
	final int INT_MIN_VALUE=Integer.MIN_VALUE;

	public int add(int num1, int num2) throws OutOfRangeException {
		
		int result=0;
		
		if(num2>INT_MAX_VALUE-num1&&num1>=0&&num2>=0)	throw new OutOfRangeException("Result is out of integer range");
		
		else if(num2<INT_MIN_VALUE-num1&&num1<=0&&num2<=0)		throw new OutOfRangeException("Result is out of integer range");
		
		else result = num1+num2;
		
		return result;
	}
}