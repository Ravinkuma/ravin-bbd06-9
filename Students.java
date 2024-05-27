package com.java.practice31;

public class Students extends Person {
       int studentId;
	public Students(String name, int age, int studentId) {
		super(name, age);
		this.studentId=studentId;
	}
	public void printDetails() {
		super.printDetails();
		System.out.println("Id of student is: "+studentId);
	}
	

}
