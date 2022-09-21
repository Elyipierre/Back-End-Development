package week2;

import java.util.Scanner;

public class teamPlayoffs {

	public static void main(String[] args) {
		//Will my team make the playoffs?
		Scanner team = new Scanner(System.in);
		int wins = team.nextInt();
		int losses = team.nextInt();
		boolean isFall = team.nextBoolean();
		
		if(wins > losses && isFall == true) {
			System.out.println("It's looking good for your team to make the playoffs.");
		} else if( wins > losses && isFall == false) {
			System.out.println("Your favorite team has promise, but it's too early to tell.");
		}else {
			System.out.println("It's not looking so good.");
		}
	}

}
