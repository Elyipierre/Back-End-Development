package arraysAndMethods;

public class CallMethod {

	public static void main(String[] args) {
		//name of Our Baby
		String firstName = "Baby";
		String lastName = "Pierre";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Layla", lastName);
		String fullName3 = createFullName("Jaden", lastName);
		String fullName4 = createFullName("Zaria", lastName);
		String fullName5 = createFullName("Jasmine", lastName);
		System.out.println(fullName);
		System.out.println(fullName2);
		System.out.println(fullName3);
		System.out.println(fullName4);
		System.out.println(fullName5);
	}
	public static String createFullName(String x, String y) {
		//String fullName = "The name of my future child is " + x + " " + y;
		//return fullName;
		
		//This can also be written like this:
		
		return "The name of my baby girl is " + x + " " + y;
	}

}
