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

public class OddUtil {
	public static int getOddCount(List<Integer> numList)
	{
		return numList.parallelStream(). 
				  filter(num ->num%2==1).
				  collect(toList()).size();
	}
	public static int getOddSum(List<Integer> numList)
	{
		return numList.stream().
				filter(num -> num%2==1).
				reduce(0, (carry, e)->carry+e);
	}
	public static List<Integer> getOddList(List<Integer> numList)
	{
		  return numList.parallelStream(). 
				  filter(num ->num%2==1).
				  collect(toList());		
	}
}
