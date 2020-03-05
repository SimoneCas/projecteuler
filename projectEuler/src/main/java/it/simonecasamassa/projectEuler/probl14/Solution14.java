package it.simonecasamassa.projectEuler.probl14;

public class Solution14 {
	
	public static void main(String[] args) {
		Solution14 resolver = new Solution14();
		Integer result = resolver.findStartNumberOfCollatzSequenceFrom(1000000);
		System.out.println(result);
	}
	
	public Integer findStartNumberOfCollatzSequenceFrom(Integer startPoint) {
		boolean foundSolution = false;
		long now = System.currentTimeMillis();
		Integer result = 0;
		int longest = 0;
		for (int i=startPoint; i>=1; i--) {
			System.out.println("Iteration " + i);
			Integer actualValue = i;
			int operands = 1;
			do{
				operands++;
				if (actualValue % 2 == 0 && actualValue > 0) {
					//pair branch
					actualValue = actualValue / 2;
				} else if (actualValue > 0){
					//odd branch
					actualValue = (3*actualValue) + 1;
				} else {
					foundSolution = true;
					operands = 0;
				}
				//System.out.println("actualValue: "+ actualValue);
				if(actualValue == 1){
					foundSolution = true;
				}
			} while (!foundSolution);
			System.out.println("Operands " + operands);
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