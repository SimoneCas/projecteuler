package it.simonecasamassa.projectEuler;

import java.util.ArrayList;
import java.util.List;

public class FirstNPrimeNumber {

	
	public static List<Long> getFirstNPrimeNumber(int n){
		List<Long> primeNumbers = new ArrayList<Long>();
		int find=0;
		int i=2;
		
		while(find<n){
			
			boolean isPrime=true;
			for(int j=2; j<i; j++){
				if(i%j==0){
					isPrime=false;
				}
			}
			
			if(isPrime){
				primeNumbers.add(new Long(i));
				find++;
			}
			i++;
		}
		
		return primeNumbers;
		
	}
}
