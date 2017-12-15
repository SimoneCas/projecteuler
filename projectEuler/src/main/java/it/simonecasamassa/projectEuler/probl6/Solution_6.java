package it.simonecasamassa.projectEuler.probl6;

import it.simonecasamassa.projectEuler.SumOperator;

/*
 * Find the difference between the sum of the squares of the first 100 natural numbers
 * and the square of the sum
 */
public class Solution_6 {

	private final int RANGE = 100;
	
	public static void main(String[] args){
			new Solution_6().findSolution();
	}
	
	public void findSolution(){
		int sumNumRange = SumOperator.getSumNumbersBefore(RANGE);
		int operatorA = (int) Math.pow(sumNumRange, 2);
		System.out.println("potenza della somma = "+operatorA);
		
		int operatorB = 0;
		for(int i=1; i<=RANGE; i++)
			operatorB += Math.pow(i, 2);
		System.out.println("somma delle potenze = "+ operatorB);
		
		int solution = operatorA - operatorB;
		System.out.println("Soluzione = "+solution);
		
	}
}
