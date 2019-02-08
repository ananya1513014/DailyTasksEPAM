/**
 * This class contains method to take as input an 2D Array from user
 */
package com.epam.multiArray.io;

import java.util.Scanner;

/**
 * @author Ananya_Goel
 *
 */
public class Input {
	static Scanner scannerObj = new Scanner(System.in);
	public static double[][] createMultiArray()
	{		
		int arrLen, arrWidth;
		double[][] multiArray;
		
		arrLen=scannerObj.nextInt(); arrWidth=scannerObj.nextInt();
		
		multiArray= new double[arrLen][arrWidth];
		
		for(int i=0; i<arrLen; i++)
		{
			for(int j=0; j<arrWidth; j++)
			{
				multiArray[i][j]=scannerObj.nextDouble();
			}
		}
		
		return multiArray;
	}
}
