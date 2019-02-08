/**
 *  NOTE: Need to change project compliance to JRE 1.8
 * 
 *  This program take 	address	 of	 a 	text file as input, 
 *  read the file line by 	line and  	if "java" is present 
 *  in any line then print the complete line using Stream API.
 */

package com.epam.javaLineReader;
import java.io.IOException;
/**
 * @author Ananya Goel
 *
 */
import java.util.List;

import com.epam.javaLineReader.io.Input;
import com.epam.javaLineReader.io.Output;

public class Main {

	public static void main(String[] args) throws IOException
	{		
		Output.printGetFileAddressMessage();
		List<String> fileLines = Utilities.getFileLines(args[0]);
		
		Output.printResult(Utilities.getJavaLines(fileLines)); 
	}
}