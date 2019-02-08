package com.epam.javaLineReader;
import static java.util.stream.Collectors.toList;

/**
 * @author Ananya Goel
 *
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.epam.javaLineReader.io.Input;
import com.epam.javaLineReader.io.Output;

public class Utilities {
	
	/**
	 * This functions accepts a String containing file address as argument
	 * The file is read using the BufferedReader object
	 * Each line of the file is stored in a List and the list is returned
	 * 
	 * @param fileAddress
	 * @return List of all lines in the file
	 * @throws IOException 
	 */
	public static List<String> getFileLines(String fileAddress) throws IOException
	{
		List<String> fileLines = new ArrayList<>();
		
				BufferedReader reader = getBufferedReaderObj(fileAddress);
				String line = reader.readLine();
				while(line!=null)
					{
						fileLines.add(line);
						line = reader.readLine();
					}
		return fileLines;
	}

	public static BufferedReader getBufferedReaderObj(String fileAddress) throws FileNotFoundException
	{
		return new BufferedReader(new FileReader(fileAddress));
	}
	
	/**
	 * @param fileLines
	 * @return List of lines containing "java" keyword
	 */	
	public static List<String> getJavaLines(List<String> fileLines)
	{
		Predicate<String> predicate = (string) -> string.contains("java");
		
		return (fileLines.stream()
				.filter(predicate)
				.collect(toList()));
	}
}