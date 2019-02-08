/**
 * This class contains a function validateUser for validating user details
 */
package com.epam.user;

/**
 * @author Ananya Goel
 *
 */
public class UserValidator {
	
	/*
	 * @argument UserBO object
	 * @return boolean
	 * 
	 * This function accepts an object of UserBO class and checks
	 * whether the length of firstName & lastName properties are 
	 * acceptable, returns	 boolean 	indicating 	the 	same
	 */
	public boolean validateUser(UserBO user)
	{
		return (user.firstName.length()>=4&&user.firstName.length()<=10&&user.lastName.length()>=4&&user.lastName.length()<=15);
	}
	
}