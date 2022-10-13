package Week4Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		//This is a regular array
		String[]sportsCars = new String[4];
		
		sportsCars[0] = "Porche";
		sportsCars[1] = "Ferrari";
		sportsCars[2] = "Koenigsegg";
		sportsCars[3] = "Bugatti";
		
		//list<E> list of E where E is the generic that will be replaced with the type
		//List<String> reads as list if String
		//This is an ArrayList
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports .remove(1);
		
		for (int i=0; i<sports.size(); i++)	{
			System.out.println(sports.get(i));
		}
		// can also be written using an advanced loop
		for (String sport : sports) {
			System.out.println(sport);
		}
		//List cannot use primitive datatypes
		List<Integer> numbers = new ArrayList<Integer>(); // this is the format that will be used when creating a new instance of a list
	}

}
