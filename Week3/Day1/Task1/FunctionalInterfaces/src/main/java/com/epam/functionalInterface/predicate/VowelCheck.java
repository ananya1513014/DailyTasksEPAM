/**
 * This class illustrates the use of predicate interface in java
 */
package com.epam.functionalinterface.predicate;
/**
 * @author Ananya Goel
 */
import java.util.function.Predicate;

import com.epam.functionalInterface.io.Input;
import com.epam.functionalInterface.io.Output;

public class VowelCheck {

	public static boolean predicateVowelCheck(char inputChar)
	{
        Predicate<Character> vowelCheck = (character)->isVowel(character);
        return vowelCheck.test(inputChar);
	}
	
	public static void vowelCheck()
	{
        if(predicateVowelCheck(Input.getCharacter()))	
        	Output.isVowel();
        else 
        	Output.isNotVowel();
	}
	
	public static boolean isVowel(char character)
	{
		boolean result;
		
		if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u')
			result = true;
		else 
			result = false;
		
		return result;
	}
}