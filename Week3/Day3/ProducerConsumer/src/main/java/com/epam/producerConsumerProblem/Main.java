/**
 *  Program to demonstrate producer consumer problem using blocking queue
 */
package com.epam.producerConsumerProblem;
/**
 * @author Ananya Goel
 *
 */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.epam.producerConsumerProblem.consumer.Consumer;
import com.epam.producerConsumerProblem.io.*;
import com.epam.producerConsumerProblem.producer.Producer;

public class Main {

	/**
	 * Gets size of BlockingQueue from user using Input class
	 * Creates object of ArrayBlockingQueue
	 * calls Main.choiceMenu
	 * @param args
	 */
	public static void main(String[] args)
	{	
		Output.printGetQueueSizeMessage();		
		choiceMenu(new ArrayBlockingQueue<String>(Input.getBlockingQueueSize()));
	}
	
	/**
	 * Gets user choice(produce/consume)
	 * Calls the specific function according to user input
	 * @param blockingQueue
	 */
	public static void choiceMenu(BlockingQueue<String> blockingQueue)
	{
			Output.printGetUserChoiceMessage();
			
			switch(Input.getChoice())
			 {
				case 1:
					choiceMenu(Consumer.consume(blockingQueue));
					break;
					
				case 2:
					choiceMenu(Producer.produce(blockingQueue));
					break;
					
				case 3:
					break;
					
				default:
					Output.printWrongChoiceMessage();
					choiceMenu(blockingQueue);
					break;
			 }
	}
	
}
