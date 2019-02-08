/**
 * This class illustrates the use of Consumer interface in java
 */
package com.epam.functionalinterface.consumer;
/**
 * @author Ananya Goel
 */
import java.util.function.Consumer;

import com.epam.functionalInterface.io.Input;

public class SquareCalc {

	public static void square()
	{
        Consumer<Integer> square = a -> System.out.println(a*a); 
  
        int num = Input.getNum();
        	
        square.accept(num); 
	}
}
