/*
 * This class handles the output for the Compare class
 */
package com.epam.jan09.lengthConversion.IO;

/**
 * @author Ananya Goel
 *
 */

public class CompareOutput {

	public static void printResult(String largerValue, String smallerValue)
	{
		System.out.println(largerValue + " is greater than " + smallerValue);
	}

	public static void printEqualMessage() {
		System.out.println("The values are equal");
	}

	public static void printGetUserInputMessage() {
		System.out.println("Enter the values you wish to compare");		
	}
	
}
