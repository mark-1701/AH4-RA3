package interfaces;

import java.util.LinkedList;
import modelo.Cliente;

public interface CRUDCliente {
    public LinkedList<Cliente> listar();
    public void add(Cliente cliente);
    public Cliente search(int codigo);
    public void edit(Cliente cliente);
    public void delete(int codigo);
}
