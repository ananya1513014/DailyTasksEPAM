/**
 * This class contains functions to accept input from user
 */
package com.epam.distinctStrings.io;
/**
 * @author Ananya Goel
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

	static Scanner scannerObj = new Scanner(System.in);
	
	public static List<String> inputStringList()
	{
		List<String> stringList = new ArrayList<>();
		
		int listSize = scannerObj.nextInt();
		
		while(listSize>0)
		{
			stringList.add(scannerObj.next());
			listSize--;
		}
		
		return stringList;
	}
	
}
