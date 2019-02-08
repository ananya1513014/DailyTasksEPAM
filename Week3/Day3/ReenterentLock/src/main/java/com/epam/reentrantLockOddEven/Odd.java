/**
 * This class implements the Runnable interface
 * Accepts an object of ReentrantLock as constructor
 * Prints odd numbers upto 40
 */
package com.epam.reentrantLockOddEven;
/**
 * @author Ananya Goel
 *
 */
import java.util.concurrent.locks.ReentrantLock;

public class Odd implements Runnable{

	int oddPointer=1;
	ReentrantLock reentrantLock;
	public Odd(ReentrantLock reentrantLock) {
		this.reentrantLock = reentrantLock;
	}
	
	/*
	 * This function acquires the ReentrantLock
	 * Prints the oddPointer
	 * Increments the pointer by 2
	 * Unlocks
	 */	
	public void run() {
		while(oddPointer<=40)
		{
		reentrantLock.lock();
		System.out.print(this.oddPointer + " ");
		this.oddPointer= this.oddPointer+2;
		reentrantLock.unlock();
		}
	}
}