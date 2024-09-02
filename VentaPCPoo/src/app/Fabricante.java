package app;

import java.util.Objects;

public class Fabricante {

    private String nombre;
    private String pais;
    private String añoFundacion;

    public Fabricante(String nombre, String pais, String añoFundacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.añoFundacion = añoFundacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais);
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
        final Fabricante other = (Fabricante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.pais, other.pais);
    }

    @Override
    public String toString() {
        return "Fabricante{" + "nombre=" + nombre + ", pais=" + pais
                + ", a\u00f1oFundacion=" + añoFundacion + '}';
    }

}
