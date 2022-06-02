package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class BD {



    public static final String JDBC_URL = "jdbc:mysql://localhost:3360/bestiario";
    public static Connection instance = null;

    private BD() {
    }

    public static Connection getConnection() throws SQLException {

        if (instance == null) {
            Properties props = new Properties();
            props.put("user", "root");
            props.put("password", "1234");


            instance = DriverManager.getConnection(JDBC_URL, props);

        }
        return instance;
    }



}
