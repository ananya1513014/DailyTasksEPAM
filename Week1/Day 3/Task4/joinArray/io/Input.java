package com.epam.joinArray.io;
/**
 * @author Ananya_Goel
 *
 */

import java.util.Scanner;

public class Input {
	static Scanner scannerObj = new Scanner(System.in);
	public static int[]  generateArray()
	{
		int arraySize, integerArray[];
		
		arraySize = scannerObj.nextInt();		
		integerArray = new int[arraySize];

		for(int i=0; i<arraySize; i++)
		{
			integerArray[i]=scannerObj.nextInt();
		}
		return integerArray;
	}
	
	public static char getSeparatingChar()
	{
		return scannerObj.next().charAt(0);
	}
	
	public static int getChoice()
	{
		return scannerObj.nextInt();
	}
}
