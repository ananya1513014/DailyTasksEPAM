package com.epam.joinArray.Utilities;
/**
 * @author Ananya_Goel
 *
 */

import com.epam.joinArray.io.Input;
import com.epam.joinArray.io.Output;

public class Helper {
	public static String joinArrayHelper(int[] integerArray, int choice)
	{
		String joinResult;
		
		switch(choice)
		{
		case 1:
			joinResult = JoinArray.join(integerArray);
			break;
			
		case 2:
			Output.printSeparatingCharInputMessage();
			joinResult = JoinArray.join(integerArray, Input.getSeparatingChar());
			break;
			
		default:
			joinResult = Output.wrongChoiceMessage();
			break;
		}
		
		return joinResult;
	}
}
