package arraysAndMethods;

public class TimesTable {

	public static void main(String[] args) {
		
		//Multiplication table for 7
		
		int [] multiplesOf7 = new int [10];
		
		for(int i = 0; i < multiplesOf7.length; i++) { //We will increment i up to 10 if it array has less the than 10 elements
			multiplesOf7[i] = (i + 1) * 7; //answer = (0 + 1) = 1 * 7 = 7
			System.out.println(multiplesOf7[i]);
		}

	}

}
