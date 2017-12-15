package it.simonecasamassa.projectEuler.probl7;

import java.util.List;

import it.simonecasamassa.projectEuler.FirstNPrimeNumber;

public class Solution_7 {

	public static void main(String[] args) {
		new Solution_7().findSolution();
	}

	private void findSolution() {
		Long result;
		int iteration = 10001;

		List<Long> primeNumbers = FirstNPrimeNumber.getFirstNPrimeNumber(iteration);
		result = primeNumbers.get(primeNumbers.size() - 1);

		System.out.println(result);

	}
}
