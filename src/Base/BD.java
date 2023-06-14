package Base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BD {

	public static void conexMazmorra(ArrayList<String> querys){
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/dnd", "root", "");
			sentenciaSQL = conexion.createStatement();
			if(querys.size()>1) {
				resultado = sentenciaSQL.executeUpdate(querys.get(1));
				rs= sentenciaSQL.executeQuery(querys.get(0));
				while (rs.next()) {
					System.out.println("ID: "+rs.getString("id") + " ID: " + rs.getString("nombre"));
				}
			}else {
				rs= sentenciaSQL.executeQuery(querys.get(0));
				while (rs.next()) {
					System.out.println("ID: "+rs.getString("id") + " NOMBRE: " + rs.getString("nombre"));
				}
			}
			
			if (resultado >= 1) {
				System.out.println("Se ha insertado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public static int maxMonstruo(){
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs = null;
		int resultado=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/dnd", "root", "");
			
			sentenciaSQL = conexion.createStatement();
			rs= sentenciaSQL.executeQuery("select max(id) from monstruo");
			rs.next();
			resultado=rs.getInt(1);
			

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultado;
	}
	public static int maxMazmorra(){
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs = null;
		int resultado=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/dnd", "root", "");
			
			sentenciaSQL = conexion.createStatement();
			rs= sentenciaSQL.executeQuery("select max(id) from mazmorra");
			rs.next();
			resultado=rs.getInt(1);
			

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultado;
	}
	public static void conexMonstruo(ArrayList<String> querys){
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/dnd", "root", "");

			sentenciaSQL = conexion.createStatement();
			
			if(querys.size()>1) {
				resultado = sentenciaSQL.executeUpdate(querys.get(1));
				rs= sentenciaSQL.executeQuery(querys.get(0));
				while (rs.next()) {
					System.out.println("ID: "+rs.getString("id") + " NOMBRE: " + rs.getString("nombre")
							+ " TIPO: " + rs.getString("tipo") + " VIDA: " + rs.getString("hp") 
							+ " ATAQUE: " + rs.getString("atq") + " DEFENSA: " + rs.getString("def"));
				}
			}else {
				rs= sentenciaSQL.executeQuery(querys.get(0));
				while (rs.next()) {
					System.out.println("ID: "+rs.getString("id") + " NOMBRE: " + rs.getString("nombre")
					+ " TIPO: " + rs.getString("tipo") + " VIDA: " + rs.getString("hp") 
					+ " ATAQUE: " + rs.getString("atq") + " DEFENSA: " + rs.getString("def"));
				}
			}
			
			if (resultado >= 1) {
				System.out.println("Se ha insertado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public static void relacionTablas(String sql) {
		Connection conexion = null;
		Statement sentenciaSQL = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/dnd", "root", "");

			sentenciaSQL = conexion.createStatement();
			sentenciaSQL.executeUpdate(sql);

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void allMonstruo(){
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		String sql="select * from monstruo";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/dnd", "root", "");

			sentenciaSQL = conexion.createStatement();
			
			
			rs= sentenciaSQL.executeQuery(sql);
			while (rs.next()) {
				System.out.println("ID: "+rs.getString("id") + " NOMBRE: " + rs.getString("nombre")
				+ " TIPO: " + rs.getString("tipo") + " VIDA: " + rs.getString("hp") 
				+ " ATAQUE: " + rs.getString("atq") + " DEFENSA: " + rs.getString("def"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public static void allMazmorra(){
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		String sql="select * from mazmorra";
		int resultado=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/dnd", "root", "");
			sentenciaSQL = conexion.createStatement();
			
			rs= sentenciaSQL.executeQuery(sql);
			while (rs.next()) {
				System.out.println("ID: "+rs.getString("id") + " NOMBRE: " + rs.getString("nombre"));
			}
			
			
			

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public static int countMazmorra(){
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs = null;
		int resultado=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/dnd", "root", "");
			
			sentenciaSQL = conexion.createStatement();
			rs= sentenciaSQL.executeQuery("select count(*) from mazmorra");
			rs.next();
			resultado=rs.getInt(1);
			

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultado;
	}
	public static void MonstruoMayor(){
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/dnd", "root", "");

			sentenciaSQL = conexion.createStatement();
			
			rs= sentenciaSQL.executeQuery("select idMonstruo,count(idMonstruo) as cantidad from mazmorra_has_monstruo group by idMonstruo order by cantidad desc");
			while (rs.next()) {
				System.out.println("ID: "+rs.getString("idMonstruo") + " CANTIDAD: " + rs.getString("cantidad"));
			}
			
			
			if (resultado >= 1) {
				System.out.println("Se ha insertado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
}
	
