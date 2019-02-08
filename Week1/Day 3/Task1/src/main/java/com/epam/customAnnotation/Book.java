/**
 * This class uses the custom annotation BookAnnotation
 */
package com.epam.customAnnotation;
/**
 * @author Ananya_Goel
 */
public class Book {
	
	@BookAnnotation(authorName = "Ananya", title = "Java Basics", publisher = "AG")
	public void bookFunction()
	{
		//Left empty intentionally
	}
}