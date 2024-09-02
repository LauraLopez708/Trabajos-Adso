package app;

import javax.swing.JOptionPane;

public class Empleado {

    String nombre;
    int edad;
    double salario;
    String puesto;
    String nomPoyecto;

    public Empleado(String nombre, int edad, double salario, String puesto, String nomPoyecto) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.puesto = puesto;
        this.nomPoyecto = nomPoyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNomPoyecto() {
        return nomPoyecto;
    }

    public void setNomPoyecto(String nomPoyecto) {
        this.nomPoyecto = nomPoyecto;
    }

    public void asignarProyecto(Proyecto proyecto) {
        proyecto.asignarEmpleado(this);
        JOptionPane.showMessageDialog(null, "Empleado " + nombre + 
                " asignado al proyecto " + proyecto.getNombreProyecto());
        

    }
}
