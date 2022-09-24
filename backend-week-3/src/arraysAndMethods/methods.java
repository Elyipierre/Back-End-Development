package arraysAndMethods;

public class methods {

	public static void main(String[] args) {
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName); //firstName + " " + lastName; // Instead of doing this, we can write a method that takes two strings and returns
		String fullName2 = createFullName("sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
	} // In order to use a method, we have to go outside of the main method, which would be below this curly brace.
    public static String createFullName(String x, String y) {
    	return x + " " + y;
    	 
    } // The value of a method allows you to use it over and over again You  don't know what the variables are until the get passed inside of the method block
}
