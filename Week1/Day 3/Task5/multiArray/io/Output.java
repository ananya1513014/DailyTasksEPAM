/**
 * This class contains methods to pretty print a array
 * and another method to display message to user
 */
package com.epam.multiArray.io;

/**
 * @author Ananya_Goel
 *
 */
public class Output {
	public static void prettyPrint(double[][] multiArray)
	{
		for(double[] arrRow : multiArray)
		{
			for(double value: arrRow)
			{
				System.out.print(String.format("%.1f", value) + " ");
			}
			System.out.println();
		}
	}
	
	public static void printGetArrayInputMessage()
	{
		System.out.println("Enter length, width and the elements of the array");
	}
}
