package Week4Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {

	List<String> names = new ArrayList<> (List.of("Bilbo", "Frodo", "Samwise"));
	System.out.println(names.getClass().getName());
	names.add("Aragon");
	}
}
