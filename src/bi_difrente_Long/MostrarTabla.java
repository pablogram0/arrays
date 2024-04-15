package bi_difrente_Long;

import javax.swing.JOptionPane;

public class MostrarTabla {

	//Comentario GitHub.
	private static int Tabla[][] = {{23,45,11,2},{67,2},{1,2,3,4,5,6}};
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,
				 verTabla() ,
				"Mensaje",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static String verTabla () {
		String tabla=" ";
		for(int posFila = 0; posFila<Tabla.length; posFila++) {
			tabla= tabla + "Los elementos de la fila  " + (posFila+1) + "\n";
			
			for(int posColum=0; posColum<Tabla[posFila].length;posColum++) {
				tabla = tabla +"Columna " + (posColum+1) + " valor " + Tabla[posFila][posColum] + "\n";
			}
		}
		return tabla;
	}

}
