package config;

import java.sql.*;

public class Conexion {
    java.sql.Connection con;
    String url="jdbc:mysql://localhost:3306/cyborgs";
    String user="root";
    String pass="12345";
    public java.sql.Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.out.println("error: " + e);
        }      
        return con;   
    }
}
