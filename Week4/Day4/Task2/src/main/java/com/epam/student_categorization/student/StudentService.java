/*
 * This 	class 	contains   methods for 
 * performing operations on Student object
 */
package com.epam.student_categorization.student;

import com.epam.student_categorization.CategoryEnum;

/**
 * @author Ananya Goel
 *
 */

public class StudentService {

	/*
	 * arguments: object of StudentBO class
	 * returns: double(average of the marksArray property of StudentBO object)
	 */
	public double calculateAverage(StudentBO student) {

		int sum=0;
		
		for(int marks : student.getMarksArray())
		{
			sum = sum + marks;
		}
		
		return (double)sum/student.getMarksArray().length;
	}

	/*
	 * arguments: object of StudentBO class
	 * returns object of enum Category
	 */
	public CategoryEnum isGood(StudentBO student) {
		int[] marksArray = student.getMarksArray();
		
		CategoryEnum category=CategoryEnum.GOOD;
		
		if(this.calculateAverage(student)<60)	category = CategoryEnum.NOT_GOOD;
		
		for(int marks : marksArray)
		{
			if(marks<40) category = CategoryEnum.NOT_GOOD;
		}
		return category;
	}
}