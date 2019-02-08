/**
 * This class contains functions to display result and other messages to user
 */
package com.epam.javaLineReader.io;
/**
 * @author Ananya Goel
 *
 */

import java.util.List;

public class Output {
	public static void printGetFileAddressMessage() {
		
		System.out.println("Enter file address");
	}

	public static void printResult(List<String> javaStrings) {
		System.out.println("Lines containing java in them: " + javaStrings);
	}
}
