package pracArrayBid;

import java.util.Scanner;

public class NotasAlumnos {
	
	/*
	 * Un Array de 5 alumnos con notas de 3 modulos introducidos por el usuario, se mostrara el ultimo 10 de cada alumno y su posicion 
	 * si no tiene ningun 10 se mostrará que no tien ningun 10
	 */

	public static void main(String[] args) {
		
		int posicionEncontrado=0;
		Scanner sc = new Scanner(System.in);
		float nota;
		float notas[][]=new float[5][3];
		
		for(int posFila=0;posFila<notas.length;posFila++) {
			System.out.println();
			System.out.println("------Notas alumno num: " + (posFila+1)+"------");
			for(int posColum = 0;posColum<notas[posFila].length;posColum++) {
					System.out.println("Introduce la nota del modulo: " + (posColum+1));
					nota=sc.nextFloat();
					notas[posFila][posColum]=nota;
			}		
		}
		for(int posFila=0;posFila<notas.length;posFila++) {
			boolean encontrado = false;
			for(int posColum = 0;posColum<notas[posFila].length;posColum++) {
					if(notas[posFila][posColum]==10) {
						encontrado=true;
						posicionEncontrado=posColum+1;
					}
			}
			if(encontrado) {
				System.out.println("El alumno "+ (posFila+1) + " Tiene un 10 en el modulo " + posicionEncontrado);
				System.out.println();
			}else {
				System.out.println("Este alumno no tiene ningun diez");
				System.out.println();
			}
			
		}
		sc.close();
		
	}
}


