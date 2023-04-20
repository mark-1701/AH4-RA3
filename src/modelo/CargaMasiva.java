package modelo;

import com.google.gson.*;
import java.io.*;
import java.text.ParseException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modeloDAO.ClienteDAO;
import modeloDAO.ProductoDAO;
import modeloDAO.SucursalDAO;
import modeloDAO.VendedorDAO;
import vista.Vendedores;

public class CargaMasiva {

    SucursalDAO daoS = new SucursalDAO();
    ProductoDAO daoP = new ProductoDAO();
    ClienteDAO daoC = new ClienteDAO();
    VendedorDAO daoV = new VendedorDAO();
    
    private String leerarchivo() {
        JFileChooser fc = new JFileChooser();
        JPanel datos = new JPanel();
        int op = fc.showOpenDialog(datos);
        String content = "";
        if (op == JFileChooser.APPROVE_OPTION) {
            File pRuta = fc.getSelectedFile();
            String ruta = pRuta.getAbsolutePath();
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {
                archivo = new File(ruta);
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea = "";

                while ((linea = br.readLine()) != null) {
                    content += linea + "\n";
                }
                return content;

            } catch (FileNotFoundException ex) {
                JOptionPane.showInputDialog(null, "No se encontro el archivo");
            } catch (IOException ex) {
                JOptionPane.showInputDialog(null, "No se pudo abrir el archivo");
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    JOptionPane.showInputDialog(null, "No se encontro el archivo");
                    return "";
                }
            }
            return content;
        }
        return null;
    }

    public void carga_masiva(int tipo) throws FileNotFoundException, IOException, ParseException {
        String archivo_retorno = leerarchivo();
        JsonParser parse = new JsonParser();
        JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

        for (int i = 0; i < matriz.size(); i++) {
            JsonObject object = matriz.get(i).getAsJsonObject();
            if (tipo == 0) {
                int codigo = 0;
                String nombre = object.get("nombre").getAsString();
                String direccion = object.get("direccion").getAsString();
                String correo = object.get("correo").getAsString();
                String telefono = object.get("telefono").getAsString();
                Sucursal suc = new Sucursal(codigo, nombre, direccion, correo, telefono);
                daoS.add(suc);
            } else if (tipo == 1) {
                int codigo = 0;
                String nombre = object.get("nombre").getAsString();
                String descripcion = object.get("descripcion").getAsString();
                int cantidad = Integer.parseInt(object.get("cantidad").getAsString());
                float precio = Float.parseFloat(object.get("precio").getAsString());
                Producto pro = new Producto(codigo, nombre, descripcion, cantidad, precio);
                daoP.add(pro);
            } else if (tipo == 2) {
                int codigo = 0;
                String nombre = object.get("nombre").getAsString();
                String nit = object.get("nit").getAsString();
                String correo = object.get("correo").getAsString();
                String genero = object.get("genero").getAsString();
                Cliente cli = new Cliente(codigo, nombre, nit, correo, genero);
                daoC.add(cli);
            } else if (tipo == 3) {
                int codigo = 0;
                String nombre = object.get("nombre").getAsString();
                int caja = Integer.parseInt(object.get("caja").getAsString());
                int ventas = Integer.parseInt(object.get("ventas").getAsString());
                String genero = object.get("genero").getAsString();
                String password = object.get("password").getAsString();
                Vendedor ven = new Vendedor(codigo, nombre, caja, ventas, genero, password);
                daoV.add(ven);
            }
        }
        JOptionPane.showMessageDialog(null, "Se hizo la carga masiva correctamente", "Alerta", JOptionPane.WARNING_MESSAGE);
    }
}
