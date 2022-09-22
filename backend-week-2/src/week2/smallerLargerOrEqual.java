package week2;

import java.util.Scanner;

public class smallerLargerOrEqual {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
	    int myNumber = in.nextInt();
	    int num1 = 156;    
	    if (num1 < myNumber) {
	    	System.out.println(num1 + " is smaller than my number, " + myNumber);
	    } else if(num1 > myNumber) {
	            System.out.println(num1 + " is larger than my number, " + myNumber);
	        } else {
	            System.out.println(num1 + " is equal to my number, " + myNumber);
	        }
	   }
}
