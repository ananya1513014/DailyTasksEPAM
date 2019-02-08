/**	This class contains function to convert values from feet
 *  inch and meter to centimeter
 */

package com.epam.jan09.lengthConversion.convertor;

import com.epam.jan09.lengthConversion.exceptions.InvalidInputException;
import com.epam.jan09.lengthConversion.unitEnum.MapInputUnitToEnum;
import com.epam.jan09.lengthConversion.unitEnum.UnitsEnum;

/**
 * @author Ananya Goel
 *
 */

public class ConvertToCentiMeter {
	
	/*
	 * argument (String) format "value unit" (eg. 100 inch)
	 * return equivalent centimeter value of the argument
	 * @throws InvalidInputException whenever argument is not in specified format
	 */
	public static double toCenti(String input) throws InvalidInputException	
	{
		String[]inputSplit = input.split(" ");		
		
		double value=Double.parseDouble(inputSplit[0]);
		String unit=inputSplit[1];		
		UnitsEnum unitEnum = MapInputUnitToEnum.mapInputUnitToEnum(unit);
		switch(unitEnum)
		{
		case FEET:
			value=fromFeet(value);
			break;
			
		case INCH:
			value=fromInch(value);
			break;
			
		case METER:
			value=fromMeter(value);
			break;
		
		case CENTIMETER:
			break;
		default:
			value=-1;
			break;
		}	
		
		if(value==-1)				throw new InvalidInputException();
		
		return value;
	}
	
	public static double fromFeet(double feetVal)		//converts a value from feet to centimeter
	{
		return 30.48*feetVal;
	}
	
	public static double fromInch(double inchVal)				//converts a value from inch to centimeter
	{
		return 2.54*inchVal;
	}
	
	public static double fromMeter(double meterVal)			//converts a value from meter to centimeter
	{
		return 100*meterVal;
	}
}