package Week4Collections;

public class CarArray {

	public static void main(String[] args) {
		//array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro","Corvette","Tesla","BMW"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[2]);
		
		String[]sportsCars = new String[4];
		
		sportsCars[0] = "Porche";
		sportsCars[1] = "Ferrari";
		sportsCars[2] = "Koenigsegg";
		sportsCars[3] = "Bugatti";
		
		System.out.println(sportsCars[2]);
		
		//how to use a for loop to iterate through all elements of array
		for(int i = 0; i < sportsCars.length; i++) {
			System.out.println(sportsCars[i]);
		}
	}
}
