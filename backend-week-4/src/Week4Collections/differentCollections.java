package Week4Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class differentCollections {

	public static void main(String[] args) {
		/*
		 * LIST
		 * Allows duplicates
		 */
		//List also keep elements ordered by an index, just like an array and allows null values.
		//common implementations: ArrayList, LinkedList, Vector
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Layla");
		students.add(null);
				
		for (String student : students) {
			System.out.println(student);
		}
			/*
			 * SET
			 */
		//Sets do not allow duplicates
		//Sets are unordered
		//common implementations: HashSet, LinkedHashSet, TreeSet
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alabama");
		states.add("Florida");
		states.add("Colorado");
		states.add("Texas");
		states.add("Michigan");
		states.add(null); // sets allow null but not duplicates of it
		
		System.out.println(states.size()); // this will delete the duplicate and only print out all the number of all other states in this case
		System.out.println(states.contains("delaware")); // checks to see if Deleware is part of the set of states
		if (states.contains("Alabama")) {
			states.remove("Alabama"); 
		}
		
		for (String state : states) {
			System.out.println(state); // this will only print out "Alabama once.
		}
		/*
		 * MAP
		 */
		//key value pairs (dictionary) example -  the definition of the word, Augment is the value and the work augment itself is the key
		//Values can be duplicate, but not keys. You can only have one of each key, for instance a phone number 
		//Common Implementations: HashMap, LinkedHashMap, TreeMap, HashTable
		Map<Integer, String> racerPlacements = new HashMap<Integer,String>();
		racerPlacements.put(1, "Layla");//PUT has two parameters. the 1st is the key and the second is the value
		racerPlacements.put(2, "Natasha");
		racerPlacements.put(3, "Elyi");
		System.out.println("-------------------------");
		System.out.println(racerPlacements.get(1));// this will print out the first: Layla
		System.out.println("-------------------------");   
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String,String>();
		dictionary.put("Augment", "make (something) greater by adding to it; increase.");
		dictionary.put("Dropensity", "an inclination or natural tendency to behave in a particular way");
		dictionary.put("Diminish","make or become less");
		dictionary.put("Tonality", "the harmonic effect of being in a particular key");
		dictionary.put("Overspeak", "To speak too much; t use too many words");
		
		
	}
}
