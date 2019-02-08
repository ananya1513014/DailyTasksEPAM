/**
 * This program illustrates the use of some function interfaces
 */
package com.epam.functionalinterface;
/**
 * @author Ananya Goel
 */
import com.epam.functionalinterface.biConsumer.SumCalc;
import com.epam.functionalinterface.consumer.SquareCalc;
import com.epam.functionalinterface.io.Input;
import com.epam.functionalinterface.io.Output;
import com.epam.functionalinterface.predicate.VowelCheck;
import com.epam.functionalinterface.supplier.CurrentDate;

public class Main {
	
	/**
	 * accepts user choice and calls the appropriate method accordingly
	 */
	public static void main(String[] args)
	{
		Output.printGetUserChoiceMessage();
		switch(Input.getChoice())
		{
		case 1:
			VowelCheck.vowelCheck();			
			break;
		case 2:
			CurrentDate.currentDate();			
			break;
		case 3:
			SquareCalc.square();			
			break;
		case 4:
			SumCalc.calculateSum();			
			break;
		default:
			Output.wrongInputError();
			break;
		}
	}
}
