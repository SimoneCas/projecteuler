package it.simonecasamassa.projectEuler;

public class SumOperator {

	public static int getSumNumbersBefore(int val){
		int sum=0;
		for (int i=1; i<=val; i++)
			sum+=i;
		
		return sum;
	}
}
