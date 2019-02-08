/**
 * this program takes a list of integers and find odd and even numbers
 * from that list and also the count, sum of odd/even using streams API.
 */
package com.epam.streamOddEven;
import com.epam.streamOddEven.io.*;

public class Main {
	
	/**
	 * gets user input and passes the input to Helper class method
	 * choiceMenu provides user with possible operations that can be performed on the list
	 */
	public static void main(String[] args)
	{
		Output.printGetListInputMessage();
		Helper.choiceMenu(Input.inputList());
	}
}