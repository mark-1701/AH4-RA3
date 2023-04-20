package modeloDAO;

import config.Conexion;
import interfaces.CRUDSucursal;
import java.sql.*;
import java.util.LinkedList;
import modelo.Sucursal;

public class SucursalDAO implements CRUDSucursal{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Sucursal s = new Sucursal();

    @Override
    public LinkedList<Sucursal> listar() {
        LinkedList<Sucursal> lista = new LinkedList<Sucursal>();
        String sql = "SELECT * FROM sucursales";
        try {
            //Inicializa la base de datos
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Sucursal suc = new Sucursal();
                suc.setCodigo(rs.getInt(1));
                suc.setNombre(rs.getString(2));
                suc.setDireccion(rs.getString(3));
                suc.setCorreo(rs.getString(4));
                suc.setTelefono(rs.getString(5));
                lista.add(suc);
            }
        } catch (Exception e) {
            System.out.println("ERROR LISTA SUCURSALES: " + e);
        }
        return lista;
    }
    
    @Override
    public void add(Sucursal sucursal) {
        String query = "INSERT INTO sucursales VALUES (0,?,?,?,?);";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, sucursal.getNombre());
            ps.setString(2, sucursal.getDireccion());
            ps.setString(3, sucursal.getCorreo());
            ps.setString(4, sucursal.getTelefono());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR AGREGAR SUCURSAL: " + e);
        }
    }
    
    @Override
    public Sucursal search(int codigo) {
        String sql = "SELECT * FROM sucursales WHERE codigo = " + codigo;
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                s.setCodigo(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setDireccion(rs.getString(3));
                s.setCorreo(rs.getString(4));
                s.setTelefono(rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println("ERROR BUSCAR SUCURSAL: " + e);
        }
        return s;  
    }
    
    @Override
    public void edit(Sucursal sucursal) {
        String query = "UPDATE sucursales SET nombre=?, direccion=?, correo=?, telefono=? WHERE codigo=?;";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, sucursal.getNombre());
            ps.setString(2, sucursal.getDireccion());
            ps.setString(3, sucursal.getCorreo());
            ps.setString(4, sucursal.getTelefono());
            ps.setInt(5, sucursal.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR AL MODIFICAR SUCURSAL: " + e);
        }
    }
     
    @Override
    public void delete(int codigo) {
        String sql = "DELETE from sucursales WHERE codigo=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }  
}
