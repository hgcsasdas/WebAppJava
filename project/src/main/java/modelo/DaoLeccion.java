package modelo;

// import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoLeccion {

/*
	private Connection con = null;
	public static DaoLeccion instance = null;

	public DaoLeccion() throws SQLException {
		
		
		con = BD.getConnection();
		
	}
	
	
	//Singleton
	public static DaoLeccion getInstance() throws SQLException {
		if(instance == null) {
			instance = new DaoLeccion();
		}
		return instance;
		
	}
	
	
	public  void insertar(Leccion  s) throws SQLException {
		
						
		PreparedStatement ps =  con.prepareStatement("INSERT INTO sim (nombre,edad,categoria) VALUES (?,?,?)");	
		
		ps.setString(1,s.getNombre());
		ps.setInt(2,s.getEdad() );
		ps.setInt(3,s.getCategoria());
		
		int num =  ps.executeUpdate();
		
		ps.close();
		
	}
	public  void update(Leccion  s) {
		
		
		
	}
	public ArrayList<Sim> listar() throws SQLException {
		
		PreparedStatement ps = con.prepareStatement("SELECT * from sim");
		ResultSet rs = ps.executeQuery();
		ArrayList<Sim> result = null;
		while (rs.next()) {
			if (result == null)
				result = new ArrayList<>();
		result.add(new Sim(rs.getInt("id"), rs.getString("nombre"), rs.getInt("edad"),
					rs.getInt("categoria")));
		}
		rs.close();
		ps.close();
		return result;
	}
	
	public ArrayList<Sim> listar(String filtro) throws SQLException {
					
		PreparedStatement ps = con.prepareStatement("SELECT * from sim WHERE nombre= ?");
		ps.setString(1, filtro);
		ResultSet rs = ps.executeQuery();
		ArrayList<Sim> result = null;
		while (rs.next()) {
			if (result == null)
				result = new ArrayList<>();
		result.add(new Sim(rs.getInt("id"), rs.getString("nombre"), rs.getInt("edad"),
					rs.getInt("categoria")));
		}
		rs.close();
		ps.close();
		return result;
	}
	
	public String listarEnJson(String res) throws SQLException {
		
		Gson gson = new Gson();
		String JSON;
			if(res.equals("0")) {
				JSON = gson.toJson(this.listar());
			}else {
				JSON = gson.toJson(this.listar(res));
			}
			return JSON; 			
	}
	*/

}
