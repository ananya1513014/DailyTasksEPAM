/**
 * This class deals with data access operations
 */
package com.epam.jan28.jdbc.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class EmployeeDAO {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		//Gets database properties from dbProperties.properties file
		ResourceBundle resourceBundle = ResourceBundle.getBundle("dbProperties");
		
		Class.forName(resourceBundle.getString("dbdriver"));
		return DriverManager.getConnection(resourceBundle.getString("dburl"), resourceBundle.getString("uname"), resourceBundle.getString("pass"));		
	}
	
	public static ResultSet getResultSet(String selectQuery) throws ClassNotFoundException, SQLException
	{
		return getConnection().createStatement().executeQuery(selectQuery);
	}

}
