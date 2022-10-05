package arraysAndMethods;

public class _2DArrays {

	public static void main(String[] args) {
		// 2D array = an array of arrays
		String[][] cars = new String[3][3];
		
		cars[0][0] = "camero";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Silverado";
		cars[1][2] = "Telsa";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Koenigsegg";
		cars[2][2] = "bugatti";
		
		System.out.println(cars[1][2]);
		// display all elements of 2d array with a nested for loop: one outer for loop for rows and one inner for loop for columns
		for(int i= 0; i < cars.length; i++) {
			System.out.println();
			for(int j = 0; j < cars[i].length;j++) {
				System.out.println(cars[i][j] + " ");
			}
		}

	}

}
