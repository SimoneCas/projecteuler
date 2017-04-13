package it.simonecasamassa.projectEuler;

public class Palindrome {

	public static boolean isPalindrome(String input) {
		if (input.length() > 1)
			return input.charAt(0) == input.charAt(input.length() - 1)
					&& isPalindrome(input.substring(1, input.length() - 1));

		else
			return true;
	}
}
