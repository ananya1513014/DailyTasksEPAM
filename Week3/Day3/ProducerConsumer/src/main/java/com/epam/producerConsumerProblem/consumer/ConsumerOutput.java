/**
 * This class contains static functions and provides the output functionality to the Consumer objects
 */
package com.epam.producerConsumerProblem.consumer;
/**
 * @author Ananya Goel
 *
 */

import java.util.concurrent.BlockingQueue;

public class ConsumerOutput {
	public static void printNoConsumableAvailable()
	{
		System.out.println("No consumable availale!");
	}
	/**
	 * @param blockingQueue
]	 */
	public static void printConsumingMessage(BlockingQueue<String> blockingQueue) {
		System.out.println("Consuming....\n\nRemainig elements in queue = " + blockingQueue.size());
	}
}
