/**
 * Contains jUnit tests for ResultSetOperation
 */
package com.epam.jdbcTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.epam.jan28.jdbc.ResultSetOperations;
import com.epam.jan28.jdbc.employee.EmployeeBO;
import com.epam.jan28.jdbc.employee.EmployeeDAO;

/**
 * @author Ananya_Goel
 *
 */
class ResultSetOperationsTest {

	static ResultSet resultSetObj, expectedResultSet;
	static List<EmployeeBO> expectedEmployeeList = new ArrayList<>();
	
	@BeforeAll
	static void initResultSet() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		resultSetObj = EmployeeDAO.getResultSet("SELECT * from employeeData");
		expectedEmployeeList.add(new EmployeeBO("Ananya", 21, "7895710210"));
		expectedEmployeeList.add(new EmployeeBO("Aman", 22, "9995710210"));
		expectedEmployeeList.add(new EmployeeBO("Utkarsh", 21, "7775710210"));
		expectedEmployeeList.add(new EmployeeBO("Khushi", 22, "8885710210"));
	}
	
	/**
	 * Test method for {@link com.epam.jan28.jdbc.ResultSetOperations#iterateForwardGetEmployeeList(java.sql.ResultSet)}.
	 * @throws SQLException 
	 */
	@Test
	void testIterateForwardGetEmployeeList() throws SQLException {
		List<EmployeeBO> actualList = (ResultSetOperations.iterateForwardGetEmployeeList(resultSetObj));
		assertEquals(actualList.get(0), expectedEmployeeList.get(0));
		assertEquals(actualList.get(1), expectedEmployeeList.get(1));
		assertEquals(actualList.get(2), expectedEmployeeList.get(2));
		assertEquals(actualList.get(3), expectedEmployeeList.get(3));
	}

	/**
	 * Test method for {@link com.epam.jan28.jdbc.ResultSetOperations#iterateBackwardGetEmployeeList(java.sql.ResultSet)}.
	 * @throws SQLException 
	 */
	 @Test void testIterateBackwardGetEmployeeList() throws SQLException {
			List<EmployeeBO> actualList = (ResultSetOperations.iterateBackwardGetEmployeeList(resultSetObj));
			assertEquals(actualList.get(0), expectedEmployeeList.get(3));
			assertEquals(actualList.get(1), expectedEmployeeList.get(2));
			assertEquals(actualList.get(2), expectedEmployeeList.get(1));
			assertEquals(actualList.get(3), expectedEmployeeList.get(0));
	  }	 
}