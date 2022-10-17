package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@SuppressWarnings("serial")
public class Deck extends ArrayList<Card> {
	private final List<String> people = List.of("Bobba Fett", "Anakin Skywaler", "Luke Skywalker", 
			"Leia Organa", "Han Solo", "Padmé Amilda","Jabba the Hutt", "Chewbacca", "Yoda", "C3-PO", 
			"R2-D2", "Shmi Skywalker","Rey Skywalker", "Jar-Jar Binks", "Maz Kanata", "Wedge Antilles");
	
	private final List<String> planets =
			List.of("Tatooine", "Alderaan", "Hoth", "Kamino", "Naboo", "Dagobah");
	
	public Deck() {
		for (int personPos = 0; personPos < people.size(); personPos +=1) {
			int rank = personPos + 1;
			String person = people.get(personPos);
			
			for (String planet : planets) {
				add(new Card(person, planet, rank));
			}
		}
	}

	@Override
	public String toString() {
//		StringBuilder b = new StringBuilder();
		String lf = System.lineSeparator();
//				
//		b.append("List of cards:").append(lf);
//		
//		for (Card card : this) {
//			b.append(" ").append(card).append(lf);
//		}
//		
//		return b.toString();
		
		//Can also be written like this
		//return this.stream().map(card -> card.toString()).collect(Collectors.joining(lf));
		//You can make this even simpler by using a method reference
		return this.stream().map(Card::toString).collect(Collectors.joining(lf));
		
		//This works because I have a simple one line lambda simply returns something, I can just change the
		//it to a method reference
	}

	public void shuffle() {
//		Random random = new Random();
//		
//		for (int cardPos = 0; cardPos < size(); cardPos++) {
//			int swapPos = random.nextInt(size());
//			
//			Card myCard = get(cardPos);
//			Card swapCard = get(swapPos);
//			
//			//We get the card at each position and swap them at arraylist
//			set(cardPos, swapCard);
//			set(swapPos, myCard);
//		}
		
		//The easy way of doing this is shown below:
		Collections.shuffle(this);
		//Or
		//Collections.swap(this, cardPos, swapPos); - directly under line 55. there would then be no need
		//for line 57 and 58
		
	}
}
