/**
 * This class contains jUnit tests for EmployeeDAO class
 */
package com.epam.jdbcTest;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.epam.jan28.jdbc.Employee.EmployeeDAO;

/**
 * @author Ananya_Goel
 *
 */
class EmployeeDAOTest {

	/**
	 * Test method for {@link com.epam.jan28.jdbc.Employee.EmployeeDAO#getConnection()}.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	@Test
	void testGetConnection() throws ClassNotFoundException, SQLException {
		assertNotNull(EmployeeDAO.getConnection());
	}

	/**
	 * Test method for {@link com.epam.jan28.jdbc.Employee.EmployeeDAO#getResultSet(java.lang.String)}.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	@Test
	void testGetResultSet() throws ClassNotFoundException, SQLException {
		assertNotNull(EmployeeDAO.getResultSet("SELECT * FROM employeeData"));
	}
}