package ObjectOrientedProgramming;

public class Student {
	
	static int numberOfStudents;// To access this, you dont need an instance of the class, you access it on the class 
	
	String firstName; // this is just the Blueprint, so no value is neeeded
	String lastName;
	String phoneNumber;
	int gradeLevel;
	
	public Student() {}
	public Student (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this .phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
	}
	//create a method to group data and logic
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade level " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber );
	}
	
}
