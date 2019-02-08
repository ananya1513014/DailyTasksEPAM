/**
 * contains functions to be performed on odd numbers from the list
 */
package com.epam.streamOddEven.utilities;
/**
 * @author Ananya Goel
 *
 */

import static java.util.stream.Collectors.toList;

import java.util.List;

public class EvenUtil {
	public static int getEvenCount(List<Integer> numList)
	{
		return numList.parallelStream(). 
				  filter(num ->num%2==0).
				  collect(toList()).size();
	}
	public static int getEvenSum(List<Integer> numList)
	{
		return numList.stream().
				filter(num -> num%2==0).
				reduce(0, (carry, e)->carry+e);
	}
	public static List<Integer> getEvenList(List<Integer> numList)
	{
		  return numList.parallelStream(). 
				  filter(num ->num%2==0).
				  collect(toList());		
	}
}
