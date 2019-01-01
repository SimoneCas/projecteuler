package it.simonecasamassa.projectEuler.probl11;


public class Solution_11 {

	private static int X_LENGHT = 20;
	private static int Y_LENGHT = 20;
	private static int NUM_FACTORS = 4;
	
	private int[][] matrix = new int[20][];
	private long greatestProduct;
	
	public static void main(String[] args) {
		new Solution_11().findSolution();
	}

	private void findSolution() {
		initializeMatrix();
		findGreatestProduct();
	}

	private void findGreatestProduct() {
		long rightResult, diagonalResult, downResult, inverseDiagonalResult;
		for (int i=0; i<matrix.length; i++) {
			for(int j=0; j< matrix[i].length; j++) {
				rightResult = findRightResult(i, j);
				greatestProduct = rightResult > greatestProduct ? rightResult : greatestProduct;
				
				downResult = findDownResult(i, j);
				greatestProduct = downResult > greatestProduct ? downResult : greatestProduct;
				
				diagonalResult = findDiagonalResult(i, j);
				greatestProduct = diagonalResult > greatestProduct ? diagonalResult : greatestProduct;
				
				inverseDiagonalResult = findInverseDiagonalResult(i, j);
				greatestProduct = inverseDiagonalResult > greatestProduct ? inverseDiagonalResult : greatestProduct;
			}
		}
		System.out.println("Result: " + greatestProduct);
		
	}

	private long findInverseDiagonalResult(int i, int j) {
		try {
			long result = matrix[i][j]*matrix[i-1][j-1]*matrix[i-2][j-2]*matrix[i-3][j-3];
			return result;
		} catch (Exception e) {
			return 0;
		}
	}

	private long findDiagonalResult(int i, int j) {
		try {
			long result = matrix[i][j]*matrix[i-1][j+1]*matrix[i-2][j+2]*matrix[i-3][j+3];
			return result;
		} catch (Exception e) {
			return 0;
		}
	}

	private long findDownResult(int i, int j) {
		try {
			long result = matrix[i][j]*matrix[i+1][j]*matrix[i+2][j]*matrix[i+3][j];
			return result;
		} catch (Exception e) {
			return 0;
		}
	}

	private long findRightResult(int i, int j) {
		try {
			System.out.println("Parziale " + matrix[i][j] +"-"+ matrix[i][j+1] +"-"+ matrix[i][j+2] +"-"+ matrix[i][j+3]);
			long result = matrix[i][j]*matrix[i][j+1]*matrix[i][j+2]*matrix[i][j+3];
			return result;
		} catch (Exception e) {
			return 0;
		}
	}

	private void initializeMatrix() {
		int[] row1 = {8, 02, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8};
		matrix[0] = row1;
		int[] row2 = {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 04, 56, 62, 00};
		matrix[1] = row2;
		int[] row3 = {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 03, 49, 13, 36, 65};
		matrix[2] = row3;
		int[] row4 = {52, 70, 95, 23, 04, 60, 11, 42, 69, 24, 68, 56, 01, 32, 56, 71, 37, 02, 36, 91};
		matrix[3] = row4;
		int[] row5 = {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80};
		matrix[4] = row5;
		int[] row6 = {24, 47, 32, 60, 99, 03, 45, 02, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50};
		matrix[5] = row6;
		int[] row7 = {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70};
		matrix[6] = row7;
		int[] row8 = {67, 26, 20, 68, 02, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21};
		matrix[7] = row8;
		int[] row9 = {24, 55, 58, 05, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72};
		matrix[8] = row9;
		int[] row10 = {21, 36, 23, 9, 75, 00, 76, 44, 20, 45, 35, 14, 00, 61, 33, 97, 34, 31, 33, 95};
		matrix[9] = row10;
		int[] row11 = {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 04, 62, 16, 14, 9, 53, 56, 92};
		matrix[10] = row11;
		int[] row12 = {16, 39, 05, 42, 96, 35, 31, 47, 55, 58, 88, 24, 00, 17, 54, 24, 36, 29, 85, 57};
		matrix[11] = row12;
		int[] row13 = {86, 56, 00, 48, 35, 71, 89, 07, 05, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58};
		matrix[12] = row13;
		int[] row14 = {19, 80, 81, 68, 05, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 04, 89, 55, 40};
		matrix[13] = row14;
		int[] row15 = {04, 52, 8, 83, 97, 35, 99, 16, 07, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66};
		matrix[14] = row15;
		int[] row16 = {88, 36, 68, 87, 57, 62, 20, 72, 03, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69};
		matrix[15] = row16;
		int[] row17 = {04, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36};
		matrix[16] = row17;
		int[] row18 = {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 04, 36, 16};
		matrix[17] = row18;
		int[] row19 = {20, 73, 35, 29, 78, 31, 90, 01, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 05, 54};
		matrix[18] = row19;
		int[] row20 = {01, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 01, 89, 19, 67, 48};
		matrix[19] = row20;
	}
}
