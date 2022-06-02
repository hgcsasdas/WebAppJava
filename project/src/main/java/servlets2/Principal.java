package servlets2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws SQLException {

		String driver="com.mysql.jdbc.Driver";
		String dbName="prueba";
		String url="jdbc:mysql://localhost:3360/"+dbName;
		String username="root";
		String password="1234";
		Connection con=null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Conexion realizada.\n");
			//SELECT
			PreparedStatement stmt = con.prepareStatement("select * from autor");
			ResultSet rs = stmt.executeQuery(); //Execute query solo funciona con SELECT
			while(rs.next()) {
				System.out.println("id_autor: "+rs.getInt(1));
				System.out.println("nombre: "+rs.getString(2));
				System.out.println("apellidos: "+rs.getString(3));
				System.out.println("f_nacimiento: "+rs.getString(4));
				System.out.println("nacionalidad: "+rs.getString(5));
				System.out.println("anios: "+rs.getInt(6));
				System.out.println("\nPulse INTRO para continuar");
				sc.nextLine();
			}
			stmt.close();
			
			/*INSERT
			PreparedStatement stmt = con.prepareStatement("insert into autor(id_autor, nombre, apellidos, f_nacimiento, nacionalidad, anios) values (?, ?, ?, ?, ?, ?)"); //Parametrizaci�n
			stmt.setInt(1, 400);
			stmt.setString(2, "Alicia");
			stmt.setString(3, "Garc�a G�mez");
			stmt.setString(4, "2000-10-10");
			stmt.setString(5, "EEUU");
			stmt.setInt(6, 22);
			int filas = stmt.executeUpdate();
			System.out.println("Se han insertado "+filas+" filas.");
			stmt.close();
			*/
			/*DELETE
			PreparedStatement stmt = con.prepareStatement("delete from autor where id_autor = ?"); //Parametrizaci�n
			stmt.setInt(1, 400);
			int filas = stmt.executeUpdate();
			System.out.println("Se han eliminado "+filas+" filas.");
			stmt.close();
			 */
			/*UPDATE
			PreparedStatement stmt = con.prepareStatement("update autor set nombre = ? where id_autor = ?"); //Parametrizaci�n
			stmt.setString(1, "Pepito");
			stmt.setInt(2, 100);
			int filas = stmt.executeUpdate();
			System.out.println("Se han actualizado "+filas+" filas.");
			stmt.close();
			*/
		}catch(Exception e) {
			System.out.println("Excepcion: "+e.getMessage());
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		
	}

}
