package game;

public class Player {
	private String name;
	private Hand hand = new Hand();
	private int score = 0;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	public void draw(Deck deck) {
		hand.add(deck.remove(0)); // when we add, we are putting the first card on the top of deck
	}

	public Hand getHand() {
		return hand;
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void incrementScore() {
		score += 1;
	}

	public int getScore() {
		return score;
	}
	

}