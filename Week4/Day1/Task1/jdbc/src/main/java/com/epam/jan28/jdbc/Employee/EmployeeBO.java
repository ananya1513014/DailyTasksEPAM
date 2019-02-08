/**
 * Model class for employee
 */
package com.epam.jan28.jdbc.Employee;

/**
 * @author Ananya_Goel
 *
 */
public class EmployeeBO {
	String name;
	int age;
	String phoneNumber;
	public EmployeeBO(String name, int age, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "EmployeeBO [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBO other = (EmployeeBO) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
	
}
