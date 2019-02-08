package com.epam.jan14.directoryStructure;
/**
 * @author Ananya Goel
 *
 */

import java.io.File;

public class DirectoryStructure {

	public static void printStructure(String directoryPath, int level)      //level is used to denote the level of a file in a directory to aid in creating the structure
	{
		File rootDirectory = new File(directoryPath);
		File[] listOfFiles = rootDirectory.listFiles();
		
		for(int j=0; j<level; j++)	System.out.print("|    ");
		System.out.println("+- " + rootDirectory.getName()+"/");
		
		level++;
		
		for(int i=0; i<listOfFiles.length; i++)
		{
			if(listOfFiles[i].isFile())
			{

				for(int j=0; j<level; j++)	System.out.print("|    ");
				System.out.println("+- " + listOfFiles[i].getName());
			}
			else
			{
				String subDirectoryPath = directoryPath+"/"+listOfFiles[i].getName();
				printStructure(subDirectoryPath, level);
			}
		}
	}
}
