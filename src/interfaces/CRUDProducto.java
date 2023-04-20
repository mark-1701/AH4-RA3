package interfaces;

import java.util.LinkedList;
import modelo.Producto;

public interface CRUDProducto {
    public LinkedList<Producto> listar();
    public void add(Producto producto);
    public Producto search(int codigo);
    public void edit(Producto producto);
    public void delete(int codigo);
}
