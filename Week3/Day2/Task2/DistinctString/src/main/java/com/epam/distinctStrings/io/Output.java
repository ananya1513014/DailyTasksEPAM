/**
 * This class contains functions to display result & other messages to user
 */
package com.epam.distinctStrings.io;
/**
 * @author Ananya Goel
 *
 */

import java.util.Set;

public class Output {

	public static void printGetListInputMessage() {
		System.out.println("Enter list size & list elements");
	}
	
	public static void printResult(Set<String> stringSet)
	{
		System.out.println(stringSet);
	}
}
