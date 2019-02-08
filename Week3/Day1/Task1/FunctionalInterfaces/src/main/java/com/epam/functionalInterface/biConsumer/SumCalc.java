/**
 * This class illustrates the use of biCOnsumer interface in java
 */
package com.epam.functionalinterface.biConsumer;
/**
 * @author Ananya Goel
 */
import java.util.function.BiConsumer;

import com.epam.functionalInterface.io.Input;

public class SumCalc {

	public static void calculateSum()
	{
		int num1, num2;
		
		BiConsumer<Integer, Integer> sum = (a, b)-> System.out.println(a+b);
		
		num1=Input.getNum();	num2=Input.getNum();
		
		sum.accept(num1, num2);
	}
}
