/*
 * a program that can pretty print a given 2D Array
 */
package com.epam.multiArray;
/**
 * @author Ananya_Goel
 *
 */

import com.epam.multiArray.io.Output;
import com.epam.multiArray.io.Input;

public class Main {

	public static void main(String[] args)
	{
		double[][] multiArray;
		
		Output.printGetArrayInputMessage();
		multiArray= Input.createMultiArray();
		
		Output.prettyPrint(multiArray);
	}	
}
