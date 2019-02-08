package com.epam.joinArray.io;
/**
 * @author Ananya_Goel
 *
 */

public class Output {
	public static void printResult(String joinResult)
	{
		System.out.println("Join : "+joinResult);
	}
	
	public static void printArrayInputMessage()
	{
		System.out.println("Enter array size and the array elements");
	}
	public static void printSeparatingCharInputMessage()
	{
		System.out.println("Enter the separating character");
	}
	public static void printUserChoiceInputMessage()
	{
		System.out.println("Enter your choice\n1.Default Join(default separating char is ',')\n2.Custom Join");
	}
	public static String wrongChoiceMessage()
	{
		return "Wrong Choice";
	}

}
