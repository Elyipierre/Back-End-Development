package arraysAndMethods;

public class MethodPractice2 {

	public static void main(String[] args) {
		//create an array with the following values 1,5,2,8,13,6
		int[] numbers = new int[6];
		numbers[0] = 1;
		numbers[1] = 5;
		numbers[2] = 2;
		numbers[3] = 8;
		numbers[4] = 13;
		numbers[5] = 6;
		
		//print out the first element in the array
		System.out.println("First Array Number");
		System.out.println(numbers[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println("\n" + "---------------------");
		System.out.println("Last Array Number");
		System.out.println(numbers[numbers.length-1]);
		
		//print out the element in the array at position 6. What happens? Index 6 out of bounds for length 6
		//System.out.println(numbers[6]);
		
		//print out the element in the array at position -1. What happens? Index -1 out of bounds for length 6
		//System.out.println(numbers[-1]); 
		
		//write a traditional for loop that prints out each element in the array
		System.out.println("\n" + "---------------------");
		System.out.println("Traditional For Loop");
		for (int i =0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//write an enhanced for loop that prints out each element in the array
		System.out.println("\n" + "---------------------");
		System.out.println("Enhanced For Loop");
		for ( int number : numbers) {
			System.out.println(number);
		}
		//create a new variable called sum, write a loop that adds each element in the array
		System.out.println("\n" + "---------------------");
		System.out.println("Sum of Array");
		int sum = 0;
		for ( int number : numbers)  {
			sum += number;
		}
		//create a new variable called average and assign the average value of the array to it
		System.out.println(sum);
		System.out.println("\n" + "---------------------");
		System.out.println("Average of Array");
		double average = 0;
		for ( int number : numbers)  {
			average += number;
		}
		System.out.println(average / numbers.length);
		
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		System.out.println("\n" + "---------------------");
		System.out.println("Enhanced For Loop Odd Array Numbers");
		
		for ( int number : numbers) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		System.out.println("\n" + "---------------------");
		System.out.println("Array of Names");
		String[] names = new String[4];
		
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		
		for (String name : names) {
			System.out.println(name);
		}
		//calculate the sum of all the letters in the new array
		System.out.println("\n" + "---------------------");
		System.out.println("Number of Letters in Array Names");
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters =+ name.length();
			System.out.println(sumOfLetters);
		}
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		System.out.println("\n" + "---------------------");
		System.out.println("Greeting to my new born baby:");
		greet("Layla");
		
		//write and test a method that takes a String name and returns a greeting, do not print in the method
		System.out.println("\n" + "---------------------");
		System.out.println("Greeting to My WIfe");
		System.out.println(greet2("Natasha"));
		//Analyze the difference between these two methods -  what do you find? how are they different?
		// We cannot store the value  in greet("Layla"). you cannot convert from void to string. This will only do something.
		//(greet2("Natasha") will returns outside of the method
		
		//write a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
		System.out.println("\n" + "---------------------");
		System.out.println("Are The Number of Letters From Name Greater Than The Interger?");
		System.out.println(isStringLongerThanNumber("Belle",3));
		
		//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
		System.out.println("\n" + "---------------------");
		System.out.println("Does This word exist within Names Array?");
		System.out.println(doesArrayContainString(names, "sam"));
		
		//write and test a method that takes an array of int and returns the smallest number in the array
		System.out.println("\n" + "---------------------");
		System.out.println("Smallest Number in Numbers Array");
		System.out.println(findSmallestNumber(numbers));
		
		//write and test a method that takes an array of double and returns the average
		double[] pointsPerGame = {26.0, 24.0, 24.0, 26.0, 18.0, 13.0, 20.0, 22.0, 33.0, 21.0 };
		System.out.println("\n" + "---------------------");
		System.out.println("Lamelo Ball's PPG average from 3/25/2022 - 4/13/2022: ");
		System.out.println(lameloBallLastTenGameAverage(pointsPerGame));
		
		//write and test a method that takes an array of Strings and returns an array of int where each element matches the length
		//of the string at that position
		System.out.println("\n" + "---------------------");
		System.out.println("String | Number Match");
	}
	public static void greet(String name) {
		System.out.println("Hello, " + name + "! " + "Welcome to the Pierre Family, my love!");
	}
	public static String greet2(String name) {
		return "Hi " + name + "! " + "You mean the world to me.";
	}
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number;
	}
	public static boolean doesArrayContainString(String[] names, String string) {
		for (String str : names) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	public static int findSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if ( number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	public static double lameloBallLastTenGameAverage(double[] pointsPerGame) {
		double pointAverage = 0;
		for (double points : pointsPerGame) {
			pointAverage += points;
		}
		return pointAverage / pointsPerGame.length;
	}
	public static int extractStringLength(String[] names) {
		int[] results = new int[names.length];
		for (i = 0; i < names.length; i++) {
			
		}
	}
}
