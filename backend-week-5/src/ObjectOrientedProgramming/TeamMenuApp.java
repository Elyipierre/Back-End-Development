package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {

	static Scanner scanner =  new Scanner(System.in);
	static List<Team> teams = new ArrayList<Team>();
	
	public static void main(String[] args) {
		//Application to manage team and players
		
//		Player p1 =  new Player("Elyi Pierre", "Shooting Forward", "Quick Latteral Movement, Defencive Presence, Shot Sniper");
//		Player p2 =  new Player("Justin Hollins", "Point Gaurd", "High Offensive IQ, Shifty");
//		Player p3 =  new Player("Josue Pierre", "Point forward", "Defensive Presence, High Shot Pertentage");
//		Player p4 =  new Player("Andrew Cash", "Point Guard", "Bounce, Lateral Movement, Speed");
//		Player p5 =  new Player("Davion White", "Point Guard", "Street Ball Moves, Offensive Liabilty, Slow");
//		Team team = new Team("The Thaytas" + "\n" + "------------------------");
//		team.addPlayer(p1);
//		team.addPlayer(p2);
//		team.addPlayer(p3);
//		team.addPlayer(p4);
//		team.addPlayer(p5);
//		team.describe();
//		
//		team.removePlayer("Davion");
//		team.describe();

		
		int decision = 0;
		
		while (true) {
			
			printOptions();
			decision = scanner.nextInt();
			if (decision == 1) {
				teams.add(createNewTeam());
			} else if (decision == 2 ) {
				addPlayerToTeam();
			} else if (decision == 3 ) {
				removePlayerFromTeam();
			} else if (decision == 4 ) {
				describeTeam();
			}else {
				System.out.println("Please Pick a Valid Option!");
			}
		}
	}
	
	private static void printOptions() {
		System.out.println("1) Create New Team");
		System.out.println("2) Add New Player To Team");
		System.out.println("3) Remove Player From Team");
		System.out.println("4) View Team Info");
	}
	
	private static void describeTeam( ) {
		printTeamNames();
		System.out.println("Which team would you like to see info for? ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static Team createNewTeam() {
		System.out.print("Enter name of the team you want to create: ");
		String name = scanner.next();
		return new Team(name);
	}
	
	private static void addPlayerToTeam() {
		System.out.print("Enter the name of the team you wish to add a player to: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.addPlayer(createNewPlayer());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static void removePlayerFromTeam() {
		printTeamNames();
		System.out.print("Enter the name of the team you wish to remove a player From: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
			System.out.print("Which player would you like to remove? ");
			String playerName = scanner.next();
		foundTeam.removePlayer(playerName);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static Player createNewPlayer() {
		System.out.print("Enter Player Name: ");
		String name = scanner.next();
		System.out.println("Enter Player Position:");
		String position = scanner.next();
		System.out.println("Enter Player Specialty: ");
		String specialty = scanner.next();
		return new Player(name, position, specialty);
		
	}
	
	private static void printTeamNames() {
		for (Team team : teams) {
			System.out.println(team.getName());
		}
	}
	
	private static Team findTeamByName(String name) throws Exception {
		for (Team team : teams) {
			if (team.getName().equals(name)) {
				return team;
			}
		}
		throw new Exception("Team Not Found: " + name);
	}

}
