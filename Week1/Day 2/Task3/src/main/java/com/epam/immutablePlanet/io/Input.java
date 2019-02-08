/**
 * This class contains methods to take user input using Scanner object
 */
package com.epam.immutablePlanet.io;
/**
 * @author Ananya_Goel
 */

import java.util.Scanner;

public class Input {

	static Scanner scannerObj = new Scanner(System.in);
	
	public static boolean inputBoolean()
	{
		return scannerObj.nextBoolean();
	}
	
	public static int inputInteger()
	{
		return scannerObj.nextInt();
	}
	
	public static String inputString()
	{
		return scannerObj.next();
	}

	public static String inputAnimalName() {
		return scannerObj.next();
	}

	public static String getPlanetName() {
		return scannerObj.next();
	}
}
