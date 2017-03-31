package it.simonecasamassa.projectEuler.probl3;

import java.util.List;

import it.simonecasamassa.projectEuler.FirstNPrimeNumber;

public class Solution_3 {

	private final long INITIAL_NUMBER = 600851475143l;

	public static void main(String[] args) {
		new Solution_3().printSolution();
	}

	public void printSolution() {
		long solution = 0;
		long temp = INITIAL_NUMBER;
		boolean cycle = true;

		temp = reduce(temp);

		
		while (cycle) {
			if (INITIAL_NUMBER % temp == 0) {
				if (isPrime(temp)) {
					solution = temp;
					cycle = false;
				}
			}
			temp--;
			System.out.println(temp);
		}

		System.out.println("Fattore maggiore nume. primo: " + solution);
	}

	private boolean isPrime(long val) {
		boolean result = true;
		for (long i = 2; i < val; i++) {
			System.out.println("INTERNAL " + i);
			if (val % i == 0) {
				result = false;
			}
		}

		return result;
	}

	private long reduce(long val){
		boolean reduce = true;
		List<Long> primeNumbers = FirstNPrimeNumber.getFirstNPrimeNumber(5000);
		
		while(reduce){
			int numDivision=0;
			for(int i=0; i< primeNumbers.size() && numDivision==0; i++){
				if(val%primeNumbers.get(i)==0 && val!=primeNumbers.get(i)) {
					val= val/primeNumbers.get(i);
					numDivision++;
				}
			}
			
			if (numDivision==0){
				reduce=false;
			}  
		}
		System.out.println(val);
		return val;
	}
}
