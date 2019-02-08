/*
 * Class for accepting user input. The constructor of Input initializes the variables in the class using user input.
 */
package com.epam.jan08.calculator.io;
/**
 * @author Ananya Goel
 *
 */
import java.util.Scanner;

public class Input {
	
	Scanner scannerObj = new Scanner(System.in);
	
	private double[] operands;
	private int choice;
	
	public Input() {
		setChoice();
		setOperands();
	}

	public int getChoice(){
		return choice;
	}

	public double[] getOperands() {
		return operands;
	}

	public void setOperands() {
		this.operands = new double[2];
        this.operands[0]=scannerObj.nextInt();
        this.operands[1]=scannerObj.nextInt();                
	}

	public void setChoice() {
		this.choice = scannerObj.nextInt();
	}	
}