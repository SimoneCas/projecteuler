package it.simonecasamassa.projectEuler.probl5;


/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 
 * to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the 
 * numbers from 1 to 20?
 */
public class Solution_5 {

	private final int DIVISIBLE_RANGE = 20;
	
	public static void main(String[] args) {
		new Solution_5().findSolution();

	}
	
	public void findSolution(){
		int solution=0;
		boolean finding_solution = true;
		int value=DIVISIBLE_RANGE-1;
		
		while(finding_solution){
			value++;
			for (int i=1; i<= DIVISIBLE_RANGE; i++){
				if(value%i==0){
					if(i==DIVISIBLE_RANGE){
						solution=value;
						finding_solution=false;
					}
				}else{
					break;
				}
			}
			
		}
			
		System.out.println("solution = "+solution);
	}

}
