/**
 * This class contains helper methods to get annotation object
 */
package com.epam.customAnnotation;
/**
 * @author Ananya_Goel
 */
import java.lang.reflect.Method;

public class Helper {
	

	/**
	 * @param methodName
	 * @return corresponding BookAnnotation object of the methodName
	 * 
	 * calls getMethodObj to get the Method object and calls getAnnotation to get the annotation
	 */
	public static BookAnnotation getAnnotation(String methodName)
	{
		Method methodObj = getMethodObj(methodName);
		return methodObj.getAnnotation(BookAnnotation.class);
	}
	
	/**
	 * @param methodName
	 * @return corresponding Method object of the methodName
	 */
	public static Method getMethodObj(String methodName)
	{
		Method bookMethod = null;
		
		try 
		{
			bookMethod = new Book().getClass().getMethod(methodName);
		} 
		catch (NoSuchMethodException e) 
		{
			System.out.println("Method does not exist");
		} 
		catch (SecurityException e) 
		{
			e.printStackTrace();
		}
		
		return bookMethod;
	}
}