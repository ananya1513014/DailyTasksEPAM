/**
 * This class contains methods to get input from user
 */
package com.epam.functionalinterface.io;
/**
 * @author Ananya Goel
 */
import java.util.Scanner;

public class Input {
	public static Scanner scannerObj = new Scanner(System.in);
	
	public static int getChoice()
	{	
		return scannerObj.nextInt();
	}
	
	public static char getCharacter()
	{
		char character;
		System.out.println("Enter a character to check if it is vowel or not");
		character = scannerObj.next().charAt(0);
		return character;
	}
	
	public static int getNum()
	{
		int num;		
		System.out.println("Enter a number");
		num = scannerObj.nextInt();
		return num;		
	}
}
