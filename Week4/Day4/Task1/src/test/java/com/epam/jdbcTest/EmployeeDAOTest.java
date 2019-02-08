/**
 * Contains jUnit tests for EmployeeDAO
 */
package com.epam.jdbcTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.epam.jan28.jdbc.employee.EmployeeDAO;

/**
 * @author Ananya_Goel
 *
 */
class EmployeeDAOTest {

	/**
	 * Test method for {@link com.epam.jan28.jdbc.employee.EmployeeDAO#getConnection()}.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	void testGetConnection() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		assertNotNull(EmployeeDAO.getConnection());
	}

	/**
	 * Test method for {@link com.epam.jan28.jdbc.employee.EmployeeDAO#getResultSet(java.lang.String)}.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	void testGetResultSet() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		assertNotNull(EmployeeDAO.getResultSet("SELECT * FROM employeeData"));
	}
	
	@Test
	void testGetPropertyFile() throws FileNotFoundException, IOException {
		assertNotNull(EmployeeDAO.getPropertyFile());
	}
}