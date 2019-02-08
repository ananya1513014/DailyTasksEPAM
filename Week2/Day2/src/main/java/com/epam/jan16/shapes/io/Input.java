/**
 * This class contains functions to take user input
 */
package com.epam.jan16.shapes.io;
/**
 * @author Ananya_Goel
 */
import java.util.Scanner;

public class Input {

	static Scanner scannerObj = new Scanner(System.in);
	
	public static int getUserChoice()
	{
		return scannerObj.nextInt();
	}
	
	public static String getShapeName()
	{
		return scannerObj.next();
	}
}
