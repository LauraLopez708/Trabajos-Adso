package app;

import java.util.List;
import javax.swing.JOptionPane;

public class Proyecto {

    String nombreProyecto;
    double presupuesto;
    String fechaInicio;
    String fechaFin;
    List<Empleado> empleadosAsignados;

    public Proyecto(String nombreProyecto, double presupuesto, String fechaInicio, String fechaFin) {
        this.nombreProyecto = nombreProyecto;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

   public void asignarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
        JOptionPane.showMessageDialog(null, "Empleado " + empleado.getNombre() + " asignado al proyecto " + nombreProyecto);
    }

    public void mostrarEmpleadosAsignados() {
        StringBuilder lista = new StringBuilder("Empleados asignados al proyecto " + nombreProyecto + ":\n");
        for (Empleado empleado : empleadosAsignados) {
            lista.append(empleado.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }
}
