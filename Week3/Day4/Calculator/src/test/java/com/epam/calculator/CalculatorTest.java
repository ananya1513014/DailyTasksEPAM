/*
 * This class contains jUnit test functions for testing com.epam.calculator package
 */
package com.epam.calculator;

/**
 * @author Ananya Goel
 *
 */

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.calculator.calculatorException.OutOfRangeException;

class CalculatorTest {

	final int INT_MAX_VALUE=Integer.MAX_VALUE;
	final int INT_MIN_VALUE=(Integer.MIN_VALUE);
	Calculate calculator;
	
	@BeforeEach
	public void testInit()
	{
		calculator=new Calculate();
	}
	
	@DisplayName("Checks if the output result of the function is same as expected")
	@Test
	public void testAdditionOfTwoNumber() throws OutOfRangeException
	{
		assertEquals(5, calculator.add(2, 3));
		assertEquals(5, calculator.add(10, -5));
		assertEquals(INT_MAX_VALUE, calculator.add(1, INT_MAX_VALUE-1));
		assertEquals(-1, calculator.add(INT_MIN_VALUE, INT_MAX_VALUE));
		assertEquals(INT_MIN_VALUE, calculator.add(-1, INT_MIN_VALUE+1));
	}
	
	@DisplayName("Checks if the program throws appropriate exception for out of range")
	@Test
	public void testRange()
	{
		assertThrows(OutOfRangeException.class, () -> {calculator.add(INT_MAX_VALUE, 1);} );
		assertThrows(OutOfRangeException.class, () -> {calculator.add(1, INT_MAX_VALUE);} );
		assertThrows(OutOfRangeException.class, () -> {calculator.add(INT_MAX_VALUE, INT_MAX_VALUE);} );
		
		assertThrows(OutOfRangeException.class, () -> {calculator.add(INT_MIN_VALUE, -1);} );
		assertThrows(OutOfRangeException.class, () -> {calculator.add(-1, INT_MIN_VALUE);} );
		assertThrows(OutOfRangeException.class, () -> {calculator.add(INT_MIN_VALUE, INT_MIN_VALUE);} );
	}
}
