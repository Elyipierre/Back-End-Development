package week2;

import java.util.Scanner;

public class letterGrader {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numericGrade = in.nextInt();
		
		// write your if/else if statement here and check your conditions using the variable numericGrade
		if (numericGrade >= 90) {
		    System.out.println("You scored a(n) " + numericGrade + " on the assignment and reieved a passing grade of A");
		} else if (numericGrade >= 80 && numericGrade < 90) {
		    System.out.println("You scored a(n) " + numericGrade + " on the assignment and reieved a passing grade of B");
		} else if (numericGrade >= 70 && numericGrade < 80) {
		    System.out.println("You scored a(n) " + numericGrade + " on the assignment and reieved a passing grade of D");
		} else if (numericGrade >= 60 && numericGrade < 70) {
		    System.out.println("You scored a(n) " + numericGrade + " on the assignment and reieved a passing grade of A");
		} else {
		    System.out.println("You scored a(n) " + numericGrade + " on the assignment and reieved a failing grade of F");
		}
	}
}	