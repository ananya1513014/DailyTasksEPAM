/**
 * This program creates a custom annotation and reads the annotation and prints its data
 */
package com.epam.customAnnotation;

import com.epam.customAnnotation.io.Output;

/**
 * @author Ananya_Goel
 */
public class Main {
	public static void main(String[] args)
	{	
		// "bookFunction" denotes the name of a function in Book.class
		BookAnnotation bookAnnotation = Helper.getAnnotation("bookFunction");
		
		Output.printBookDetails(bookAnnotation.authorName(), bookAnnotation.title(), bookAnnotation.publisher());
	}
}