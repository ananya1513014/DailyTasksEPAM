package com.epam.distinctStringTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.epam.distinctStrings.Main;

class DistinctStringTest {

	@Test
	void testGetDistinctStrings() {
		List<String> stringList = Arrays.asList(new String[] {"Hi", "Hello", "Hello", "Hii", "Hi"});
		
		assertEquals(new ArrayList<>(Main.getDistinctStrings(stringList)), Arrays.asList(new String[] {"Hi", "Hello", "Hii"}));
	}

}
