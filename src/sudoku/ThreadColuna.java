package sudoku;

public class ThreadColuna extends Thread{

	@Override
	public void run() {
		
		int vetColunas[] = new int[9];
		int[] vetGabarito = {1,2,3,4,5,6,7,8,9};
		int cont = 0;
		int j = 0;
		int x = 0;
		int y = 0;
		int aux = 0;
		
		
//			Coluna 1
		
			for (j = 0; j < 9; j++) { // coluna
				vetColunas[cont] = sudoku.Sudoku.matrizsudoku[j][0];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetColunas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na coluna 1");
				}
				aux = 0;
			}
					
//			Coluna 2
			cont = 0;
			for (j = 0; j < 9; j++) { // coluna
				vetColunas[cont] = sudoku.Sudoku.matrizsudoku[j][1];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetColunas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na coluna 2");
				}
				aux = 0;
			}

//			Coluna 3
			cont = 0;
			for (j = 0; j < 9; j++) { // coluna
				vetColunas[cont] = sudoku.Sudoku.matrizsudoku[j][2];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetColunas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na coluna 3");
				}
				aux = 0;
			}

//			Coluna 4
			cont = 0;
			for (j = 0; j < 9; j++) { // coluna
				vetColunas[cont] = sudoku.Sudoku.matrizsudoku[j][3];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetColunas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na coluna 4");
				}
				aux = 0;
			}
			
//			Coluna 5
			cont = 0;
			for (j = 0; j < 9; j++) { // coluna
				vetColunas[cont] = sudoku.Sudoku.matrizsudoku[j][4];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetColunas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na coluna 5");
				}
				aux = 0;
			}		
			
//			Coluna 6
			cont = 0;
			for (j = 0; j < 9; j++) { // coluna
				vetColunas[cont] = sudoku.Sudoku.matrizsudoku[j][5];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetColunas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na coluna 6");
				}
				aux = 0;
			}			
			
//			Coluna 7
			cont = 0;
			for (j = 0; j < 9; j++) { // coluna
				vetColunas[cont] = sudoku.Sudoku.matrizsudoku[j][6];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetColunas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na coluna 7");
				}
				aux = 0;
			}			
			
//			Coluna 8
			cont = 0;
			for (j = 0; j < 9; j++) { // coluna
				vetColunas[cont] = sudoku.Sudoku.matrizsudoku[j][7];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetColunas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na coluna 8");
				}
				aux = 0;
			}		

//			Coluna 9
			cont = 0;
			for (j = 0; j < 9; j++) { // coluna
				vetColunas[cont] = sudoku.Sudoku.matrizsudoku[j][8];
				cont++;
			}
			
			for (x = 0; x < 9; x++) {
				for(y = 0; y < cont; y++) {
					if(vetColunas[y] == vetGabarito[x]) {
						aux++;
					}
				}
				if(aux > 1) {
					System.out.println("erro na coluna 9");
				}
				aux = 0;
			}
			
	}
}
