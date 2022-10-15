package ObjectOrientedProgramming;

public class Encapsulation {

	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("Layla Baby");
		student.setPhoneNumber("1234567890");
		student.introduce();
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
		
		//While this works, it is considered very very poor practice in object oriented programming, We need  to encapsulate the data
		//to only expose what needs to be used.
		//To do this, we are going to use access modifiers
		
		/*
		 * ---------------------------------------------------------------------------------------------------------------
		 * |______________________________________________Access Modifiers_______________________________________________|
		 * [public] - Accessible everywhere. You can gain access it to it no matter where you are at.
		 * [private] - Only Accessible within a class itself
		 * [protected] - Only accessible within the class, other in the same package, and all subclasses( A class that inherits from another class
		 * [No Modifier] - The same as protected, except that it is not  accessible in a subclass in different packages.
		 */
	}

}
 