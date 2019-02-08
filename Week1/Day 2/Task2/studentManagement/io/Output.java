package com.epam.studentManagement.io;

import java.util.List;

import com.epam.studentManagement.student.Student;

public class Output {

	public static void printGetStudentDetailsMessage()
	{
		System.out.println("Enter student details-->\nName\t\tAge");
	}
	
	public static void printMoreStudentsNeeded()
	{
		System.out.println("Wish to add more students(true/false)?");
	}
	
	public static void printStudentList(List<Student> studentList)
	{
		for(Student student: studentList)
			System.out.println(student);
	}
}
