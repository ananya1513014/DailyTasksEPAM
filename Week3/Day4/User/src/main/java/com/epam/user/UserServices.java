/**
 * This class contains functions to modify the
 * activate	 property	 of	 a 	UserBO object
 */
package com.epam.user;

/**
 * @author Ananya Goel
 *
 */

public class UserServices {


	/*
	 * @args: UserBO object
	 * @return:	UserBO object
	 * 
	 * sets the activate property of UserBO object to true & return the object
	 */
	public UserBO activateUser(UserBO userObj)
	{
		userObj.setActive(true);
		return userObj;
	}

	/*
	 * @args: UserBO object
	 * @return:	UserBO object
	 * 
	 * sets the activate property of UserBO object to false & return the object
	 */
	public UserBO deactivateUser(UserBO userObj)
	{
		userObj.setActive(false);
		return userObj;
	}
}
