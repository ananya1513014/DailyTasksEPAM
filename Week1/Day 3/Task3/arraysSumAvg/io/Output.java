/* This class contains functions to display result 
 * and to display message to give input to the user
 */
package com.epam.arraysSumAvg.io;
/**
 * @author Ananya_Goel
 *
 */
public class Output {
	public static void printSumAvg(int sum, double average)
	{
		System.out.println("Sum = "+sum+"\nAverage = "+average);
	}
	public static void getUserInputMessage()
	{
		System.out.println("Enter array size and array elements");
	}
}
