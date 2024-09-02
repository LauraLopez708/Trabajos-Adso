package app;

public class Instrumento {

    private String nombre;
    private String grupo;
    private String categoria;
    private String estado;
    private int cantidad;
    private int disponible;

    public Instrumento() {
        this.nombre = "";
        this.grupo = "";
        this.categoria = "";
        this.estado = "";
        this.cantidad = 1;
        this.disponible = 1;
    }

    public Instrumento(String nombre, String grupo, String categoria, String estado, int cantidad, int disponible) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.categoria = categoria;
        this.estado = estado;
        this.cantidad = cantidad;
        this.disponible = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }
}
