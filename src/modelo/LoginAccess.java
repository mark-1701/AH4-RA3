package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class LoginAccess {

    LinkedList<Vendedor> lista = new LinkedList<Vendedor>();

    public boolean serch(String nombre, String password) {
        try {
            for (Vendedor v : lista) {
                if (v.getNombre().equals(nombre) && v.getPassword().equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al encontrar vendedor", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }

        return false;
    }

}
