package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Producto {

    private String nombre;
    private String codigo;
    private double precio;
    private List<Fabricante> listFabricantes;

    public Producto(String nombre, String codigo, double precio, List<Fabricante> listFabricantes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.listFabricantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public List<Fabricante> getListFabricantes() {
        return listFabricantes;
    }

  
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo="
                + codigo + ", precio=" + precio + ", fabricantes="
                + listFabricantes + '}';
    }

}
