package com.core.java.programs;

public class StudentTester {

	public static void main(String[] args) {
		Student student=new Student(1001,"Himanshu", 80, 'H', 4);
		System.out.println("ID :" +student.getStudentId());
		System.out.println("Name :" +student.getName());
		System.out.println("MArks :" +student.getQualifyMarks());
		System.out.println("Status :" +student.getResStatus());
		System.out.println("Year :" +student.getYearOfEng());
	}

}
