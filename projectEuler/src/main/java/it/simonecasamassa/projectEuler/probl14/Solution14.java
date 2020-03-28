package it.simonecasamassa.projectEuler.probl14;

import java.math.BigInteger;

public class Solution14 {
	
	public static void main(String[] args) {
		Solution14 resolver = new Solution14();
		Integer result = resolver.findStartNumberOfCollatzSequenceFrom(BigInteger.valueOf(999999));
		System.out.println(result);
	}
	
	public Integer findStartNumberOfCollatzSequenceFrom(BigInteger startPoint) {
		boolean foundSolution = false;
		long now = System.currentTimeMillis();
		Integer result = 0;
		int longest = 0;
		for (int i=startPoint.intValue(); i>=1; i--) {
			//System.out.println("Iteration " + i);
			BigInteger actualValue = BigInteger.valueOf(i);
			int operands = 1;
			do{
				operands++;
				if (actualValue.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO) && actualValue.compareTo(BigInteger.ZERO) == 1) {
					//pair branch
					actualValue = actualValue.divide(BigInteger.valueOf(2));
				} else if (actualValue.compareTo(BigInteger.ZERO) == 1){
					//odd branch
					actualValue = (actualValue.multiply(BigInteger.valueOf(3))).add(BigInteger.ONE);
				} else {
					foundSolution = true;
					operands = 0;
				}
				//System.out.println("actualValue: "+ actualValue);
				if(actualValue.equals(BigInteger.ONE)){
					foundSolution = true;
				}
			} while (!foundSolution);
			System.out.println("Initial number " + i + " Operands " + operands);
			if (operands > longest) {
				longest = operands;
				result = i;
			}
			foundSolution = false;
		}
		
		long finish = System.currentTimeMillis();
		System.out.println("Time elapsed in milliseconds: " + (finish - now));
		System.out.println("Longest: " + longest);
		return result;
	}
	
}