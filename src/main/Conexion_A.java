
package main;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

/**
 * Conexion_A es una clase para hacer conexión a la base de datos
 *
 * @author 
 */
public class Conexion_A {

    /**
     * Metodo para hacer conexión a la base de datos
     *
     * @return Devuelve la conexión de la base de datos
     */
    public static Connection getConnection() {
        Connection con = null;

        try {
            SQLServerDataSource sqlds = new SQLServerDataSource();
            sqlds.setUser("sa");
            sqlds.setPassword("123");
            sqlds.setServerName("localhost");
            sqlds.setPortNumber(1433);
            sqlds.setDatabaseName("BD_Sistema");
            con = sqlds.getConnection();

            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return con;
        }
    }
}
