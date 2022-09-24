package arraysAndMethods;

public class moreArrays {

	public static void main(String[] args) {
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for(String product : products) {
			System.out.println("Products: " + product);
		}
		System.out.println("Multiples Of Three:");
		int[] multiplesOfThree = new int[10];
		
		for(int i = 1; i <= multiplesOfThree.length; i++) {
			multiplesOfThree[i-1] = i * 3;
			System.out.println("number: " + multiplesOfThree[i-1]);
		}
		System.out.println("Multiples Of Five:");
		int[] multiplesOfFive = new int[10];
		
		for(int i = 0; i < multiplesOfFive.length; i++) {
			multiplesOfFive[i] = (i + 1) * 5;
			System.out.println(multiplesOfFive[i]);
		}
	}

}
