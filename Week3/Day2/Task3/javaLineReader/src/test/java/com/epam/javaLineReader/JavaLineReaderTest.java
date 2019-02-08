/**
 * 
 */
package com.epam.javaLineReader;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * @author Ananya Goel
 *
 */
class JavaLineReaderTest {

	/**
	 * Test method for {@link com.epam.javaLineReader.Utilities#getJavaLines(java.util.List)}.
	 */
	@Test
	void testGetJavaLines() {
		List<String> fileLines = Arrays.asList(new String[] {"This is java", "This is not", "Neither is this", "java java", "no java"});
		assertEquals(Utilities.getJavaLines(fileLines), Arrays.asList(new String[] {"This is java", "java java", "no java"}));
	}
	
	@Test
	void testGetBufferedReaderObj()
	{
		assertThrows(FileNotFoundException.class, ()->Utilities.getBufferedReaderObj("Any wrong address"));
	}

	@Test
	void testGetFileLines() throws IOException
	{
		assertNotNull(Utilities.getFileLines(System.getProperty("user.dir") + "/textFile.txt"));
	}
	
	@Test
	void testFileNotFound()
	{
		assertThrows(FileNotFoundException.class, ()->Utilities.getFileLines("Any wrong address"));
	}
}