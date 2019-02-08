/* A program which joins the elements of an array into one string.
 * The separator character must be optional.
 */
package com.epam.joinArray;

import com.epam.joinArray.Utilities.Helper;

/**
 * @author Ananya_Goel
 *
 */

import com.epam.joinArray.io.*;

public class Main {

	public static void main(String[] args)
	{
		String joinResult;
		int integerArray[], choice;

		Output.printArrayInputMessage();
		integerArray = Input.generateArray();
		
		Output.printUserChoiceInputMessage();
		choice = Input.getChoice();
		
		joinResult = Helper.joinArrayHelper(integerArray, choice);
		
		Output.printResult(joinResult);
	}

}