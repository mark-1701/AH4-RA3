package modeloDAO;

import config.Conexion;
import interfaces.CRUDVendedor;
import java.sql.*;
import java.util.LinkedList;
import modelo.Vendedor;

public class VendedorDAO implements CRUDVendedor{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Vendedor v = new Vendedor();
    
    @Override
    public LinkedList<Vendedor> listar() {
        LinkedList<Vendedor> lista = new LinkedList<Vendedor>();
        String sql = "SELECT * FROM vendedores";
        try {
            //Inicializa la base de datos
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vendedor ven = new Vendedor();
                ven.setCodigo(rs.getInt(1));
                ven.setNombre(rs.getString(2));
                ven.setCaja(rs.getInt(3));
                ven.setVentas(rs.getInt(4));
                ven.setGenero(rs.getString(5));
                ven.setPassword(rs.getString(6));
                lista.add(ven);
            }
        } catch (Exception e) {
            System.out.println("ERROR LISTA VENDEDORES: " + e);
        }
        return lista;
    }
    
    @Override
    public void add(Vendedor vendedor) {
        String query = "INSERT INTO vendedores VALUES (0,?,?,?,?,?);";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, vendedor.getNombre());
            ps.setInt(2, vendedor.getCaja());
            ps.setInt(3, vendedor.getVentas());
            ps.setString(4, vendedor.getGenero());
            ps.setString(5, vendedor.getPassword());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR AGREGAR VENDEDOR: " + e);
        }
    }
    
    @Override
    public Vendedor search(int codigo) {
        String sql = "SELECT * FROM vendedores WHERE codigo = " + codigo;
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                v.setCodigo(rs.getInt(1));
                v.setNombre(rs.getString(2));
                v.setCaja(rs.getInt(3));
                v.setVentas(rs.getInt(4));
                v.setGenero(rs.getString(5));
                v.setPassword(rs.getString(6));
            }
        } catch (Exception e) {
            System.out.println("ERROR BUSCAR VENDEDOR: " + e);
        }
        return v;  
    }
    
    @Override
    public void edit(Vendedor vendedor) {
        String query = "UPDATE vendedores SET nombre=?, caja=?, ventas=?, genero=?, password=? WHERE codigo=?;";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, vendedor.getNombre());
            ps.setInt(2, vendedor.getCaja());
            ps.setInt(3, vendedor.getVentas());
            ps.setString(4, vendedor.getGenero());
            ps.setString(5, vendedor.getPassword());
            ps.setInt(6, vendedor.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR AL MODIFICAR VENDEDOR: " + e);
        }
    }
    
    @Override
    public void delete(int codigo) {
        String sql = "DELETE from vendedores WHERE codigo=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
