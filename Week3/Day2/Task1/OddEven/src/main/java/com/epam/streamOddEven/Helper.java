/**
 * This class contains function to execute the particular function according to user input
 */
package com.epam.streamOddEven;
/**
 * @author Ananya Goel
 *
 */
import java.util.List;

import com.epam.streamOddEven.io.Input;
import com.epam.streamOddEven.io.Output;
import com.epam.streamOddEven.utilities.EvenUtil;
import com.epam.streamOddEven.utilities.OddUtil;

public class Helper {
	
	/**
	 * @param numList
	 * 
	 * gets user choice and performs the particular function on the list accepted as argument
	 */
	public static void choiceMenu(List<Integer> numList)
	{
		boolean wishToPerformMoreFunction=true;
		Output.printGetUserChoiceMessage();
		switch(Input.getChoice())
		{
		case 1: 
			Output.printResult(EvenUtil.getEvenCount(numList));
			break;
		case 2:
			Output.printResult(EvenUtil.getEvenList(numList));
			break;
		case 3:
			Output.printResult(EvenUtil.getEvenSum(numList));
			break;
		case 4: 
			Output.printResult(OddUtil.getOddCount(numList));
			break;
		case 5:
			Output.printResult(OddUtil.getOddList(numList));
			break;
		case 6:
			Output.printResult(OddUtil.getOddSum(numList));
			break;
		case 7:
			wishToPerformMoreFunction=false;
			break;
		default:
			Output.printError();
			break;
		}
		if(wishToPerformMoreFunction)	choiceMenu(numList);
	}
}
