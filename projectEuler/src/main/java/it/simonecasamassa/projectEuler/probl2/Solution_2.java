package it.simonecasamassa.projectEuler.probl2;

public class Solution_2 {
	
	private final int UPPER_LIMIT = 4000000;
	
	public static void main(String[] args){
		new Solution_2().printSolution();
	}
	
	public void printSolution(){
		 int prec = 1;
		 int temp=1;
		 int solution=0;
		 for(int i=2; i<UPPER_LIMIT; i=i+prec){
			 prec=temp;
			 System.out.println("serie fibonacci "+i);
			 if(i%2==0){
				 solution += i;
			 }
			 temp=i;
				 
			 
		 }
		 
		 System.out.println("La somma della serie pari di fibonacci e': "+solution);
	}
}
