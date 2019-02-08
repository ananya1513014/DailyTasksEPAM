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

import com.epam.streamOddEven.utilities.OddUtil;

class OddUtilTest {

	static List<Integer> integerList;
	
	@BeforeAll
	static void initIntegerList()
	{
		integerList =  Arrays.asList(new Integer[]{12, 32, 13, 45, 67});
	}
	
	@Test
	void testOddCount()
	{
		assertEquals(OddUtil.getOddCount(integerList), 3);
	}
	
	@Test
	void testOddSum()
	{
		assertEquals(OddUtil.getOddSum(integerList), 125);
	}
	
	@Test
	void testGetOddList()
	{
		assertEquals(OddUtil.getOddList(integerList), Arrays.asList(new Integer[]{13, 45, 67}));
	}
}
