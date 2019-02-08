/*
 * This class contains function that returns a enum of type UnitsEnum
 */
package com.epam.jan09.lengthConversion.unitEnum;

/**
 * @author Ananya Goel
 */

public class MapInputUnitToEnum {

	/*
	 * argument: String
	 * return: UnitsEnum object corresponding to the String argument
	 */
	public static UnitsEnum mapInputUnitToEnum(String inputUnit)
	{
		return UnitsEnum.valueOf(inputUnit.toUpperCase());
	}
}
