/* a program that accepts two, and only two 	command 	line arguments,
 * if	the	first parameter is  0, 	covert	 the second  parameter 	  from
 * Celsius to	Fahrenheit. Otherwise, 	do 	the 	conversion 	 backwards.
 */
package com.epam.centigradeToFahrenheit;

import com.epam.centigradeToFahrenheit.IO.Output;

/**
 * @author Ananya_Goel
 *
 */
public class Main {

	public static void main(String[] args)
	{
		Output.printResult(ConversionOperation.calculateResult(Double.parseDouble(args[1]), Integer.parseInt(args[0])));
	}
}
