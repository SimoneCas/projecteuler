package it.simonecasamassa.projectEuler.probl16;

import java.math.BigInteger;

public class Solution16 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Integer exponent = 1000;
		BigInteger firstResult = new BigInteger("2").pow(exponent);
		System.out.println("Risultato potenza: " + firstResult);
		
		String stringResult = firstResult.toString();
		char[] charArrayResult = stringResult.toCharArray();
		
		BigInteger finalResult = BigInteger.ZERO;
		
		for(char character: charArrayResult) {
			finalResult = finalResult.add(new BigInteger(String.valueOf(character)));
		}
		System.out.println("Time elapsed " + (System.currentTimeMillis() - start) + " ms" );
		System.out.println("Risultato finale: " + finalResult);
	}
}
