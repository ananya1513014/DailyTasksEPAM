/**
 * This program creates a default statement execute some select 
 * query for 	some database, get resultSet, iterate
 *  through resultSet - and do next	 and previous operations.
 */
package com.epam.jan28.jdbc;
import java.io.IOException;
/**
 * @author Ananya Goel
 *
 */
import org.apache.log4j.Logger;

import com.epam.jan28.jdbc.employee.EmployeeDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	private static Logger loggerObj = Logger.getLogger(Main.class);
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException
	{

	      
		ResultSet resultSetObj = EmployeeDAO.getResultSet("SELECT * from employeeData");
		
	    loggerObj.info(ResultSetOperations.iterateForwardGetEmployeeList(resultSetObj));
	    loggerObj.info(ResultSetOperations.iterateBackwardGetEmployeeList(resultSetObj));
	}	
}