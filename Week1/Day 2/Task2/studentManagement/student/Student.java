/*
 * This is a model class of type Student
 */
package com.epam.studentManagement.student;

import com.epam.studentManagement.io.Input;
import com.epam.studentManagement.io.Output;

/**
 * @author Ananya Goel
 *
 */

public class Student {
	String name;
	int age;
	public Student() {
		Output.printGetStudentDetailsMessage();
		this.name = Input.inputStudentName();
		this.age = Input.inputStudentAge();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}	
}
