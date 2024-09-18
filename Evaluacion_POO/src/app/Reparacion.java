package app;

import java.util.ArrayList;
import java.util.List;

public class Reparacion {
    public int id;
    public Vehiculo vehiculo;
    public List<Repuesto> repuestosUtilizados;
    public boolean estado;

    public Reparacion(int id, Vehiculo vehiculo) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.repuestosUtilizados = new ArrayList<>();
        this.estado = false;
    }

    private static int idCounter = 1;

    public static int generarNuevoId() {
        return idCounter++;
    }

    public void agregarRepuesto(Repuesto repuesto) {
        repuestosUtilizados.add(repuesto);
    }

    public void marcarCompletada() {
        this.estado = true;
    }
}