/**
 * Model class for user
 */
package com.epam.user;
/**
 * @author Ananya Goel
 *
 */

import java.util.Scanner;

public class UserBO {
	String firstName;
	String lastName;
	boolean active;
	
	Scanner scannerObj = new Scanner(System.in);
	
	public UserBO(String firstName, String lastName) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.active=false;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean status) {
		this.active = status;
	}
}
