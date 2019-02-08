/*
 * This class is immutable, it has a list of Student objects as its data members
 */
package com.epam.studentManagement.student;

/**
 * @author Ananya Goel
 *
 */

import java.util.List;

final public class StudentManagement {
	
	final List<Student> studentList;

	/*
	 * Calls StudentServices.createStudentList()
	 * Initializes the studentList variable in immutable StudentManagement object
	 */
	public StudentManagement() {
		this.studentList = StudentService.createStudentList();
	}

	/*
	 * Returns the list of student objects
	 */
	public List<Student> getStudentList() {
		return studentList;
	}	
}