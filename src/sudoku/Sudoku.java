/*
 *Aluna: Keila  Emy Taniguchi
 *RA: 1890611
 * 
 * O código irá informar caso a matriz sudoku esteja errada, 
 * caso a matriz esteja correta o código não retornará nada.
 * 
 * Se Errada o código informará onde foi encontrado o erro.
 *
 **/

package sudoku;


public class Sudoku {
	
    final static int[][] matrizsudoku = { 
    		{ 2, 3, 7, 8, 4, 1, 5, 6, 9 }, 
    		{ 1, 8, 6, 7, 9, 5, 2, 4, 3 },
            { 5, 9, 4, 3, 2, 6, 7, 1, 8 }, 
            { 3, 1, 5, 6, 7, 4, 8, 9, 2 }, 
            { 4, 6, 9, 5, 8, 2, 1, 3, 7 },
            { 7, 2, 8, 1, 3, 9, 4, 5, 6 }, 
            { 6, 4, 2, 9, 1, 8, 3, 7, 5 }, 
            { 8, 5, 3, 4, 6, 7, 9, 2, 1 },
            { 9, 7, 1, 2, 5, 3, 6, 8, 4 } };
    
	public static void main(String args[]) {

		ThreadLinha t1 = new ThreadLinha();
		t1.start();
		
		ThreadColuna t2 = new ThreadColuna();
		t2.start();

		ThreadQuadrante1 t3 = new ThreadQuadrante1();
		t3.start();
		
		ThreadQuadrante2 t4 = new ThreadQuadrante2();
		t4.start();
		
		ThreadQuadrante3 t5 = new ThreadQuadrante3();
		t5.start();
		
		ThreadQuadrante4 t6 = new ThreadQuadrante4();
		t6.start();
		
		ThreadQuadrante5 t7 = new ThreadQuadrante5();
		t7.start();
		
		ThreadQuadrante6 t8 = new ThreadQuadrante6();
		t8.start();
		
		ThreadQuadrante7 t9 = new ThreadQuadrante7();
		t9.start();
		
		ThreadQuadrante8 t10 = new ThreadQuadrante8();
		t10.start();
		
		ThreadQuadrante9 t11 = new ThreadQuadrante9();
		t11.start();
	}
	

}
