/**
 * This class implements the Callable interface
 */
package com.epam.futureObject;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author Ananya Goel
 *
 */
public class CallableRandomNoGenerator implements Callable<Integer>{

	String objName;
	
	public CallableRandomNoGenerator(String name)
	{
		this.objName = name;
	}
	
	public Integer call(){
		
		System.out.println("Future Object : " + this.objName + " executing");
		
		return new Random().nextInt();
	}
	
}