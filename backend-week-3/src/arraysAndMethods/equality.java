package arraysAndMethods;

public class equality {

	public static void main(String[] args) {
		// == equality  operator checks to see if to values are the same in memory
		// with primitives. if both variables match the will equal, but wont be in objects
		
		//even though the two values are the same, its a different object in memory so they will equality will fail
		String a = new String("Hello");
		String b = new String("Hello");
		//example,: you can have to cars that are the exact make model color and spec. Although the look very similar, they still are 
		//not the same car
		
		System.out.println(a); 
		System.out.println(b);
		System.out.println(a == b); // this will print as false because they are not pointing to the same memory
		
		//What if i want to compare two different objects but see if they have the same values? We would do so by using a method.
		System.out.println("Equals() method: " + a.equals(b));// .equals takes the object and compares it to he object that you called it on
		
		// primitive data types always point to the same literal.
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y); // this will print as true
		
		String c = new String(" 2023 Black - Tesla Model S Plaid");
		String d = c;
		
		System.out.println(c);
		System.out.println(d); // this point to the same object in memory
		System.out.println(c == d); // this prints out to true because i points to the same object
	}

}
