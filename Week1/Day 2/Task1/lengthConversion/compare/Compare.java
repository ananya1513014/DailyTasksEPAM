/**	This class contains function to compare two values
 * 
 */

package com.epam.jan09.lengthConversion.compare;

import com.epam.jan09.lengthConversion.IO.CompareOutput;
import com.epam.jan09.lengthConversion.IO.Input;
import com.epam.jan09.lengthConversion.convertor.ConvertToCentiMeter;
import com.epam.jan09.lengthConversion.exceptions.InvalidInputException;

/**
 * @author Ananya Goel
 *
 */

public class Compare {
	
	/**	
	 *  WARNING: Unit Input must exactly match the unit spellings (INCH, METER, FEET, CENTIMETER)
	 *  The Units are case insensitive
	 *  InpuValue format : "value unit"		(eg: 100 inch)
	 *  Calls Compare.compareHelper to initialize the input object
	 *  Calls ConvertToCentiMeter.toCenti to convert the input values to centimeter
	 *  compares the converted centimeter values and prints result using CompareOutput class
	 * @throws InvalidInputException 
	 */
	
	public void compare() throws InvalidInputException
	{								
		Input inputObj = Compare.compareHelper();
		double centimeterValue1, centimeterValue2;
		
		centimeterValue1=ConvertToCentiMeter.toCenti(inputObj.getInputValue1());	// converts the inputvalue1 into centimeter
		
		centimeterValue2=ConvertToCentiMeter.toCenti(inputObj.getInputValue2()); 	// converts the inputvalue2 into centimeter
		
		if(centimeterValue1>centimeterValue2)	
			CompareOutput.printResult(inputObj.getInputValue1(), inputObj.getInputValue2());
		
		else if(centimeterValue2>centimeterValue1) 
			CompareOutput.printResult(inputObj.getInputValue2(), inputObj.getInputValue1());
		
		else 
			CompareOutput.printEqualMessage();		
	}	
	
	/*
	 * creates and initializes the input object
	 * returns the input object
	 */
	public static Input compareHelper()
	{
		Input inputObj = new Input();

		CompareOutput.printGetUserInputMessage();
		
		inputObj.setInputValue1();
		inputObj.setInputValue2();
		
		return inputObj;
	}
}