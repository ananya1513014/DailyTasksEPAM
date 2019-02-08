/**
 * This class deals with data access operations
 */
package com.epam.jan28.jdbc.employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class EmployeeDAO {
	
	private EmployeeDAO()
	{
		//left blank intentionally
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException
	{
		//Gets database properties from dbProperties.properties file
		Properties property = getPropertyFile();

		Class.forName(property.getProperty("dbdriver"));
		return DriverManager.getConnection(property.getProperty("dburl"), property.getProperty("uname"), property.getProperty("pass"));		
	}
	
	public static ResultSet getResultSet(String selectQuery) throws ClassNotFoundException, SQLException, IOException
	{
		return getConnection().createStatement().executeQuery(selectQuery);
	}

	public static Properties getPropertyFile() throws IOException
	{
		Properties property = new Properties();
        String propertyFilePath = System.getProperty("user.dir") + "/dbProp.properties";
        property.load(new FileInputStream(propertyFilePath));

        return property;
	}
}