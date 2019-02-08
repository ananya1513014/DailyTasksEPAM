/**
 * This class contains functions to display result and other messages to user
 */
package com.epam.streamOddEven.io;
/**
 * @author Ananya Goel
 *
 */

import java.util.List;

public class Output {

	public static void printResult(int result)
	{
		System.out.println(result);
	}

	public static void printResult(List<Integer> resultList) {
		System.out.println(resultList);
	}

	public static void printError() {
		System.out.println("Wrong Choice");
	}

	public static void printGetListInputMessage() {
		System.out.println("Enter list size & list elements");
	}
	
	public static void printGetUserChoiceMessage() {
		System.out.println("Select the function you wish to perform:\n1.Get even count\n2.Get even list\n3.Get even sum\n4.Get odd count\n5.Get odd list\n6.Get odd sum");
	}
}
