/**
 * This program creates a default statement execute some select 
 * query for 	some database, get resultSet, iterate
 *  through resultSet - and do next	 and previous operations.
 */
package com.epam.jan28.jdbc;
/**
 * @author Ananya Goel
 *
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.jan28.jdbc.Employee.EmployeeDAO;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		ResultSet resultSetObj = EmployeeDAO.getResultSet("SELECT * from employeeData");
		 
		System.out.println(ResultSetOperations.iterateForwardGetEmployeeList(resultSetObj));
		System.out.println(ResultSetOperations.iterateBackwardGetEmployeeList(resultSetObj));
	}	
}