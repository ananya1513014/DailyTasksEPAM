package com.epam.studentManagement;

import com.epam.studentManagement.io.Output;
import com.epam.studentManagement.student.StudentManagement;

/**
 * @author Ananya Goel
 *
 */

public class Main {
	
	/*
	 * creates a object of immutable class StudentManagement
	 * the commented line (line number: 23)would result in error since student management is a immutable class
	 */
	public static void main(String[] args)
	{
		StudentManagement studentManagementObj = new StudentManagement();	//immutable StudentManagement object
		
		Output.printStudentList(studentManagementObj.getStudentList());
		
//		studentManagementObj.studentList = studentList;
	}
}