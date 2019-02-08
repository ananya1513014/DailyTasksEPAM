/*
 * This class contains mathematical functions.
 */
package com.epam.jan08.calculator.math;
/**
 * @author Ananya Goel
 *
 */
public class Math {
	/*
	 * adds 2 numbers
	 * arguments: double, double
	 * return: sum of 2 arguments
	 */
    public double add(double num1, double num2)
    {
        return num1+num2;
    }
    
    /*
     * substracts 2 numbers
     * args: double, double
     * return: difference between arguments
     */
    public double substract(double num1, double num2)
    {
        return num1-num2;
    }
    
    /*
     * multiplies 2 numbers
     * args: double, double
     * return: product of arguments
     */
    public double multiply(double num1, double num2)
    {
        return num1*num2;
    }
    
    /*
     * divides 2 numbers
     * args: double, double
     * return: division of arguments
     */
    public double divide(double num1, double num2)
    {
        return num1/num2;
    }
}