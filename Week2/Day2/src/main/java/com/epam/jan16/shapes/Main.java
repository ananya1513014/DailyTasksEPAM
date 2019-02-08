/**
 * A ShapeMaker project using Factory Design Patterns and Solid Principles
 */
package com.epam.jan16.shapes;
import com.epam.jan16.shapes.io.Input;
import com.epam.jan16.shapes.io.Output;
import com.epam.jan16.shapes.services.Helper;

public class Main {
	public static void main(String[] args)
	{
		Output.printGetShapeNameMessage();
		Helper.callDrawShape(Input.getShapeName());
	}
}