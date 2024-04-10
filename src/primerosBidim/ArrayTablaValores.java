package primerosBidim;

public class ArrayTablaValores {

	public static void main(String[] args) {
		
		int tablaValores [][]= {{23,45,11,2},{67,2},{1,2,3,4,5,6}};
		
		for(int posFila =0;posFila<tablaValores.length;posFila++) {
			System.out.println("Los elementos de la fila " + (posFila +1)+ " son:");
			for(int posColum=0;posColum<tablaValores[posFila].length;posColum++) {
				System.out.println("Columna " + (posColum+1)+ " valor " + tablaValores[posFila][posColum]);
			}
			System.out.println(" ");
		}
	}

}
