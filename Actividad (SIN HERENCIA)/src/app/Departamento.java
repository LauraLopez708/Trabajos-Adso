
package app;

import java.util.List;
import javax.swing.JOptionPane;

public class Departamento {
  
    String nombreDepartamento;
    String ubicacion; //(Oficina física, ciudad o región, área dentro de la sede)
    List<Empleado> empleados;

    public Departamento(String nombreDepartamento, String ubicacion) {
        this.nombreDepartamento = nombreDepartamento;
        this.ubicacion = ubicacion;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
  public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        JOptionPane.showMessageDialog(null, "Empleado " + empleado.getNombre() + " agregado al departamento " + nombreDepartamento);
    }

    public void mostrarEmpleados() {
        StringBuilder lista = new StringBuilder("Empleados en el departamento " + nombreDepartamento + ":\n");
        for (Empleado empleado : empleados) {
            lista.append(empleado.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }
}
