package Usuario;

import java.util.Scanner;

import Modelo.Monstruo;

public class DatosMonstruo {

	public static String pedirNombre() {
		Scanner lector=new Scanner(System.in);
		String resultado = null;
		try {
			System.out.println("Introduzca el nombre del monstruo.");
			resultado=lector.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public static String pedirTipo() {
		Scanner lector=new Scanner(System.in);
		String resultado = null;
		try {
			System.out.println("Introduzca el tipo.");
			resultado=lector.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public static int pedirHP() {
		Scanner lector=new Scanner(System.in);
		int resultado = 0;
		try {
			System.out.println("Introduzca la vida.");
			resultado=lector.nextInt();
			lector.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	public static int pedirATQ() {
		Scanner lector=new Scanner(System.in);
		int resultado = 0;
		try {
			System.out.println("Introduzca el ataque.");
			resultado=lector.nextInt();
			lector.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	public static int pedirDEF() {
		Scanner lector=new Scanner(System.in);
		int resultado = 0;
		try {
			System.out.println("Introduzca la defensa.");
			resultado=lector.nextInt();
			lector.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	public static Monstruo crearMonstruo(int id) {
		return new Monstruo(id, pedirNombre(), pedirTipo(), pedirHP(), pedirATQ(), pedirDEF());
	}
}
