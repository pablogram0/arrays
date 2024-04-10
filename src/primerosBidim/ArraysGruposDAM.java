package primerosBidim;

public class ArraysGruposDAM {

	public static void main(String[] args) {
		
		int grupos[][]= {{30,21},{27,17},{25,24},{21,26},{19,30},{16,30}};
		String modulo[]= {"Sistemas Informáticos","Base de Datos","Programacion","Lenguaje de Marcas","Entornos de Desarrollo",
				"Formación y Orientación Laboral"};
		
		for(int i =0;i<modulo.length;i++) {
			System.out.print(modulo[i]);
			System.out.print(" "+grupos[i][0]);
			System.out.print(" "+grupos[i][1]);
			System.out.println("");
		}
	}

}
