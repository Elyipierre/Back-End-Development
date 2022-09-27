package arraysAndMethods;

import java.util.Scanner;

public class TeamMenuApp {

	Scanner s = new Scanner(System.in);  
	
	public static void main(String[] args) {
		// This is a menu drive application that allows us to manage a team
		/*
		 * Add team member
		 * View team member
		 * Delete team member by position
		 * Delete all team members
		 */
		
		
		String[] team = new String[5];
		
		int decision = 0;
		
		while(decision != -1) {
			showMenu();
			decision = s.nextInt();
			
			if (decision < -1 || decision >5) {
				System.out.println("Please  picj a valid option.");
			} else if (decision == 1) {
				//showTeam(team);
			} else { if (decision == 2) {
				
			}else if (decision == 3) {
				
			}else if (decision == 4 ) {
				
			}else {
				
			}
		}	
	}
		
    public static void showMenu() {
    	System.out.println("Please pick an option or enter -1 to exit.");
    	System.out.println("1) Show Team");
    	System.out.println("2) Show Team Member");
    	System.out.println("3) Add a Tea, Member");
    	System.out.println("4) Delee Team Member");
    	System.out.println("5) Delete All Team Members");
    }
}
