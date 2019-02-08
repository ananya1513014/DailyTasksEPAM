/**	This class contains function to convert a value
 * in some particular unit 	to 	some 	other 	unit
 */

package com.epam.jan09.lengthConversion.convertor;

import com.epam.jan09.lengthConversion.IO.ConvertorOutput;
import com.epam.jan09.lengthConversion.IO.Input;
import com.epam.jan09.lengthConversion.exceptions.InvalidInputException;
import com.epam.jan09.lengthConversion.unitEnum.MapInputUnitToEnum;
import com.epam.jan09.lengthConversion.unitEnum.UnitsEnum;

/**
 * @author Ananya Goel
 *
 */

public class Convertor {
	
	
	/*
	 * Calls Convertor.convertHelper to initialize the input object
	 * Calls MapInputUnitToEnum.mapInputUnitToEnum to convert input unit to enum
	 * Calls ConvertToCentiMeter.toCenti to convert input value to centimeter
	 * Calls function from class ConvertFromCentiMeter to get the desired result
	 * Calls ConvertorOutput.printResult to print the result
	 */
	public void convert() throws InvalidInputException 
	{												
		double result, centiMeterValue;
		Input inputObj = Convertor.convertHelper();
				
		UnitsEnum targetUnitEnum = MapInputUnitToEnum.mapInputUnitToEnum(inputObj.getTargetValue());
		centiMeterValue = ConvertToCentiMeter.toCenti(inputObj.getInitialValue());
		
	
		switch (targetUnitEnum){
		
		case METER:
			result=ConvertFromCentiMeter.toMeter(centiMeterValue);
			break;
			
		case INCH:
			result=ConvertFromCentiMeter.toInch(centiMeterValue);
			break;
			
		case FEET:
			result=ConvertFromCentiMeter.toFeet(centiMeterValue);
			break;
		
		case CENTIMETER:
			result = centiMeterValue;
			break;
			
		default:
			result=-1;
			break;
		}
		
		if(result==-1)	throw new InvalidInputException();
		ConvertorOutput.printResult(result);
	}

	/*
	 * creates and initializes the input object
	 * returns the input object
	 */
	public static Input convertHelper()
	{
		Input inputObj = new Input();
		
		ConvertorOutput.printEnterValueMessage();
		inputObj.setInitialValue();
		
		ConvertorOutput.printEnterTargetUnitMessage();
		inputObj.setTargetUnit();
		
		return inputObj;
	}
}