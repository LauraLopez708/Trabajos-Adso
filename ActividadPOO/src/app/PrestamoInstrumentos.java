package app;

import java.time.LocalDate;

public class PrestamoInstrumentos {

    private Instrumento instrumento;
    private Instrumento grupo;
    private String nombreUsuario;
    private String celular;
    private String direccion;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;

    public PrestamoInstrumentos(Instrumento instrumento, Instrumento grupo, String nombreUsuario, String celular, String direccion) {
        this.instrumento = instrumento;
        this.grupo = grupo;
        this.nombreUsuario = nombreUsuario;
        this.celular = celular;
        this.direccion = direccion;
        this.fechaInicio = LocalDate.now();
        this.fechaDevolucion = fechaInicio.plusWeeks(1);
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public Instrumento getGrupo() {
        return grupo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isAtrasado() {
        return LocalDate.now().isAfter(fechaDevolucion);

    }

    public void mostrarInfo() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Instrumento: " + instrumento.getNombre());
        System.out.println("Celular: " + celular);
        System.out.println("Dirección: " + direccion);
        System.out.println("Fecha Incio del prestamo: " + fechaInicio);
        System.out.println("Fecha devolución del instrumento: " + fechaDevolucion);
        System.out.println("Estado: " + (isAtrasado() ? "Atrasado" : "En plazo"));
        System.out.println("");

    }
}
