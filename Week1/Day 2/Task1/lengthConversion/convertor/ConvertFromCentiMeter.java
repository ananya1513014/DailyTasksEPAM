/**	This class contains functions to convert value from 
 *  centimeter to meter, inch and feet
 */

package com.epam.jan09.lengthConversion.convertor;

/**
 * @author Ananya Goel
 *
 */

public class ConvertFromCentiMeter {
	
	public static double toMeter(double value) //accepts a value in cm and converts to meter
	{
		return value/100;
	}
	
	public static double toInch(double value) //accepts a value in cm and converts to inch
	{
		return value/2.54;
	}
	
	public static double toFeet(double value) //accepts a value in cm and converts to feet
	{
		return value/30.48;
	}
}
