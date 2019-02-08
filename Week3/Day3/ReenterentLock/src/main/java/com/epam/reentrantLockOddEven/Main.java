/**
 *  Application 	that 	using 2  concurrent threads one 
 *  for 	printing	 even and   other odd numbers using 
 *  reentrant lock print integers in their sequential order
 */
package com.epam.reentrantLockOddEven;
/**
 * @author Ananya Goel
 *
 */
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	/**
	 * Creates an object of ReentrantLock
	 * Creates threads of Runnable classes Odd and Even
	 * Both the threads are started
	 */
	public static void main(String[] args)
	{
		ReentrantLock reentrantLock = new ReentrantLock(true);
		
		Thread oddThread = new Thread(new Odd(reentrantLock));
		Thread evenThread = new Thread(new Even(reentrantLock));
		
		oddThread.start();
		evenThread.start();
	}
}