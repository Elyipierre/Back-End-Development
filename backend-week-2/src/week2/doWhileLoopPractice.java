package week2;

import java.util.Scanner;

public class doWhileLoopPractice {

	public static void main(String[] args) {
		int a = 0;
		
		while(a < 100) {
			System.out.println(a);
			a++;
		}
		System.out.println("Loop finished");
		
		for(int b = 0; b < 100; b++) {
			System.out.println(b);
		}
		System.out.println("Loop finished");
		
		int c = 9;
		
		do {
			System.out.println("Hello, World!");
			
		} while(c < 10);
		
		
	}

}
