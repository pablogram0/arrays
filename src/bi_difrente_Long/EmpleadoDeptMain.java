package bi_difrente_Long;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EmpleadoDeptMain {
	static String arrDept []= {"Informática,Compras,Ventas,Contabilidad,Recursos Humanos"};
	static Empleado EmpleadosDept [][] = new Empleado[arrDept.length][];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String opc= "";
		
		do {
			
			opc = usuarioElige();
			
			switch (opc) {
			case "ALTA":
					alta();
				break;
			case "Listado Empleados Departamento":
					
				break;
			case "Listar Todos":
					
				break;
				
			default:
				break;
			}
			
		}while(!opc.equals("SALIR"));

	}
	private static String usuarioElige() {
		String opc;
		String[] opciones = {"ALTA","Listado Empleados Departamento","Listar Todos","SALIR"};
		opc = (String) JOptionPane.showInputDialog(null, // parentComponent
				"Elige una opcion:", // Texto del mensaje
				"Agenda", // Título
				JOptionPane.QUESTION_MESSAGE, // Icono
				null, // Parámetro no utilizado
				opciones, // Vector de valores
				opciones[0]); // Valor a mostrar por defecto
		return opc;
	}
	private static void alta() {
		String dept;
		String numEmp;
		
		dept = (String) JOptionPane.showInputDialog(null, // parentComponent
				"Elige una opcion:", // Texto del mensaje
				"Agenda", // Título
				JOptionPane.QUESTION_MESSAGE, // Icono
				null, // Parámetro no utilizado
				arrDept, // Vector de valores
				arrDept[0]); // Valor a mostrar por defecto
		
		numEmp = JOptionPane.showInputDialog(null, // parentComponent
				"Introduzca el numero de empleados", // Texto del mensaje
				"Entrada", // Título
				JOptionPane.QUESTION_MESSAGE); // Icono
		
		
		boolean encontrado=false;
		int i = 0;
		
		for(i =0; i<arrDept.length && !encontrado;i++) {
			if(arrDept[i].equals(dept)) {
				encontrado=true;
			}
		}
		
		EmpleadosDept [i-1]= new Empleado[Integer.parseInt(numEmp)];
		
		String nombre;
		String sueldo;
		for(int j=0; j<EmpleadosDept[i].length; j++) {
			nombre = JOptionPane.showInputDialog(null, // parentComponent
					"Introduzca el nombre", // Texto del mensaje
					"Entrada", // Título
					JOptionPane.QUESTION_MESSAGE); // Icono
			sueldo = JOptionPane.showInputDialog(null, // parentComponent
					"Introduzca el sueldo", // Texto del mensaje
					"Entrada", // Título
					JOptionPane.QUESTION_MESSAGE); // Icono
			
			Empleado empl = new Empleado(nombre,Integer.parseInt(sueldo));
			EmpleadosDept[i-1][j]= empl;
		}
	
	}
	private static void listarTodos() {
		
		JOptionPane.showMessageDialog(null,
				 verLista(),//Hacerlo con if != null para que no de error
				"Mostrar",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static String verLista() {
		String lista= "";
		String dept;
		dept = (String) JOptionPane.showInputDialog(null, // parentComponent
				"Elige una opcion:", // Texto del mensaje
				"Agenda", // Título
				JOptionPane.QUESTION_MESSAGE, // Icono
				null, // Parámetro no utilizado
				arrDept, // Vector de valores
				arrDept[0]); // Valor a mostrar por defecto
	}
}
