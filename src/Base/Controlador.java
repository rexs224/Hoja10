package Base;
import java.util.ArrayList;
import java.util.Scanner;
import Modelo.Mazmorra;
import Modelo.Monstruo;
import Usuario.Transformar;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Mazmorra miMazmorra=new Mazmorra();
			Monstruo miMonstruo=new Monstruo();
			int validacion=0;
			String confirmar;
			String t1t2 = null;
			ArrayList<String> querys;
			Scanner lector=new Scanner(System.in);
			
			do {
				System.out.println("1)Mazmorra");
				System.out.println("2)Monstruo");
				validacion=lector.nextInt();
				lector.nextLine();
				
				if(validacion==1) {
					querys=Transformar.transformarMazmorra(miMazmorra);
					if(querys.size()>1) {
						if(querys.get(1).contains("insert")){
							System.out.println("¿Quiere meter algun monstruo en la nueva mazmorra?");
							confirmar=lector.nextLine();
							if(confirmar.equals("si")) {
								System.out.println("Introduzca el id del monstruo a enlazar.");
								BD.allMonstruo();
								validacion=lector.nextInt();
								lector.nextLine();
								t1t2="insert into mazmorra_has_monstruo (idMazmorra,idMonstruo) values ('"+(BD.maxMazmorra()+1)+"','"+validacion+"')";
								BD.conexMazmorra(querys);
								BD.relacionTablas(t1t2);
							}else {
								BD.conexMazmorra(querys);
							}
						}else {
							BD.conexMazmorra(querys);
						}
					}else{
					BD.conexMazmorra(querys);
					}
				}else if(validacion==2) {
					querys=Transformar.transformarMonstruo(miMonstruo);
					if(querys.size()>1) {
						if(querys.get(1).contains("insert")){
							System.out.println("Introduzca el id de la mazmorra a enlazar.");
							BD.allMazmorra();
							validacion=lector.nextInt();
							lector.nextLine();
							t1t2="insert into mazmorra_has_monstruo (idMazmorra,idMonstruo) values ('"+validacion+"','"+(BD.maxMonstruo()+1)+"')";
							BD.conexMonstruo(querys);
							BD.relacionTablas(t1t2);
						}else {
							BD.conexMonstruo(querys);
						}
					}else{
					BD.conexMonstruo(querys);
					}
				}
				System.out.println("¿Quiere continuar?");
				confirmar=lector.nextLine();
				confirmar=confirmar.toLowerCase();
			}while(confirmar.equals("si"));
			lector.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
