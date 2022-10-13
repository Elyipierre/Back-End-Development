package Week4Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapApp {
	static Scanner scanner = new Scanner(System.in);
	static Map<String, String> phoneBook = new HashMap<String, String>();
	
	public static void main(String[] args) {
		//We will use a map to create key value pairs and store contact information and the name that is associated with it
		
		int choice = 0;
		
		while (choice != 4) {
			printMenu();
			
			choice = getUserChoice();
			if (choice == 1) {
				displayPhoneBook();
			} else if (choice == 2) {
				addContact();
			} else if (choice == 3) {
				deleteContact();
			} else if (choice == 4) {
				System.out.println("GoodBye!" + "\n");
			} else {
				System.out.println("Please pick a valid Option!");
			}
		}
	}
	public static void printMenu() {
		System.out.println("1) Print Phone Book");
		System.out.println("2) Add Contact");
		System.out.println("3) Delete Contact");
		System.out.println("4) Exit");
		System.out.println("--------------------------");
	}
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	public static void displayPhoneBook() {
		Set<String> phoneNumbers = phoneBook.keySet();
		for (String phoneNumber : phoneNumbers) {
			System.out.println(phoneNumber + ": " + phoneBook.get(phoneNumber));
		}
	}
	public static void addContact() {
		System.out.print("Enter Name: ");
		String name = scanner.next();
		System.out.print("Enter Phone Number: ");
		String phoneNumber = scanner.next();
		phoneBook.put(name, phoneNumber);//Phone Number set as Key. Name set for value
		System.out.println("Added " + name + ":" + phoneNumber + " to phonebook");
	}
	public static void deleteContact() {
		System.out.println("Enter Phone Number to delete: ");
		String phoneNumber = scanner.next();
		System.out.println("Removed" + phoneNumber + ": " + phoneBook.remove(phoneNumber));
	}
}
