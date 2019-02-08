/**
 *  * This class contains static functions and provides the output functionality to the Producer objects
 */
package com.epam.producerConsumerProblem.producer;
/**
 * @author Ananya Goel
 *
 */

import java.util.concurrent.BlockingQueue;

public class ProducerOutput {
	public static void printQueueFullMessage()
	{
		System.out.println("Queue is full! Cant add more");
	}
	/**
	 * @param blockingQueue
	 */
	public static void printProducingMessage(BlockingQueue<String> blockingQueue) {
		System.out.println("Producing...\n\nRemaining Space in queue = "+blockingQueue.remainingCapacity()+"\nTotal elements in queue "+blockingQueue.size());
	}

}
