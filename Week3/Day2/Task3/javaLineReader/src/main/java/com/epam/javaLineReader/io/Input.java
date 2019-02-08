/**
 * This class contains functions to accept input from user
 */
package com.epam.javaLineReader.io;
/**
 * @author Ananya Goel
 *
 */
import java.util.Scanner;

public class Input {

	static Scanner scannerObj = new Scanner(System.in);
	
	public static String inputFileAddress()
	{
		return scannerObj.next();
	}
}
