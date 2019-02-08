package com.epam.jan28.jdbc;
/**
 * @author Ananya Goel
 *
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.epam.jan28.jdbc.employee.EmployeeBO;

public class ResultSetOperations {
	
	private ResultSetOperations()
	{
		//left blank intentionally
	}

	/**
	 * @param resultSetObj
	 * @return list of employee objects created using the data from resultSet
	 * @throws SQLException
	 */
	public static List<EmployeeBO> iterateForwardGetEmployeeList(ResultSet resultSetObj) throws SQLException
	{
		List<EmployeeBO> employeeList = new ArrayList<>();
		
		while(resultSetObj.next())
				employeeList.add(new EmployeeBO(resultSetObj.getString(1), resultSetObj.getInt(2), resultSetObj.getString(3)));
		
		return employeeList;
	}

	/**
	 * @param resultSetObj
	 * @return list of employee objects created using the data from resultSet
	 * @throws SQLException
	 */
	public static List<EmployeeBO> iterateBackwardGetEmployeeList(ResultSet resultSetObj) throws SQLException
	{
		List<EmployeeBO> employeeList = new ArrayList<>();
		
		while(resultSetObj.previous())
			employeeList.add(new EmployeeBO(resultSetObj.getString(1), resultSetObj.getInt(2), resultSetObj.getString(3)));
		
		return employeeList;
	}
}