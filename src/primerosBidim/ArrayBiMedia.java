package primerosBidim;

import java.util.Scanner;

public class ArrayBiMedia {

	public static void main(String[] args) {
		/**
		 * Esta clase crea una array 5x5 rellenada por el usuario y calculara la media de cada fila
		 */
		
		
		float introducirNumeros [][]= new float [5][5];
		Scanner sc = new Scanner(System.in);
		
		for(int posFila=0;posFila<introducirNumeros.length;posFila++) {
			System.out.println("Introduzca los numeros de la fila "+ (posFila+1));
			for(int posColum = 0;posColum<introducirNumeros[posFila].length;posColum++) {
				System.out.println((posColum+1) + " Valor");
				introducirNumeros[posFila][posColum]=sc.nextFloat();
			}
		}
		
		for(int posFila =0;posFila<introducirNumeros.length;posFila++) {
			
			float suma=0;
			
			for(int posColum=0;posColum<introducirNumeros[posFila].length;posColum++) {
				suma+=introducirNumeros[posFila][posColum];
			}
			
			//Calculamos la media de la fila
			suma=suma/introducirNumeros[posFila].length;
			System.out.println("Media de la fila "+ (posFila+1) + " es de: "+suma);
		}

		sc.close();
	}

}
