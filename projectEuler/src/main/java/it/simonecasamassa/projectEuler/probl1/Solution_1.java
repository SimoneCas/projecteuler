package it.simonecasamassa.projectEuler.probl1;

public class Solution_1 {

	private final int START = 0;
	private final int END = 1000;

	public static void main(String[] args) {
		new Solution_1().printSolution();
	}

	public void printSolution() {
		int somma = 0;

		for (int i = 0; i < this.END; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				somma += i;
		}

		System.out.println("La somma dei multipli di 3 e 5 tra " + START + " e " + END + " = " + somma);

	}
}
