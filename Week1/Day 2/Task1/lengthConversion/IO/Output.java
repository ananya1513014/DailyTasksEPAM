/*
 * This class contains methods to print message 
 * for getting user choice and wrong choice message
 */
package com.epam.jan09.lengthConversion.IO;

/**
 * @author Ananya Goel
 *
 */

public class Output {
	
	public static void printWrongChoiceMessage()
	{
		System.out.println("Wrong Choice");
	}

	public static void printGetChoiceMessage() {
		System.out.println("Enter your choice\n\t1.Convert\n\t2.Compare");
	}
}
