package it.simonecasamassa.projectEuler.probl4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.AbstractDocument.LeafElement;

import it.simonecasamassa.projectEuler.Palindrome;

/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Solution_4 {
	
	public static void main(String[] args){
		new Solution_4().findSolution();
	}
	
	public void findSolution(){
		List<Long> palindromeList = new LinkedList<Long>();
		int  x = 999;
		
		for (int i=x; i>0; i--){
			for (int j=x; j>0;j--){
				long z = i*j;
				if(Palindrome.isPalindrome(Long.toString(z)))
					palindromeList.add(z);
			}
			
		}
		
		System.out.println("Max palindrome number = "+Collections.max(palindromeList));
		
	}
	
	
}

