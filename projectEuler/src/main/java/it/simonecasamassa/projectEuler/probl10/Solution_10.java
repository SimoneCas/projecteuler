package it.simonecasamassa.projectEuler.probl10;

import java.util.List;
import java.util.stream.Collectors;

import it.simonecasamassa.projectEuler.FirstNPrimeNumber;

public class Solution_10 {
	
	private static final int LIMIT = 2000000;

	public static void main(String[] args) {
		new Solution_10().findSolution();
	}

	private void findSolution() {
		System.out.println("start solution 10");
		List<Long> nPrimeNumbers = FirstNPrimeNumber.getPrimeNumbersBelow(LIMIT);
		System.out.println("Prime numbers count: " + nPrimeNumbers);
		Long result = nPrimeNumbers.stream().collect(Collectors.summingLong(Long::longValue));
		System.out.println("Solution 10 result: " + result);
		
	}
}
