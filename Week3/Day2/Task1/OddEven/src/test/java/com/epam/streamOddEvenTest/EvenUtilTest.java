/**
 * This class contains methods to test the methods of OddUtil class
 */
package com.epam.streamOddEvenTest;
/**
 * @author Ananya Goel
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.epam.streamOddEven.utilities.EvenUtil;

class EvenUtilTest {

	static List<Integer> integerList;
	
	@BeforeAll
	static void initIntegerList()
	{
		integerList =  Arrays.asList(new Integer[]{12, 32, 13, 45, 67});
	}
	
	@Test
	void testEvenCount()
	{
		assertEquals(EvenUtil.getEvenCount(integerList), 2);
	}
	
	@Test
	void testEvenSum()
	{
		assertEquals(EvenUtil.getEvenSum(integerList), 44);
	}
	
	@Test
	void testGetEvenList()
	{
		assertEquals(EvenUtil.getEvenList(integerList), Arrays.asList(new Integer[]{12, 32}));
	}
}
