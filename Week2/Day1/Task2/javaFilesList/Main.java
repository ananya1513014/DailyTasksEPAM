/**	This program takes the address of a directory as command
 *  line argument and lists all the .java files in that directory
 */ 
package com.epam.jan14.javaFilesList;

import com.epam.jan14.javaFilesList.IO.Output;

/**
 * @author Ananya Goel
 *
 */
public class Main{
	public static void main(String[] args)
	{
		try{
			JavaFilesList.listJavaFiles(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			Output.printError();
		}
	}
}