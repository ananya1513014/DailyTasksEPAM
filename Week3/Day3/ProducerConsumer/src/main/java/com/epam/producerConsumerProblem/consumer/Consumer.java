/**
 * This class resembles a Consumer for the Producer-Consumer problem
 */
package com.epam.producerConsumerProblem.consumer;
/**
 * @author Ananya Goel
 *
 */

import java.util.concurrent.BlockingQueue;

public class Consumer {
	
	/**
	 * this function accepts object of BlockingQueue as argument
	 * if any consumable is available, it consumes else prints appropriate message
	 * returns the BlockingQueue after consuming
	 * @param blockingQueue
	 * @return blockingQueue
	 */
	public static BlockingQueue<String> consume(BlockingQueue<String> blockingQueue)
	{
		try {
			if(blockingQueue.size()==0)
				ConsumerOutput.printNoConsumableAvailable();
			else 			
			{
				blockingQueue.take();
				ConsumerOutput.printConsumingMessage(blockingQueue);
			}
			return blockingQueue;
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return blockingQueue;
	}
}