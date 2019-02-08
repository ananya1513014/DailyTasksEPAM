/**
 * This class implements the Runnable interface
 * Accepts an object of ReentrantLock as constructor
 * Prints even numbers upto 40
 */
package com.epam.reentrantLockOddEven;
/**
 * @author Ananya Goel
 *
 */
import java.util.concurrent.locks.ReentrantLock;

public class Even implements Runnable{

	int evenPointer=2;
	ReentrantLock reentrantLock;
	
	public Even(ReentrantLock reentrantLock) {
		this.reentrantLock=reentrantLock;
	}
	
	/*
	 * This function acquires the ReentrantLock
	 * Prints the evenPointer
	 * Increments the pointer by 2
	 * Unlocks
	 */
	public void run() {
		while(evenPointer<=40)
		{
		reentrantLock.lock();
		System.out.print(this.evenPointer + " ");
		this.evenPointer=this.evenPointer+2;
		reentrantLock.unlock();
		}
	}
}