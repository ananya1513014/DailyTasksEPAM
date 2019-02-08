/*
 *  a program that display the structure of a specified folder recursively
 */

package com.epam.jan14.directoryStructure;
/**
 * @author Ananya Goel
 *
 */

public class Main {

	public static void main(String[] args)
	{
		try{
		DirectoryStructure.printStructure(args[0], 0);
		}
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("No command line argument found");;			
		}
	}
}