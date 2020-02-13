package it.simonecasamassa.projectEuler.probl13;

import java.util.Arrays;

/*
 * Work in progress: Somma per colonna
 */
public class Solution_13 {
	
	private int iteration;
	
	public static void main(String[] args) {
		new Solution_13().findSolution(Dataset.OPERANDI, 50);
	}

	public String findSolution(String[] operandi, int numCharacters) {

		// TODO: Utilizzare i batchSize per velocizzare il calcolo
		//int batchSize = findMaxBatchSize();

		boolean exit = false;
		String result = "";
		long rest = 0l;
		
		for(int i=0; i<numCharacters; i++) {
			System.out.println("Iteration " + i);
			this.iteration = i;
			long partialSum = 0;
			char variab = operandi[0].charAt(operandi[0].length() - 1 - this.iteration);
			Long columnSum = Arrays.asList(operandi).stream()
					.map(stringValue -> stringValue.charAt(stringValue.length() - 1 - this.iteration))
					.map(charValue -> Long.valueOf(charValue))
					.reduce(0l, Long::sum);
			columnSum = columnSum + rest;
			result = columnSum.toString().substring(columnSum.toString().length()-1) + result;	
			rest = Long.valueOf(columnSum.toString().substring(0, columnSum.toString().length()-1));
		}
		result = rest + result;
		System.out.println("Risultato: " + result);
		return result;
	}

	private int findMaxBatchSize() {
		int batchSize = 1;
		String maxOperand = "9";
		do {
			int numeroDiIstanze = 100;
			long maxSommaParziale = numeroDiIstanze * (Long.valueOf(maxOperand));
			if (maxSommaParziale > 0) {
				System.out.println("prodotto " + maxSommaParziale);
				batchSize += 1;
				maxOperand = maxOperand + "9";
			} else {
				System.out.println("prodotto " + maxSommaParziale);
				break;
			}
		} while (batchSize < 50);
		return batchSize - 1;

	}
}
