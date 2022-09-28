package Week4Collections;

public class StringBuilder {

	public static void main(String[] args) {
		
		String firstName = "Natasha";
		String lastName = "Pierre";
		System.out.println(firstName + " " + lastName);
		
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
	}
}
