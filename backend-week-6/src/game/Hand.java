package game;

import java.util.ArrayList;
import java.util.stream.Collectors;

@SuppressWarnings("serial")
public class Hand extends ArrayList<Card> {
	@Override
	public String toString() {
		String lf = System.lineSeparator();
		return this.stream().map(Card::toString).collect(Collectors.joining(lf));
		//This works because I have a simple one line lambda simply returns something, I can just change the
		//it to a method reference
	}
}
