package modeloDAO;

import config.Conexion;
import interfaces.CRUDCliente;
import java.sql.*;
import java.util.LinkedList;
import modelo.Cliente;

public class ClienteDAO implements CRUDCliente{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; 
    Cliente c = new Cliente();
    
    @Override
    public LinkedList<Cliente> listar() {
        LinkedList<Cliente> lista = new LinkedList<Cliente>();
        String sql = "SELECT * FROM clientes";
        try {
            //Inicializa la base de datos
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setCodigo(rs.getInt(1));
                cli.setNombre(rs.getString(2));
                cli.setNit(rs.getString(3));
                cli.setCorreo(rs.getString(4));
                cli.setGenero(rs.getString(5));
                lista.add(cli);
            }
        } catch (Exception e) {
            System.out.println("ERROR LISTA CLIENTES: " + e);
        }
        return lista;
    }
    
    @Override
    public void add(Cliente cliente) {
        String query = "INSERT INTO clientes VALUES (0,?,?,?,?);";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getNit());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getGenero());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR AGREGAR CLIENTE: " + e);
        }
    }
    
    @Override
    public Cliente search(int codigo) {
        String sql = "SELECT * FROM clientes WHERE codigo = " + codigo;
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setCodigo(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setNit(rs.getString(3));
                c.setCorreo(rs.getString(4));
                c.setGenero(rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println("ERROR BUSCAR CLIENTE: " + e);
        }
        return c;  
    }
    
    @Override
    public void edit(Cliente cliente) {
        String query = "UPDATE clientes SET nombre=?, nit=?, correo=?, genero=? WHERE codigo=?;";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getNit());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getGenero());
            ps.setInt(5, cliente.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR AL MODIFICAR CLIENTE: " + e);
        }
    }
    
    @Override
    public void delete(int codigo) {
        String sql = "DELETE from clientes WHERE codigo=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
