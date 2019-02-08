/**
 * This class contains jUnit tests for testing the com.epam.user
 */
package com.epam.userTest;

/**
 * @author Ananya Goel
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.user.UserBO;
import com.epam.user.UserServices;
import com.epam.user.UserValidator;

class UserTest {

	/*
	 * This jUnit test case tests the functions of UserValidator class by passing UserBO objects
	 */
	@Test
	public void userValidatorTest()
	{
		UserValidator userValidatorObj = new UserValidator();
		
		assertTrue(userValidatorObj.validateUser(new UserBO("Ananya", "Goel")));
		assertFalse(userValidatorObj.validateUser(new UserBO("A", "G")));
	}
	
	/*
	 * This jUnit test case tests the functions of UserServices class by passing UserBO objects
	 */
	@Test
	public void userServicesTest()
	{
		UserServices userServicesObj = new UserServices();

		assertTrue(userServicesObj.activateUser(new UserBO("Ananya", "Goel")).isActive());
		assertFalse(userServicesObj.deactivateUser(new UserBO("Ananya", "Goel")).isActive());
	}

}