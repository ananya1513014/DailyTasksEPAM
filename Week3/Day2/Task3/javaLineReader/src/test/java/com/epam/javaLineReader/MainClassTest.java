/**
 * 
 */
package com.epam.javaLineReader;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 * @author Ananya Goel
 *
 */
class MainClassTest {

	/**
	 * Test method for {@link com.epam.javaLineReader.Main#main(java.lang.String[])}.
	 */
	@Test
	void testMainException() {
		assertThrows(IOException.class,()-> Main.main(new String[] {""}));
	}
}
