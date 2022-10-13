package Week4Collections;

public class StringAndStringBuilder {

	public static void main(String[] args) {
		
		String firstName = "Natasha";
		String lastName = "Pierre  ";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = mulitplyString("Hi",3);
		System.out.println(tripleHi);
		
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
		
		StringBuilder fullName = new StringBuilder("Layla");
		fullName.append(" Pierre");
		System.out.println(fullName.toString());
	}
	public static String mulitplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}
}
