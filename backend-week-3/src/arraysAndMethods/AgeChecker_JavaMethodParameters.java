package arraysAndMethods;

public class AgeChecker_JavaMethodParameters {

	//Create a checkAge() method with an integer variable called age
	static void checkAge(int age) {
		
		//if age is less than 18, print "access denied"
		if (age < 18) {
			System.out.println("Access denied - You are not old enough!");
			
		//If the age is greater than, or equal to, 18, print "access granted"
		} else {
			System.out.println("Access granted - You ae old enough!");
		}
	}
	
	public static void main(String[] args) {
	checkAge(20); // Call the checkAge method and pass along a age of 20	
	}
}

//Outputs "Access granted - You are old enough!"