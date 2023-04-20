package modelo;

import config.Conexion;
import java.sql.*;

public class LoginAccess {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public static String nombre = "";
    
    public String acceso(String nombre, String password) {
        String sql = "SELECT nombre FROM vendedores WHERE nombre = '" + nombre + "' AND password = '" + password + "'";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                LoginAccess.nombre = rs.getString(1);
                return "encontrado";
            } else {
                return "no encontrado";
            }
        } catch (Exception e) {
            System.out.println("ERROR EN LA CONSULTA ACCESO " + e);
        }
        return null;
    }


}
