/* Contains functions to join an array into a string 
 * using default separator or user provided separator
 */

package com.epam.joinArray.Utilities;
/**
 * @author Ananya_Goel
 *
 */

public class JoinArray {

	// joins the array with default(,) separator
	public static String join(int[] integerArray)	
	{
		char separatingChar = ',';		
		return join(integerArray, separatingChar);
	}
	
	//joins the array with user defined separator
	public static String join(int[] integerArray, char separatingChar)	
	{
		String joinResult="";
		final int arraySize = integerArray.length;
		
		for(int i=0; i<arraySize-1; i++)
		{
			joinResult = joinResult + integerArray[i] + Character.toString(separatingChar); 
		}
		
		joinResult = joinResult+integerArray[arraySize-1];
		
		return joinResult;
	}
}