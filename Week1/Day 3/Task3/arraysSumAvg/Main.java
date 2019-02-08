/*
 * A program to evaluate the sum and average of an integer array
 */
package com.epam.arraysSumAvg;
/**
 * @author Ananya_Goel
 *
 */
import com.epam.arraysSumAvg.io.Input;
import com.epam.arraysSumAvg.io.Output;

public class Main {
	public static void main(String[] args)
	{
		double average;
		int sum;
		Integer integerArray[];
		
		Output.getUserInputMessage();
		integerArray = Input.generateArray();
		
		sum=ArrayOperations.calculateArraySum(integerArray);
		average=ArrayOperations.calculateArrayAverage(integerArray);
		
		Output.printSumAvg(sum, average);
	}	
}