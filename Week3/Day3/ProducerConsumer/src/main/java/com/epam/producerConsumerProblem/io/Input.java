/**
 * This class contains functions to get input from user using Scanner class
 */
package com.epam.producerConsumerProblem.io;
/**
 * @author Ananya Goel
 *
 */
import java.util.Scanner;

public class Input {
	public static Scanner scannerObj = new Scanner(System.in);
	
	public static int getChoice()
	{	
		return scannerObj.nextInt();
	}
	
	public static int getBlockingQueueSize()
	{	
		return scannerObj.nextInt();
	}

}
