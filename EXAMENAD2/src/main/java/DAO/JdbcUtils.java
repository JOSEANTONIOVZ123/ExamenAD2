package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    public static Connection con;

    static {
        String url="jdbc:mysql://localhost:3306/Peliculas";
        String user="root";
        //Almacena la contraseña guardada en la variable de entorno especificada
        String pass=System.getenv("MYSQL_ROOT_PASSWORD");
        try {
            //Guarda la conexion en la variable
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConn()  {
        return con;
    }
}
