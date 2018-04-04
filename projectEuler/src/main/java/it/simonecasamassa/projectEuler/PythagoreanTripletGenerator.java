package it.simonecasamassa.projectEuler;

import java.util.ArrayList;
import java.util.List;

public class PythagoreanTripletGenerator {

	private int maxResultValue;
	/*
	 * Array element of result: array[0]=a; array[1]=b; array[2]=c
	 */
	private List<int[]> result = new ArrayList<>();
	
	public PythagoreanTripletGenerator(int maxResultValue){
		this.maxResultValue = maxResultValue;
	}
	
	public List<int[]>  getPythagoreanTriplets(){
		for(int c=2; c<=maxResultValue; c++){
			//evaluate if C is pow of 2 
			if(Math.sqrt(c) % 1 == 0){
				int cBase = (int) Math.sqrt(c)-1;
				int tmp = (int) (Math.sqrt((c-Math.pow(cBase-1, 2))));
				System.out.println("tmp"+tmp+"c"+c);
				for(int a= tmp; a<((cBase+1)/2); a++){
				//for(int a= 1; a<c; a++){
					for(int b=a+1; b<cBase; b++){
						if(Math.pow(a, 2)+Math.pow(b, 2) == c){
							int[] triplet = new int[3];
							triplet[0] = a;
							triplet[1] = b;
							triplet[2] = (int) Math.sqrt(c);
							System.out.println(c);
							result.add(triplet);
						}
					}
				}				
			}
		}
		
		return result;
	}	
	
}
