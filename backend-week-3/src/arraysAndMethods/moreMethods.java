package arraysAndMethods;

public class moreMethods {

	public static void main(String[] args) {
		
		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
		
		System.out.println(sumArray(myArray));
		
		double[] groceryArray = new double[10];
		groceryArray[0] =1.99;
		groceryArray[1] =21.67;
		groceryArray[2] =32.00;
		groceryArray[3] =15.43;
		groceryArray[4] =3.87;
		groceryArray[5] =4.99;
		groceryArray[6] =2.33;
		groceryArray[7] =9.88;
		groceryArray[8] =15.22;
		groceryArray[9] =6.42;
		
		System.out.println("Total cost of groceries: $" + decimalArray(groceryArray));
		
		double[] grades = new double[5];
		grades[0] =88.7;
		grades[1] =92.5;
		grades[2] =100;
		grades[3] =67.3;
		grades[4] =78.9;
		System.out.println("Grade point average is " + calculatedAverage(grades));
		
		System.out.println(multiplyString("Hello", 3) );
		
	}
	/*
	 * takes an array of ints and returns the sum of all the ints
	 */
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
    /* 
     * Takes an array of double and returns the average of all elements in the array
     */
	q
	}
	public static double calculatedAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	/*
	 * Takes a String and an int and returns the String concatenated with itself int number of times.
	 * Example( If i pass in "Hello" and "3", it will print out as "HelloHelloHello"
	 */
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	
}
