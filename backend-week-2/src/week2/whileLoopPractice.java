package week2;

import java.util.Scanner;

public class whileLoopPractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 100: ");
		int userNumber;
		userNumber = in.nextInt();
		
		if ( userNumber > 100 || userNumber < 10 ) {
            System.out.println("Your number is not between 10 and 100.");
        } else {
            while ( userNumber >= 10 ) {
                System.out.println(userNumber);
                userNumber--;
			}
		}
	}
}
