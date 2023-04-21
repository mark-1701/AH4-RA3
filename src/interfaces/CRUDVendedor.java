package interfaces;

import java.util.LinkedList;
import modelo.Vendedor;

public interface CRUDVendedor {
    public LinkedList<Vendedor> listar();
    public void add(Vendedor vendedor);
    public Vendedor search(int codigo);
    public void edit(Vendedor vendedor);
    public void delete(int codigo);
}
