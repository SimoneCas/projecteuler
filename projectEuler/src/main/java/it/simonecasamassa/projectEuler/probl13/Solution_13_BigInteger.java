package it.simonecasamassa.projectEuler.probl13;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution_13_BigInteger {

	public String findSolution(String[] operandi, int numCharacters) {
		
		BigInteger reduceResult = Arrays.stream(operandi).map(line -> new BigInteger(line)).reduce(BigInteger.ZERO, (subTotal, element) -> subTotal.add(element));
		//.forEach(numLine -> result = result.add(numLine));
		
		int lastIndex = reduceResult.toString().length() <= numCharacters ? reduceResult.toString().length() - 1 : numCharacters; 
		String result = reduceResult.toString().substring(0, lastIndex);
		return result;
	}
}
