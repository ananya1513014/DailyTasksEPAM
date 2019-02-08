/*
 * Convertor.class, Compare.class, Main.class depends on this class
 * Provides methods to get input through scanner object 
 */
package com.epam.jan09.lengthConversion.IO;
/**
 * @author Ananya Goel
 *
 */
import java.util.Scanner;

public class Input {
	Scanner scannerObj = new Scanner(System.in);
	
	public String initialValue;
	public String targetUnit;
	public int choice;
	public String inputValue1;
	public String inputValue2;

	public String getInitialValue() {
		return initialValue;
	}

	public void setInitialValue() {
		this.initialValue = scannerObj.nextLine();
	}

	public String getTargetValue() {
		return targetUnit;
	}

	public void setTargetUnit() {
		this.targetUnit = scannerObj.nextLine();
	}

	public int getChoice(){
		return choice;
	}

	public void setChoice() {
		this.choice = scannerObj.nextInt();
	}

	public String getInputValue1() {
		return inputValue1;
	}

	public String getInputValue2() {
		return inputValue2;
	}

	public void setInputValue1() {
		this.inputValue1 = scannerObj.nextLine();
	}

	public void setInputValue2() {
		this.inputValue2 = scannerObj.nextLine();
	}
	

}
