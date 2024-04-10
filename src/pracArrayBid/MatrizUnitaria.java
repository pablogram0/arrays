package pracArrayBid;

import java.util.Scanner;

public class MatrizUnitaria {
	
/*
 * Crear una matriz unitaria(con una diagonal de 1) de la dimension que pida el usuario
 */
	
	public static void main(String[] args) {
		
		int volumen;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que volumen quiere la matriz");
		volumen=sc.nextInt();
		
		int unitaria[][]= new int [volumen][volumen];
		
		for(int posFila=0;posFila<unitaria.length;posFila++) {
			for(int posColum = 0;posColum<unitaria[posFila].length;posColum++) {
				if(posFila==posColum) {
					unitaria[posFila][posColum]=1;
				}
				
			}
		}
		
		for(int posFila=0;posFila<unitaria.length;posFila++) {
			System.out.println("");
			for(int posColum = 0;posColum<unitaria[posFila].length;posColum++) {
				System.out.print(unitaria[posFila][posColum] + " ");
			}
		}
		sc.close();
	}

}
