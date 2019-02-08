/**
 * This class contains functions to accept use input
 */
package com.epam.streamOddEven.io;
/**
 * @author Ananya Goel
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	
		public static Scanner scannerObj = new Scanner(System.in);
		
		public static int getChoice()
		{	
			return scannerObj.nextInt();
		}
				
		public static List<Integer> inputList()
		{
			int listSize = scannerObj.nextInt();
			List<Integer> numList = new ArrayList<>();
			
			while(listSize>0)
			{
				numList.add(scannerObj.nextInt());
				listSize--;
			}
			return numList;
		}
	}
