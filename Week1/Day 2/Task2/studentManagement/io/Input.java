package com.epam.studentManagement.io;

import java.util.Scanner;

public class Input {
	static Scanner scannerObj = new Scanner(System.in);

	public static String inputStudentName()
	{
		return scannerObj.next();
	}
	public static int inputStudentAge()
	{
		return scannerObj.nextInt();
	}
	public static boolean moreStudentsRequired()
	{
		return scannerObj.nextBoolean();
	}
}
