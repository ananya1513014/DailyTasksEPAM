/**
 * This class contains jUnit tests for EmployeeBO class
 */
package com.epam.jdbcTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.jan28.jdbc.Employee.EmployeeBO;

/**
 * @author Ananya_Goel
 *
 */
class EmployeeBOTest {

	/**
	 * Test method for {@link com.epam.jan28.jdbc.Employee.EmployeeBO#EmployeeBO(java.lang.String, int, java.lang.String)}.
	 */
	@Test
	void testEmployeeBO() {
		assertNotNull(new EmployeeBO("Ananya", 22, "7895710210"));
	}

	/**
	 * Test method for {@link com.epam.jan28.jdbc.Employee.EmployeeBO#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("EmployeeBO [name=Ananya, age=21, phoneNumber=7895710210]", new EmployeeBO("Ananya", 21, "7895710210").toString());
	}

	/**
	 * Test method for {@link com.epam.jan28.jdbc.Employee.EmployeeBO#equals(java.lang.Object)}.
	 */
	@Test
	void testEqualsObject() {
		EmployeeBO empObj1 = new EmployeeBO("Ananya", 21, "7895710210");
		EmployeeBO empObj2 = new EmployeeBO("Ananya", 22, "7895710210");
		assertFalse(empObj1.equals(empObj2));
		assertTrue(new EmployeeBO("Ananya", 21, "7895710210").equals(empObj1));
	}

}
