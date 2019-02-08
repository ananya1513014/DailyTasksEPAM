package com.epam.futureObject;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
 
/**
 * @author Ananya Goel
 *
 */
public class Helper {
	/**
	 * @return array of objects of Callable class RandomNoGenerator
	 */
	public static Callable<Integer>[] createCallables()
	{
		Callable<Integer>[] callableArray = new CallableRandomNoGenerator[5];
		
		callableArray[0] = new CallableRandomNoGenerator("F1");
		callableArray[1] = new CallableRandomNoGenerator("F2");
		callableArray[2]= new CallableRandomNoGenerator("F3");
		callableArray[3] = new CallableRandomNoGenerator("F4");
		callableArray[4] = new CallableRandomNoGenerator("F5");		
		
		return callableArray;
	}
	
	/**
	 * creates and initializes the objects of FutureTask class
	 * refers the createCallables() and initializes FutureTask using the callable objects
	 * 
	 * @return array of objects of FutureTask class
	 */
	public static FutureTask<Integer>[] createFutureTasks()
	{
		FutureTask<Integer>[] futureTaskArray = new FutureTask[5];
		
		Callable<Integer>[] callableArray = createCallables();

		for(int i=0; i<5; i++)
		{
			futureTaskArray[i] = new FutureTask<Integer>(callableArray[i]);
		}
		return futureTaskArray;
	}

}
