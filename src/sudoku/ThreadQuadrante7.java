package sudoku;

public class ThreadQuadrante7 extends Thread {
	@Override
	public void run() {

		int vetQuad[] = new int[9];
		int[] vetGabarito = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i = 0;
		int j = 0;
		int cont = 0;
		int x = 0;
		int y = 0;
		int aux = 0;

		for (i = 6; i < 9; i++) {
			for (j = 0; j < 3; j++) {
				vetQuad[cont] = sudoku.Sudoku.matrizsudoku[i][j];
				cont++;
			}
		}

		for (x = 0; x < 9; x++) {
			for (y = 0; y < cont; y++) {
				if (vetQuad[y] == vetGabarito[x]) {
					aux++;
				}
			}
			if (aux > 1) {
				System.out.println("erro no quadrante 7");
			}
			aux = 0;
		}
	}
}