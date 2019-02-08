package com.epam.logger;
/**
 * This program implements some appenders & layouts in log4j
 */
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
/**
 * 
 * @author Ananya_Goel
 *
 */
public class Main {

	private static Logger loggerObj = Logger.getLogger(Main.class);
	
	public static void main(String[] args)
	{
		loggerObj.setLevel(Level.INFO);
		
		 loggerObj.debug("Debug Message!");
	      loggerObj.info("Info Message!");
	      loggerObj.warn("Warn Message!");
	      loggerObj.error("Error Message!");
	      loggerObj.fatal("Fatal Message!");
	}
	
}
