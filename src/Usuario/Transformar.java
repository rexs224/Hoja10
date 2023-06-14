package Usuario;

import java.util.ArrayList;
import java.util.Scanner;

import Base.BD;
import Modelo.Mazmorra;
import Modelo.Monstruo;

public class Transformar {
	public static ArrayList<String> transformarMazmorra(Mazmorra miMazmorra) {
		Scanner lector = new Scanner(System.in);
		String sql = "";
		String select = "select * from mazmorra";
		int validacion;
		ArrayList<String> querys = new ArrayList<String>();

		System.out.println("1)Insertar una mazmorra.");
		System.out.println("2)Actualizar una mazmorra.");
		System.out.println("3)Eliminar una mazmorra.");
		System.out.println("4)Mostrar mazmorras.");
		try {
			validacion = lector.nextInt();
			lector.nextLine();
			switch (validacion) {
			case 1:
				miMazmorra=DatosMazmorra.crearMazmorra(0);
				sql = "insert into mazmorra (id, nombre)values (null, '"
						+ miMazmorra.getNombre() + "')";
				querys.add(select);
				querys.add(sql);
				break;

			case 2:
				System.out.println("Introduzca el id de la mazmorra a actualizar.");
				validacion = lector.nextInt();
				lector.nextLine();
				miMazmorra=DatosMazmorra.crearMazmorra(0);
				sql = "update mazmorra set nombre= '" + miMazmorra.getNombre() + "' where id= "+validacion;
				querys.add(select);
				querys.add(sql);
				break;
			case 3:
				System.out.println("Introduzca el id de la mazmorra a eliminar.");
				validacion = lector.nextInt();
				lector.nextLine();
				sql = "delete from mazmorra where id= '" + validacion + "'";
				querys.add(select);
				querys.add(sql);
				break;
			case 4:
				System.out.println("1)Mostrar por id");
				System.out.println("2)Mostrar las mazmorras que contengan un monstruo en especifico.");
				System.out.println("3)Mostrar todos");
				System.out.println("4)Mostrar cantidad de mazmorras.");
				System.out.println("5)Mostrar las mazmorras sin monstruos.");
				validacion=lector.nextInt();
				lector.nextLine();
				switch (validacion) {
				case 1:
					System.out.println("Introduzca el id de la mazmorra a mostrar(id=0 en caso de querer ver todas).");
					validacion = lector.nextInt();
					lector.nextLine();
					select = "select * from mazmorra where id= '" + validacion + "'";
					querys.add(select);
					break;
				case 2:
					System.out.println("Introduzca el id del monstruo.");
					BD.allMonstruo();
					validacion=lector.nextInt();
					lector.nextLine();
					select = "select * from mazmorra inner join mazmorra_has_monstruo on mazmorra.id=mazmorra_has_monstruo.idMazmorra where mazmorra_has_monstruo.idMonstruo="+validacion;
					querys.add(select);
					break;
				case 3:
					querys.add(select);
					break;
				case 4:
					System.out.println(BD.countMazmorra());
					querys.add(select);
					break;
				case 5:
					querys.add("select * from mazmorra left join mazmorra_has_monstruo on mazmorra.id = mazmorra_has_monstruo.idMazmorra where mazmorra_has_monstruo.idMazmorra is null");
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return querys;
	}
	public static ArrayList<String> transformarMonstruo(Monstruo miMonstruo) {
		Scanner lector = new Scanner(System.in);
		String sql = "";
		String select = "select * from monstruo";
		int validacion;
		ArrayList<String> querys = new ArrayList<String>();

		System.out.println("1)Insertar un monstruo.");
		System.out.println("2)Actualizar un monstruo.");
		System.out.println("3)Eliminar un monstruo.");
		System.out.println("4)Mostrar monstruos.");
		try {
			validacion = lector.nextInt();
			lector.nextLine();
			switch (validacion) {
			case 1:
				miMonstruo=DatosMonstruo.crearMonstruo(0);
				sql = "insert into monstruo (id, nombre, tipo, hp, atq, def)values (null, '"
						+ miMonstruo.getNombre() + "','" + miMonstruo.getTipo() + "','" 
						+ miMonstruo.getHp() + "','" + miMonstruo.getAtq() + "','"
						+ miMonstruo.getDef() + "')"; 
						
				querys.add(select);
				querys.add(sql);
				break;

			case 2:
				System.out.println("Introduzca el id del monstruo a actualizar.");
				validacion = lector.nextInt();
				miMonstruo=DatosMonstruo.crearMonstruo(0);
				lector.nextLine();
				sql = "update mazmorra set nombre= '" + miMonstruo.getNombre() + 
						"' where id= "+validacion;
				querys.add(select);
				querys.add(sql);
				break;
			case 3:
				System.out.println("Introduzca el id del monstruo a eliminar.");
				validacion = lector.nextInt();
				lector.nextLine();
				sql = "delete from monstruo where id= '" + validacion + "'";
				querys.add(select);
				querys.add(sql);
				break;
			case 4:
				System.out.println("1)Mostrar por id");
				System.out.println("2)Mostrar los monstruos que esten en una mazmorra en especifico.");
				System.out.println("3)Mostrar todos");
				System.out.println("4)Mostrar monstruo en mas mazmorras.");
				validacion=lector.nextInt();
				lector.nextLine();
				switch (validacion) {
				case 1:
					System.out.println("Introduzca el id del mosntruo a mostrar.");
					validacion = lector.nextInt();
					lector.nextLine();
					select = "select * from monstruo where id= '" + validacion + "'";
					querys.add(select);
					break;
				case 2:
					System.out.println("Introduzca el id del monstruo.");
					BD.allMazmorra();
					validacion=lector.nextInt();
					lector.nextLine();
					select = "select * from monstruo inner join mazmorra_has_monstruo on monstruo.id=mazmorra_has_monstruo.idMonstruo where mazmorra_has_monstruo.idMazmorra="+validacion;
					querys.add(select);
					break;
				case 3:
					querys.add(select);
					break;
				case 4:
					BD.MonstruoMayor();
					querys.add(select);
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return querys;
	}
}
