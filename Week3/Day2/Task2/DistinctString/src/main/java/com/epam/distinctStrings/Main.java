/**
 * NOTE: Need to set project compliance to JRE 1.8
 * 
 * This program take a list of strings as input and finds 
 * distinct strings from that list using Stream API
 */
package com.epam.distinctStrings;
/**
 * @author Ananya Goel
 *
 */
import java.util.List;
import java.util.Set;

import com.epam.distinctStrings.io.Input;
import com.epam.distinctStrings.io.Output;

import static java.util.stream.Collectors.toSet;

public class Main {

	/**
	 * Takes a List<String> as input from user
	 * passes the input to getDistinctStrings and prints the result
	 */
	public static void main(String[] args) {

		Output.printGetListInputMessage();		
		Output.printResult(getDistinctStrings(Input.inputStringList()));
	}
	
	/**
	 * @param stringList
	 * @return set of distinct strings
	 */
	public static Set<String> getDistinctStrings(List<String> stringList)
	{
		return stringList.stream()
				 .collect(toSet()); 
	}
}