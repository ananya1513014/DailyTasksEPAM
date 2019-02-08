/*
 * Application to convert and compare between INCH, METER, FEET, CENTIMETER
 * 
 * WARNING: Unit Input must exactly match the unit spelling as above
 *  The Units are case insensitive
 *  InpuValue format : "value unit"		(eg: 100 inch)
 */
package com.epam.jan09.lengthConversion;

import com.epam.jan09.lengthConversion.IO.Input;
import com.epam.jan09.lengthConversion.IO.Output;
import com.epam.jan09.lengthConversion.compare.Compare;
import com.epam.jan09.lengthConversion.convertor.Convertor;
import com.epam.jan09.lengthConversion.exceptions.InvalidInputException;

/**
 * @author Ananya Goel
 *
 */

public class Main {

	/**	
	 * Gets user choice whether Comparison or Conversion intended
	 * Calls the appropriate function according to user choice
	 * Prints error message using Output.printWrongChoiceMessage() for wrong choice
	 * @throws InvalidInputException 
	 */
	public static void main(String[] args) throws InvalidInputException
	{
		Convertor convertorObj = new Convertor();
		Compare compareObj = new Compare();
		Input inputObj = new Input();
		
		Output.printGetChoiceMessage();
		inputObj.setChoice();
				
		switch(inputObj.getChoice())
		{
		case 1:			
			convertorObj.convert();
			break;
			
		case 2:			
			compareObj.compare();
			break;
			
		default:
			Output.printWrongChoiceMessage();
			break;
		}
		
	}
}