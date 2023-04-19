package modelo;

import java.io.Serializable;

public class Vendedor implements Serializable{
    int codigo;
    String nombre;
    int caja;
    int ventas;
    String genero;
    String password;
    boolean actvidad;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nombre, int caja, int ventas, String genero, String password, boolean actvidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.caja = caja;
        this.ventas = ventas;
        this.genero = genero;
        this.password = password;
        this.actvidad = actvidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActvidad() {
        return actvidad;
    }

    public void setActvidad(boolean actvidad) {
        this.actvidad = actvidad;
    }  
}
