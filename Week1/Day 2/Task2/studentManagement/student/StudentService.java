/**
 * 
 */
package com.epam.studentManagement.student;

import java.util.ArrayList;
import java.util.List;

import com.epam.studentManagement.io.Input;
import com.epam.studentManagement.io.Output;

/**
 * @author Ananya_Goel
 *
 */
public class StudentService {
	
	/*
	 * creates & returns a list of student objects
	 */
	public static List<Student> createStudentList()
	{		
		List<Student> studentList = new ArrayList<>();
	
		do
		{			
			studentList.add(new Student());	
			Output.printMoreStudentsNeeded();
		}
		while(Input.moreStudentsRequired());

		return studentList;
	}	
}
