package game;

public class Card {
	private String person;
	private String planet;
	private int rank;
	
	public Card(String person, String planet, int rank) {
		this.person = person;
		this.planet = planet;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return person + " of " + planet;
	}

	public int getRank() {
		return rank;
	}

}
