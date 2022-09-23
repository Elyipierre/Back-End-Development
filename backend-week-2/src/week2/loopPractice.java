package week2;

import java.util.Scanner;

public class loopPractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String userWord = in.next();
        String longString ="";
        
        for(int i = 0; i < userWord.length(); i++) {
        	longString += userWord;
        }
        System.out.println(longString);
	}

}
