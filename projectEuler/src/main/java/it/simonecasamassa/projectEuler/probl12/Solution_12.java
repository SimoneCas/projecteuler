package it.simonecasamassa.projectEuler.probl12;

import java.util.ArrayList;
import java.util.List;

public class Solution_12 {

	private long index = 0;
	private long lastSum = 0;
	
	private static final int NUMBER_OF_DIVISORS = 500;
	
	public static void main(String[] args) {
		new Solution_12().findSolution();
	}

	private void findSolution() {
		boolean foundedResult = false;
		long start = System.currentTimeMillis();
		do {
			List<Long> divisors = new ArrayList<>();
			index ++;
			lastSum = lastSum + index;
			System.out.println("Searching for " + index);
			System.out.println("Current sum " + lastSum);
			long startDivisorsSearch = System.currentTimeMillis();
			for(long i=1; i<=lastSum; i++){
				if (lastSum % i ==0){
					divisors.add(i);
				}
			}
			long endDivisorsSearch = System.currentTimeMillis();
			System.out.println("Elapsed time: " + (endDivisorsSearch - startDivisorsSearch));
			
			System.out.println("Number of divisors: " + divisors.size());
			foundedResult = divisors.size()>NUMBER_OF_DIVISORS ? true : false; 
			
		} while (!foundedResult);
		
		long end = System.currentTimeMillis();
		System.out.println("Total elapsed time: " + (end - start));
		System.out.println("value of the first triangle number to have over " + NUMBER_OF_DIVISORS + " divisors: " + lastSum);
			
	}
}
