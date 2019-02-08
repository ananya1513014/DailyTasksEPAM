/*
 * This test class contains methods for testing com.epam.studentCategorization
 */
package com.epam.studentCategorization;

/**
 * @author Ananya Goel
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.epam.student_categorization.CategoryEnum;
import com.epam.student_categorization.student.StudentBO;
import com.epam.student_categorization.student.StudentService;

class StudentCategorizationTest {


	static StudentService studentService;
	static StudentBO student;
	
	@BeforeAll
	public static void initTests()
	{
		studentService = new StudentService();		
	}
	
	/*
	 * tests the calculate average function in StudentService class
	 */
	@Test
	public void testAverage()
	{
		student = new StudentBO(10, new int[] {75, 65, 100, 60, 76});
		
		Double actualAverage = studentService.calculateAverage(student);
		Double expectedAverage = (double) 75.2;
		
		assertTrue(actualAverage.equals(expectedAverage));
	}
	
	/*
	 * tests the isGood function in StudentService class when 
	 * student has	 marks in all 	subjects  greater than 60 
	 */
	@Test
	public void testGoodStudent()
	{
		student = new StudentBO(01, new int[] {62, 75, 81, 66, 70});
		
		assertEquals(CategoryEnum.GOOD, studentService.isGood(student));
	}
	
	/*
	 * tests the isGood function in StudentService class when 
	 * student 	has less	 than 40 	marks in  one subject 	
	 */
	@Test
	public void testNotGoodStdLowMarksInAtleastOne()
	{
		student = new StudentBO(01, new int[] {30, 75, 81, 66, 70});
		
		assertEquals(CategoryEnum.NOT_GOOD, studentService.isGood(student));
	}

	/*
	 * tests the isGood function in StudentService 
	 * class when student average is less than 60 	
	 */
	@Test
	public void testNotGoodStudentLowAvg()
	{
		student = new StudentBO(01, new int[] {30, 55, 65, 23, 73});
		
		assertEquals(CategoryEnum.NOT_GOOD, studentService.isGood(student));
	}

}