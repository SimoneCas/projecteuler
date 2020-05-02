package it.simonecasamassa.projectEuler.probl15;

import java.math.BigInteger;

public class Solution15 {

	private BigInteger routes = BigInteger.ZERO;
	private static final int TARGET_ROWS = 20;
	private static final int TARGET_COLUMNS = 20;
	
	public static void main(String[] args) {
		Solution15 processor = new Solution15();
		long start = System.currentTimeMillis();
		System.out.print("N° Routes: " + processor.calculateRoutes(0, 0));
		System.out.println("Time elapsed " + (System.currentTimeMillis() - start) + " ms" );
	}
	
	public BigInteger calculateRoutes(int x, int y) {
		if(x == TARGET_ROWS && y == TARGET_COLUMNS ) {
			routes = routes.add(BigInteger.ONE);
		} else {
			if(x < TARGET_ROWS){ 
				this.calculateRoutes(x+1, y);
			}
			if(y < TARGET_COLUMNS) {
				this.calculateRoutes(x, y+1);
			}
		}
		
		return routes;
	}
}
