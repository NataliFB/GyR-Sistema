package main;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

public class Conexion_A {

    public static Connection getConnection() {
        Connection con = null;

        try {
            SQLServerDataSource sqlds = new SQLServerDataSource();
            sqlds.setUser("sa");
            sqlds.setPassword("123");
            sqlds.setServerName("localhost");
            sqlds.setPortNumber(1433);
            sqlds.setDatabaseName("pruebas");
            con = sqlds.getConnection();
            
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return con;
        }
    }
}
