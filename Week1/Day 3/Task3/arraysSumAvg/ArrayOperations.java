/*
 *  This class contains functions to calculate sum and average of an Integer Array
 */
package com.epam.arraysSumAvg;
/**
 * @author Ananya_Goel
 *
 */
import java.util.Arrays;
import java.util.List;

public class ArrayOperations {
	public static int calculateArraySum(Integer[] integerArray)
	{
		List<Integer> list = Arrays.asList(integerArray);
		
		return  list.stream()
					.mapToInt(i -> i.intValue())
					.sum();		
	}
	
	public static double calculateArrayAverage(Integer[] integerArray)
	{
		return calculateArraySum(integerArray)/integerArray.length;
	}
}