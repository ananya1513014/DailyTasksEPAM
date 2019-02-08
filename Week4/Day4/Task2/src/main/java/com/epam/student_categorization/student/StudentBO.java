/*
 * Model class for Student
 */
package com.epam.student_categorization.student;

/**
 * @author Ananya Goel
 *
 */

public class StudentBO {
	int studentID;
	int[] marksArray;
	
	public StudentBO(int studentID, int[] marksArray) {
		setMarksArray(marksArray);
		setID(studentID);
	}
	public int getID() {
		return studentID;
	}
	public void setID(int iD) {
		studentID = iD;
	}
	public int[] getMarksArray() {
		return marksArray;
	}
	public void setMarksArray(int[] marksArray) {
		this.marksArray = marksArray;
	}
}