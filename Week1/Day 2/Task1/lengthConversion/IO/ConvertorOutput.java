/**
 * Convertor.class depends on this class
 * This class contains methods to print result and to print messages to the user
 */
package com.epam.jan09.lengthConversion.IO;

/**
 * @author Ananya_Goel
 *
 */
public class ConvertorOutput {

	public static void printEnterValueMessage()
	{
		System.out.println("Enter the value you wish to convert");
	}

	public static void printEnterTargetUnitMessage() {
		System.out.println("Enter the target unit");					
	}
	
	public static void printResult(Double result)
	{
		if(result<0)
			printErrorMessage();
		else
			System.out.println("Converted Value = " + Double.toString(result));
	}
	
	public static void printErrorMessage() {
		System.out.println("Error! \n Wrong input");
	}
}
