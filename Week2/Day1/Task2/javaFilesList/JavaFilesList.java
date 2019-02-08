/*
 * contains a recursive function to print java files in a directory & its sub-directory
 */
package com.epam.jan14.javaFilesList;
/**
 * @author Ananya Goel
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.epam.jan14.javaFilesList.IO.Output;

public class JavaFilesList {
	
	public static void listJavaFiles(String directory)
	{
		File rootDirectory = new File(directory);
		File[] fileList = rootDirectory.listFiles();
		List<String> javaFiles = new ArrayList<>();
				
		for(File file: fileList)
		{
			String fileName = file.getName();
			
			if(file.isFile()&&fileName.endsWith(".java"))
			{
				javaFiles.add(fileName);
			}
			else if(file.isDirectory())
			{
				listJavaFiles(directory + "/" + fileName);
			}
		}		
		Output.printJavaFiles(javaFiles);
	}
	
}