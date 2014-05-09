//
// Purpose: To check if input is a palindrome: a word, phrase, number or other sequence of units that can be read the same way in either direction (the adjustment of punctuation and spaces between words is generally permitted).
// Written by Lori L. Gildersleeve, February 2008
// 



package palindromeChecker;

import java.util.ArrayList;


public class Main {

	public static void main (String[] args) {
		

		char[] palindromeToCheck = "te net".toLowerCase().toCharArray();
		boolean isPalindrome = true;
		ArrayList<Character> cleanPalindromeToCheck = new ArrayList<Character>();
		
		for (int index = 0; index < palindromeToCheck.length; index++) {
			char c = palindromeToCheck[index];
			if (Character.isLetter(c) || Character.isDigit(c)) {
				cleanPalindromeToCheck.add(c);
			}			
		}

		int checkValue = cleanPalindromeToCheck.size()-1;
		
		for (int index = 0; index < ((cleanPalindromeToCheck.size() +1)/2); index++) {
			char checkMe = cleanPalindromeToCheck.get(index);
			if (checkMe != cleanPalindromeToCheck.get(checkValue)) {
				isPalindrome = false;
				break;
			}
			checkValue--;
		}
		
		
		
		if (isPalindrome == true) {
			System.out.println("You entered a palindrome." );
		} else {
			System.out.println("You did not enter a palindrome.");
		}
		
	}
	
}
