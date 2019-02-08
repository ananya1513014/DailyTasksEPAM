/*
 * This class contains function that invokes the particular function
 * from Math class according to user input and returns result to user
 */
package com.epam.jan08.calculator.math;
/**
 * @author Ananya Goel
 *
 */
import com.epam.jan08.calculator.io.Input;
import com.epam.jan08.calculator.io.Output;

public class Helper {
	
	private Helper()
	{
		
	}
	public static double calculateResult(Input inputObj)
    {
	    Math mathObj = new Math();
	    double result=0;
    
	    switch(inputObj.getChoice())
            {
                case 1:
                result=mathObj.add(inputObj.getOperands()[0], inputObj.getOperands()[1]);
                break;
                
    	        case 2: 
                result=mathObj.substract(inputObj.getOperands()[0], inputObj.getOperands()[1]);
                break;
                
      	        case 3:
                result=mathObj.multiply(inputObj.getOperands()[0], inputObj.getOperands()[1]);
                break;
                
    	        case 4:
                result=mathObj.divide(inputObj.getOperands()[0], inputObj.getOperands()[1]);
 	            break;
 	            
    	        default:
                Output.printError();
                break;
    	    }
    	return result;
    }

}