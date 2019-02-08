/**
 * This class illustrates the use of Supplier interface in java
 */
package com.epam.functionalinterface.supplier;
/**
 * @author Ananya Goel
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

import com.epam.functionalInterface.io.Output;

public class CurrentDate {
	
	private CurrentDate()
	{
		throw new IllegalStateException("Utility class");
	}
	
	public static void currentDate()
	{
		Output.printString(currentDateSupplier());
	}
	
	public static String currentDateSupplier()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		Supplier<String> getCurrentDate = () -> {return dtf.format(LocalDateTime.now());};
		
		return getCurrentDate.get();
	}
}