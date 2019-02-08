/*
 * This class contains function to get user input and generate an Integer array
 */

package com.epam.arraysSumAvg.io;
/**
 * @author Ananya_Goel
 *
 */
import java.util.Scanner;

public class Input {
	
	static Scanner scannerObj = new Scanner(System.in);
	
	public static Integer[]  generateArray()
	{
		int arraySize;
		Integer[] integerArray;
		
		arraySize = scannerObj.nextInt();
		
		integerArray = new Integer[arraySize];

		for(int i=0; i<arraySize; i++)
		{
			integerArray[i]=scannerObj.nextInt();
		}
		
		return integerArray;
	}
}
