/**
 * This class contains functions to display result & other messages to user
 */
package com.epam.functionalinterface.io;
/**
 * @author Ananya Goel
 */
public class Output {

	public static void wrongInputError()
	{
		System.out.println("Wrong Input");
	}
	
	public static void isVowel()
	{
		System.out.println("Given input is a vowel");		
	}
	
	public static void isNotVowel()
	{
		System.out.println("Given input is not a vowel");		
	}
	
	public static void printGetUserChoiceMessage()
	{
		System.out.println("Select the functional interface that you wish to test:"
				+ "\n1.Predicate Interface"
				+ "\n2.Supplier Interface"
				+ "\n3.Consumer Interface"
				+ "\n4.BiConsumer Interface");
	}
	
	public static void printString(String string)
	{
		System.out.println(string);
	}
	
}
