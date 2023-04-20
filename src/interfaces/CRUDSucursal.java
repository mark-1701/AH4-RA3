package interfaces;

import java.util.LinkedList;
import modelo.Sucursal;

public interface CRUDSucursal {
    public LinkedList<Sucursal> listar();
    public void add(Sucursal sucursal);
    public Sucursal search(int codigo);
    public void edit(Sucursal sucursal);
    public void delete(int codigo);
}
