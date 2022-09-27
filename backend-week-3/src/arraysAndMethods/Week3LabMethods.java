package arraysAndMethods;

import java.lang.reflect.Array;

public class Week3LabMethods {

	public static void main(String[] args) {
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greet("Natasha");
		greet("Baby Tasha");
		
		//write and test a method that takes a String name and returns a greeting, do not print in the method
		String greeting = greet2("Elyi");
		System.out.println(greeting);
		
		//analyze the difference between these two methods - what do you find? How are they different?
		 /*
		  * The first method does not store the value to be printed. The second one accesses the value outside of the method itself
		  */
		
		//write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
		System.out.println(isStringLongerThanNumber("Hello", 3));
		
		//write and test a method that takes an array of int and returns the smallest number in the array
		String[] names = {"Natasha", "Baby Tasha", "Elyi"};
		System.out.println(doesArrayContainString(names, "Hello"));
		
		//write and test a method that takes an array of int and returns the smallest number in the array
		int[] num = {1,5,2,8,13,6};
		System.out.println(findSmallestNumber(num));
		
		//write and test a method that takes an array of double and returns the smallest number in the array
		double[]temperatureNumber = {50.8, 20.5, 98.6, 70.7, 63.4, 102.3};
		System.out.println(lowestDegree(temperatureNumber));
		
		//write and test a method that takes an array of double and returns the average
		double[]grades = {50.8, 20.5, 98.6, 70.7, 63.4, 102.3};
		System.out.println(calculateGradeAverage(grades));
		
		//write and test a method that takes an array of Strings and returns an array of int where each element matches the length of the string at that position
		int[] nameLengths = extractStringLength(names); 
		for (int number : nameLengths) {
			System.out.println(number);
		}
		
		//write and test a method that takes an array of stings and returns true if the sum of letters for all strings with an even amount of letters
		//is greater than the sum of those with an odd amount of letters
		System.out.println(hasMoreEVenWordCharacters(names));
		
		//write and test a method that takes a string and returns true if the string is a palindrome. (A palindrome is a word that is the same forward and back
		//example: racecar, mom, wow, madam, civic, level, tenet, malayalam, noon, refer, gig, radar, peep, nun, pop, sexes, elle, aidia, ara, hannah, bob
		System.out.println(isPalindrone("is this wor a palindrone: " + "racecar"));
	}
	public static void greet(String name) {
		System.out.println("Hello " + name + "!");
	}
	public static String greet2(String name) {
		return "Hi " + name + "!";
	}
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number; //If the value is true it will return the method. If not, it will return false
	}
	public static boolean doesArrayContainString(String[] array, String string ) {
		for (String str : array) {
			if(str.equals(string)) {
				return true;
			}
		}
	    return false;
    }
	public static int findSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if(number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	public static double lowestDegree(double[] degrees) {
		double lowest = degrees[0];
		for(double degree : degrees) {
			if( degree < lowest) {
				lowest = degree;
			}
		}
		return lowest;
	}
	public static double calculateGradeAverage(double[] myArray ) {
		double sum = 0;
		for (double number : myArray) {
			sum += number;
		}
		return sum / myArray.length;
	}
	public static int[] extractStringLength(String[] strings) {
		int[] results = new int[strings.length];
		for(int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
		
	}
	public static boolean hasMoreEVenWordCharacters(String[] myArray) {
		int evenLetters = 0;
		int oddLetters = 0;
		for(String string: myArray) {
			if(string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters =+ string.length();
			}
		}
		return evenLetters > oddLetters;
	}
	public static boolean isPalindrone(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
