package arraysAndMethods;

public class objects {

	public static void main(String[] args) {
		// The main difference between a primitive data type and an object is that a primitive is just a piece of data and nothing more. 
		// Take note of the example below:
		int age = 34; //This is a primitive data type with the value "34" assigned to it. there is nothing more to this than the value.
		// let us now take a look at an object below:
		
		String name = "Elyi Pierre";// we will look at the String object
		
		// the String object has properties and methods. In the same way that we wrote methods, an object has methods on them that you 
		//can already use
		
		//name.
		
		// once i put the "." We can see a list of properties and methods that can be used on the object. 
		//properties and methods are accessed through dot notation.
		
		//Note what you could do i you wanted to know how long the string is below:
	    System.out.println(name.length());
	    
	    //primitive data types do not have properties and methods on them. Objects do. 
	    
	    int[]numbers = new int[3]; // although in is a primitive data type, we are able to access properties methods through the array. 
	    System.out.println(numbers.length);
	    
	    /*
	     * What are JAVADOCS?
	     * they are the documentation that the libraries use in java.
	     */
	    System.out.println(name.charAt(7));
	}

}
