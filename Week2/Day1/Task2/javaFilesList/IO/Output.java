/**
 * conatains functions to print *.java files and for printing error
 */
package com.epam.jan14.javaFilesList.IO;

import java.util.List;

/**
 * @author Ananya Goel
 *
 */
public class Output {

	//prints all the java file names in the given folder
	public static void printJavaFiles(List<String> javaFileList)
	{
		for(String javaFile: javaFileList)
		{
			System.out.println(javaFile);
		}
	}
	
	//Executed when no command line argument is present
	public static void printError()
	{
		System.out.println("No command line argument found");
	}
}
