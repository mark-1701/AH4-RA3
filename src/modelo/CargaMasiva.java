package modelo;

import com.google.gson.*;
import java.io.*;
import java.text.ParseException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modeloDAO.SucursalDAO;

public class CargaMasiva {

    SucursalDAO daoS = new SucursalDAO();

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

    public void carga_masiva() throws FileNotFoundException, IOException, ParseException {
        String archivo_retorno = leerarchivo();
        JsonParser parse = new JsonParser();
        JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

        for (int i = 0; i < matriz.size(); i++) {
            JsonObject object = matriz.get(i).getAsJsonObject();

            int codigo = 0;
            String nombre = object.get("nombre").getAsString();
            String direccion = object.get("direccion").getAsString();
            String correo = object.get("correo").getAsString();
            String telefono = object.get("telefono").getAsString();
            Sucursal suc = new Sucursal(codigo, nombre, direccion, correo, telefono);
            daoS.add(suc);
        }
        JOptionPane.showMessageDialog(null, "Se hizo la carga masiva correctamente", "Alerta", JOptionPane.WARNING_MESSAGE);
    }
}
