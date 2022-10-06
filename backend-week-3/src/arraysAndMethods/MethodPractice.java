package arraysAndMethods;

public class MethodPractice {

	public static void main(String[] args) {
		int[] myArray = new int[10];
		
		myArray[0] = 5;
		myArray[1] = 47;
		myArray[2] = 63;
		myArray[3] = 72;
		myArray[4] = 38;
		myArray[5] = 79;
		myArray[6] = 14;
		myArray[7] = 35;
		myArray[8] = 16;
		myArray[9] = 22;
		
		System.out.println(sumArray(myArray));
		
		double[] doubleArray = new double[10];
		
		doubleArray[0] = 10.2;
		doubleArray[1] = 27.3;
		doubleArray[2] = 32.4;
		doubleArray[3] = 23.6;
		doubleArray[4] = 17.2;
		doubleArray[5] = 18.5;
		doubleArray[6] = 40.0;
		doubleArray[7] = 16.7;
		doubleArray[8] = 27.1;
		doubleArray[9] = 19.2;
		
		System.out.println(averageArray(doubleArray));
		
		System.out.println(nameConcat("Chloe", 3));
		
		String name = "Chloe";
		System.out.println(name.length());
	}
	//Take an array of ints and return the sum of all the ints
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	//take an array of doubles and returns the average of all elements in the array
	public static double averageArray(double[] numbers) {
		double average = 0.0;
		for (double number : numbers) {
			 average+= number;
		}
		return average / numbers.length;
	}
	// take a String and an int and return the String concatenated with itself int number of times
	 public static String nameConcat(String str, int num) {
		 String result = "";
		 for ( int i = 0; i < num; i++) {
			 result += str;
		 }
		 return result;
	 }
	 
}
