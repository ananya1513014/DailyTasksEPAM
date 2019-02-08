/* This  class  contains  functions  to  convert 
 * centigrade value to fahrenheit and vice versa
 */

package com.epam.centigradeToFahrenheit.Operations;
/**
 * @author Ananya_Goel
 *
 */

public class ConversionOperation {
	public static double calculateResult(double initialTemp, int choice)
	{
		double targetTemp;
		
		if(choice==0)
			targetTemp = centigradeToFahrenheit(initialTemp);
		else
			targetTemp = fahrenheitToCentigrade(initialTemp);

		return targetTemp;
	}
	
	public static double centigradeToFahrenheit(double tempInCentigrade)
	{
		return (tempInCentigrade*9/5)+32;
	}
	public static double fahrenheitToCentigrade(double tempInFahrenheit)
	{
		return (tempInFahrenheit-32)*5/9;
	}
}
