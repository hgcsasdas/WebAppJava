package modelo;

import java.io.Console;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOCursos {


    private Connection con = null;
    public static DAOCursos instance = null;

    public DAOCursos() throws SQLException{
        con = BD.getConnection();
    }

    public static DAOCursos getInstance() throws SQLException{
        if (instance == null){
            instance = new DAOCursos();
        }
        return instance;
    }

    public void insertar(Curso c)  throws SQLException{

        PreparedStatement ps = con.prepareStatement("INSERT INTO modules (titulo, resumen,id_profesor, foto) VALUES (????)");
        ps.setString(1,c.getTitulo());
        ps.setString(2,c.getResumen());
        ps.setString(3,"1");
        ps.setString(4,c.getnFoto());

        System.out.println("He entrado " +  ps );
        ps.executeUpdate();
        ps.close();
    }
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
