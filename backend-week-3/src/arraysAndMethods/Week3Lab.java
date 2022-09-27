package arraysAndMethods;

public class Week3Lab {

	public static void main(String[] args) {
		//create an array with the following values: 1,5,2,8,13,6
		int[] num = {1,5,2,8,13,6};
		//or
		int[] myArray = new int[6];
		myArray[0] = 1;
		myArray[1] = 5;
		myArray[2] = 2;		
		myArray[3] = 8;
		myArray[4] = 13;
		myArray[5] = 6;
		//print out the first element in the array
		System.out.println(num[0]);
		System.out.println(myArray[0]);
		//print out the last element in the array without using the number 5
		System.out.println(myArray[myArray.length - 1]); //This will always show us the last element in an array.
		//print out the element in the array at position 6. What happens? 
		//System.out.println(myArray[6]); //Index 6 out of bounds for length 6
		//print out the element in the array at position -1. What happens?
		//System.out.println(myArray[-1]); //Index -1 out of bounds for length 6
		//write a traditional for loop that prints out each element in the array
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}//write an enhanced for loop that prints out each element in the array
		for(int number : myArray) {
			System.out.println(number);
		}//create a new variable called sum, write a loop that adds each element in the array to the sum
		int sum = 0;
		for(int number : myArray) {
			sum += number;// this adds everything up in array plus sum(0)
		}
		System.out.println(sum);
		//create a new variable called average and assign the average value of the array to it
		//to find the average of something, you must add everything up, then divide it by the number of values
		int average = sum/ myArray.length;
		System.out.println(average);
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for(int odd : myArray) {
			if(odd % 2 != 0) {
				System.out.println(odd);
			}
		}
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		//calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for(String name : names ) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
		greet("Natasha");
		greet("Baby Tasha");
	 
	}
	///write and test a method that takes a String name and prints out a greeting, this method returns nothing
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!" );
	}

}
