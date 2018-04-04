package it.simonecasamassa.projectEuler.probl9;

import java.util.List;

import it.simonecasamassa.projectEuler.PythagoreanTripletGenerator;

public class Solution_9 {

	private final int MAX_C_VALUE = 200000;
	
	public static void main(String[] args) {
		new Solution_9().findSolution();
	}

	private void findSolution() {
		long startTime = System.currentTimeMillis();
		PythagoreanTripletGenerator calculator = new PythagoreanTripletGenerator(MAX_C_VALUE);
		List<int[]> triplets = calculator.getPythagoreanTriplets();
		
		for(int[] tupla: triplets){
			System.out.println(tupla[0] + " -" + tupla[1] + " -" + tupla[2] + " -" + (tupla[0] + tupla[1] + tupla[2]));
			if(tupla[0] + tupla[1] + tupla[2] == 1000){
				System.out.println("Exactly one Pythagorean triplet for which a + b + c = 1000: a="+tupla[0]+" - b="+tupla[1]+" - c="+tupla[2]);
				break;
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("ELAPSED TIME: "+(endTime-startTime)+"ms");
	}
}
