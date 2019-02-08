/**
 * Program to demonstrate use of future object and executor service
 * Creating 5 future objects that returns a random number
 * The future objects are passed to a executor service that has a thread pool of fixed size '2'
 * 
 * OUTPUT
 * Future Object : C2 executing
 * Future Object : C1 executing
 * Future Object : C3 executing
 * Future Object : C5 executing
 * Future Object : C4 executing
 * Result from java.util.concurrent.FutureTask@5c647e05 is 1025527299
 * Result from java.util.concurrent.FutureTask@55f96302 is -332019157
 * Result from java.util.concurrent.FutureTask@3d4eac69 is 599904484
 * Result from java.util.concurrent.FutureTask@42a57993 is 1240813292
 * Result from java.util.concurrent.FutureTask@75b84c92 is -1839584532
 */
package com.epam.futureObject;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author Ananya Goel
 *
 */
public class Main {

	/**
	 * @throws InterruptedException
	 * @throws ExecutionException
	 * creates a ExecutorService with a fixed pool size '2'
	 * creates a array of FutureTasks using Helper.class
	 * executes the FutureTasks using ExecutorService
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		ExecutorService pool = Executors.newFixedThreadPool(2);
				
		FutureTask<Integer>[] futureTaskArray = Helper.createFutureTasks();
		
		for(int i=0; i<5; i++)		pool.execute(futureTaskArray[i]);
		
		for(FutureTask<Integer> futureTask : futureTaskArray) 
			{
				System.out.println("Result from "+futureTask.toString()+" is " +futureTask.get());
			}
	}
	
}