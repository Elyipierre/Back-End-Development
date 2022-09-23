package week2;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number for mulitplication table: ");
		int num = in.nextInt();
		System.out.println("Multiplication Table of " + num);
		
		for(int i = 1; i <= 10; i++) {
			
				System.out.println(num + "x" + i + "=" + (num*i) );
	   }
	}

}
