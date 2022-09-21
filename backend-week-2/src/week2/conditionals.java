
package week2;

public class conditionals {

	public static void main(String[] args) {
		String name = "Natasha Pierre";
		
		if (name == "Natasha") {
			System.out.println("Hello Baby Pierre!");
			} else { 
				System.out.println("You are not Baby Pierre!");
			}
		int age = 5;
		
		if (age >=16 ) {
			System.out.println("You can get your license!");
		} else {
			System.out.println("Please wait " + (16 - age) + " year(s) before you can get your license");
		}
		
		double costOfMilk = 2;
		
		if (costOfMilk <= 2) {
			System.out.println("Buying 2");
			
		}else if (costOfMilk <= 3) {
			System.out.println("Buying 3");
		} else {	
			System.out.println("Not buying any milk.");
		}
		
		//switch statement
		
		char grade = 'A';
		
		switch (grade) {
		    case 'A':
		    	System.out.println("90%");
		    	break;
		    case 'B':
		    	System.out.println("80%");
		    	break;
		    case 'C':
		    	System.out.println("70%");
		    	break;
		    default:
		    	System.out.println("0%");
		    	
		}
		
		// handling multiple conditions together by nesting
		if (5 == 5) {
			if (4 == 4) {
				System.out.println("5 is 5 and 4 is 4");
			} else {
				System.out.println("5 is 5");
			}
		}
		// we can accomplish the same thing by doing the following: Always flatten with logical and operator to 
		//avoid diverge statements
		if (5 == 5 && 4 == 4) {
			System.out.println("yes");
		}	
	}

}

