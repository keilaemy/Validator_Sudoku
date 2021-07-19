package sudoku;

public class ThreadLinha extends Thread{

	@Override
	public void run() {

		int vetLinhas[] = new int[9];
		int[] vetGabarito = {1,2,3,4,5,6,7,8,9};
		int cont = 0;
		int j = 0;
		int x = 0;
		int y = 0;
		int aux = 0;
		
		
//			Linha 1
		
			for (j = 0; j < 9; j++) { // coluna
				vetLinhas[cont] = sudoku.Sudoku.matrizsudoku[0][j];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetLinhas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na linha 1");
				}
				aux = 0;
			}
					
//			Linha 2
			cont = 0;
			for (j = 0; j < 9; j++) { // coluna
				vetLinhas[cont] = sudoku.Sudoku.matrizsudoku[1][j];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetLinhas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na linha 2");
				}
				aux = 0;
			}				
		
//			Linha 3
			cont = 0;
			for (j = 0; j < 9; j++) { 
				vetLinhas[cont] = sudoku.Sudoku.matrizsudoku[2][j];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetLinhas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na linha 3");
				}
				aux = 0;
			}					
			
//			Linha 4
			cont = 0;
			for (j = 0; j < 9; j++) { 
				vetLinhas[cont] = sudoku.Sudoku.matrizsudoku[3][j];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetLinhas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na linha 4");
				}
				aux = 0;
			}			
			
//			Linha 5
			cont = 0;
			for (j = 0; j < 9; j++) { 
				vetLinhas[cont] = sudoku.Sudoku.matrizsudoku[4][j];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetLinhas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na linha 5");
				}
				aux = 0;
			}				
			
//			Linha 6
			cont = 0;
			for (j = 0; j < 9; j++) { 
				vetLinhas[cont] = sudoku.Sudoku.matrizsudoku[5][j];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetLinhas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na linha 6");
				}
				aux = 0;
			}				
			
//			Linha 7
			cont = 0;
			for (j = 0; j < 9; j++) { 
				vetLinhas[cont] = sudoku.Sudoku.matrizsudoku[6][j];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetLinhas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na linha 7");
				}
				aux = 0;
			}			
			
//			Linha 8
			cont = 0;
			for (j = 0; j < 9; j++) { 
				vetLinhas[cont] = sudoku.Sudoku.matrizsudoku[7][j];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetLinhas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na linha 8");
				}
				aux = 0;
			}				
			
//			Linha 9
			cont = 0;
			for (j = 0; j < 9; j++) { 
				vetLinhas[cont] = sudoku.Sudoku.matrizsudoku[8][j];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetLinhas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na linha 9");
				}
				aux = 0;
			}				
			
	}
}
