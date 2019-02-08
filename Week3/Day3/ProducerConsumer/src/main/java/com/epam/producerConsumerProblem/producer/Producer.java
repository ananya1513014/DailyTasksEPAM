/**
 * This class represents the producer for Producer-Consumer problem
 */
package com.epam.producerConsumerProblem.producer;
/**
 * @author Ananya Goel
 *
 */

import java.util.concurrent.BlockingQueue;

public class Producer {
	
	/**
	 * this function accepts object of BlockingQueue as argument
	 * if space is available in the queue, it produces else prints appropriate message
	 * returns the BlockingQueue after producing
	 * @param blockingQueue
	 * @return blockingQueue
	 */
	public static BlockingQueue<String> produce(BlockingQueue<String> blockingQueue)
	{
		if(blockingQueue.remainingCapacity()==0)
			ProducerOutput.printQueueFullMessage();
		else 
		{
			blockingQueue.add("Item");
			ProducerOutput.printProducingMessage(blockingQueue);
		}
		return blockingQueue;
	}	
}
