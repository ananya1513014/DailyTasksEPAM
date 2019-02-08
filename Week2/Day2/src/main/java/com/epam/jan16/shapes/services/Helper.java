package com.epam.jan16.shapes.services;

import com.epam.jan16.shapes.AbstractShape;
import com.epam.jan16.shapes.io.Output;

public class Helper {
    
    /**
     * Standardizes the shape name to match the class name
     * @param shapeName
     * @return class name
     */
	public static String stringToActualClassName(String shapeName)
	 {
		return "com.epam.jan16.shapes.drawableShapes." + Character.toString(shapeName.charAt(0)).toUpperCase()+shapeName.substring(1).toLowerCase();
	 }
	
	/**
	 * @param shapeName
	 * calls getShapeObject
	 * passes the shape object to ShapeServices.drawShape
	 */
	public static void callDrawShape(String shapeName) 
  	 {
		try {
  		ShapeServices.drawShape(getShapeObject(shapeName)); 
		}
		catch(NullPointerException nullPointerException)
		{
			Output.printNullPointerMessage();
		}
  	 }

	
	/**
	 * @param shapeName
	 * @return object of Shape class
	 */
	public static AbstractShape getShapeObject(String shapeName)
	 {
		shapeName = stringToActualClassName(shapeName);
		
		AbstractShape shapeObj=null;
		
		try {
			shapeObj = (AbstractShape)Class.forName(shapeName).newInstance();
		} 
		catch (InstantiationException e) 
		{
			e.printStackTrace();
		} 
		catch (IllegalAccessException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			Output.printShapeNotSupportedMessage();
		}
		
		return shapeObj;
	 }	 
}
