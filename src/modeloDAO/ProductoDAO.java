package modeloDAO;

import config.Conexion;
import interfaces.CRUDProducto;
import java.sql.*;
import java.util.LinkedList;
import modelo.Producto;

public class ProductoDAO implements CRUDProducto {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Producto p = new Producto();
    
    @Override
    public LinkedList<Producto> listar() {
        LinkedList<Producto> lista = new LinkedList<Producto>();
        String sql = "SELECT * FROM productos";
        try {
            //Inicializa la base de datos
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();
                pro.setCodigo(rs.getInt(1));
                pro.setNombre(rs.getString(2));
                pro.setDescripcion(rs.getString(3));
                pro.setCantidad(rs.getInt(4));
                pro.setPrecio(rs.getFloat(5));
                lista.add(pro);
            }
        } catch (Exception e) {
            System.out.println("ERROR LISTA PRODUCTOS: " + e);
        }
        return lista;
    }
    
    @Override
    public void add(Producto producto) {
        String query = "INSERT INTO productos VALUES (0,?,?,?,?);";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getCantidad());
            ps.setFloat(4, producto.getPrecio());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR AGREGAR PRODUCTO: " + e);
        }
    }
    
    @Override
    public Producto search(int codigo) {
        String sql = "SELECT * FROM productos WHERE codigo = " + codigo;
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setCodigo(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setCantidad(rs.getInt(4));
                p.setPrecio(rs.getFloat(5));
            }
        } catch (Exception e) {
            System.out.println("ERROR BUSCAR PRODUCTO: " + e);
        }
        return p;  
    }
    
    @Override
    public void edit(Producto producto) {
        String query = "UPDATE productos SET nombre=?, descripcion=?, cantidad=?, precio=? WHERE codigo=?;";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getCantidad());
            ps.setFloat(4, producto.getPrecio());
            ps.setInt(5, producto.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR AL MODIFICAR PRODUCTO: " + e);
        }
    }
    
    @Override
    public void delete(int codigo) {
        String sql = "DELETE from productos WHERE codigo=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    } 
}
