/**
 * This class contains methods to display messages to user
 */
package com.epam.jan16.shapes.io;

/**
 * @author Ananya_Goel
 */
public class Output {
	
	public static void printGetShapeNameMessage()
	{
		System.out.println("Enter shape name");
	}
	
	public static void printShapeNotSupportedMessage()
	{
		System.out.println("This shape is not yet supported");
	}

	public static void printNullPointerMessage() {
		System.out.println("Cannot draw a undefined shape");
	}
}