package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GalacticWar {
	private final List<String> members =
			List.of("Bryce", "Christian", "Thomas", "Ramon", "Steve", "Cade",
			"Haskell", "Darya", "Gersen", "Brandon", "Elyi" );
	
	private Random random =  new Random();

	public static void main(String[] args) {
		new GalacticWar().playGame();
	}

	//WE HAVE CREATED TWO PLAYERS
	private void playGame() {
		List<String> names = new ArrayList<>(members);
		Player Player1 = findPlayer(names);
		Player Player2 = findPlayer(names);
		
		System.out.println(Player1 + " is playing " + Player2 + "!!" + "\n" + "------------------------------");
		
		//WE HAVE CREATED A DECK
		Deck deck = new Deck();
		//WE HAVE SHUFFLED THE DECK
		deck.shuffle();
		//WE HAVE DEALT THE DECK TO EACH PLAYER
		deal(deck, Player1, Player2);
		//WE HAVE PLAYED THE GAME AND GOT THE SCORES
		play (Player1, Player2);
		//WE PRINT THE CARD HAND FOR PLAYER1 AND PLAYER 2
		System.out.println(deck);
		declareWinner(Player1, Player2);
		
		System.out.println(Player1 + "'s hand:\n" + Player1.getHand()+ "\n" + "------------------------------");
		System.out.println(Player2 + "'s hand:\n" + Player2.getHand()+ "\n" + "------------------------------");
	}

	private void declareWinner(Player player1, Player player2) {
		if (player1.getScore() > player2.getScore()) {
			printWinner(player1);
			printLoser(player2);
		}
		else if (player2.getScore() > player1.getScore()) {
			printWinner(player2);
			printLoser(player1);
		}
		else {
			printTie(player1, player2);
		}
	}

	private void printTie(Player player1, Player player2) {
		System.out.println(player1 + " and " + player2 + "tied with a score of " + player2.getScore() );
	}

	private void printLoser(Player loser) {
		System.out.println(loser + " has lost the game with a score of " + loser.getScore()+ "\n" + "------------------------------");
	}

	private void printWinner(Player winner) {
		System.out.println(winner + " is the glorious winner with a score of " + winner.getScore());
	}

	private void play(Player player1, Player player2) {
		int numTurns = player1.getHand().size();
		
		for (int turn = 0; turn < numTurns; turn++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if (card1.getRank() > card2.getRank()) {
				player1.incrementScore();
			}
			else if (card2.getRank() > card1.getRank()) {
				player2.incrementScore();
			}
		}
	}

	//The homework wants us to use a traditional for loop and use the modular operator inside that
	private void deal(Deck deck, Player player1, Player player2) {
		int size = deck.size();
		
		for (int index = 0; index < size; index += 1) {
			if (index % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		} 
		
	}

	private Player findPlayer(List<String> names) {
		int pos = random.nextInt(names.size());
		String name = names.get(pos);
		names.remove(pos);
		
		return new Player (name);
	}

}