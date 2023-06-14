package Usuario;

import java.util.Scanner;

import Modelo.Mazmorra;

public class DatosMazmorra {

	public static Mazmorra crearMazmorra(int id) {
		String nombre="";
		try {
			Scanner lector= new Scanner(System.in);
			
			System.out.println("Introduzca el nombre de la mazmorra.");
			nombre=lector.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return new Mazmorra(id, nombre);
	}
}
