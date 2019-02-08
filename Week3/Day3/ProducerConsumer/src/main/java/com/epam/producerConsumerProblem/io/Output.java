/**
 * This class contains functions to messages
 */
package com.epam.producerConsumerProblem.io;
/**
 * @author Ananya Goel
 *
 */

public class Output {

	public static void printGetUserChoiceMessage()
	{
		System.out.println("Enter your choice\n\t1.Consume\n\t2.Produce\n\t3.End");
	}
	public static void printGetQueueSizeMessage()
	{
		System.out.println("Enter Blocking Queue Size");
	}
	public static void printWrongChoiceMessage() {
		System.out.println("Wrong choice");
	}

}
