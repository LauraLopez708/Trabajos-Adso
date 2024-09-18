package app;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Taller {
    public List<Repuesto> repuestos;
    public List<Vehiculo> vehiculos;
    public List<Reparacion> reparaciones;

    public Taller() {
        this.repuestos = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.reparaciones = new ArrayList<>();
    }

    public void agregarRepuesto() {
        int id = Repuesto.generarNuevoId();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del repuesto");
        int cantidadDicponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cantidad de repuestos dicponibles"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del repuesto"));
        Repuesto repuesto = new Repuesto(id, nombre, cantidadDicponible, precio);
        repuestos.add(repuesto);
        guardarInventario();
    }

    public void asignarReparacion() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);
        if (vehiculo == null) {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
            return;
        }
        int nuevoIdReparacion = Reparacion.generarNuevoId();
        Reparacion nuevaReparacion = new Reparacion(nuevoIdReparacion, vehiculo);
        reparaciones.add(nuevaReparacion);
        String nombreRepuesto = JOptionPane.showInputDialog("Ingrese el nombre del repuesto:");
        Repuesto repuesto = buscarRepuestoPorNombre(nombreRepuesto);
        if (repuesto == null) {
            JOptionPane.showMessageDialog(null, "Repuesto no encontrado.");
            return;
        }
        nuevaReparacion.agregarRepuesto(repuesto);
        vehiculo.listaReparaciones().add(nuevaReparacion);
        JOptionPane.showMessageDialog(null, "Reparación asignada correctamente.");
        guardarReparacion();
        iniciarReparacionesConcurrentes();
    }

    private Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.placa().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }

    private Repuesto buscarRepuestoPorNombre(String nombre) {
        for (Repuesto repuesto : repuestos) {
            if (repuesto.nombre().equalsIgnoreCase(nombre)) {
                return repuesto;
            }
        }
        return null;
    }

    public void registrarVehiculo() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo");
        Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, new ArrayList<>());
        vehiculos.add(vehiculo);
        JOptionPane.showMessageDialog(null, "Vehículo registrado exitosamente.");
    }

    public void listarRepuestos() {
        if (repuestos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay repuestos en stock");
        } else {
            StringBuilder r = new StringBuilder("Lista de repuestos:\n\n");
            for (Repuesto repuesto : repuestos) {
                r.append("ID: ").append(repuesto.id()).append("\n")
                        .append("Nombre: ").append(repuesto.nombre()).append("\n")
                        .append("Cantidad: ").append(repuesto.cantidadDisponible()).append("\n")
                        .append("Precio: ").append(repuesto.precio()).append("\n")
                        .append("\n\n");
            }
            JOptionPane.showMessageDialog(null, r.toString());
        }
    }

    public void listarReparaciones() {
        if (reparaciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay reparaciones en la lista");
        } else {
            StringBuilder r = new StringBuilder("Lista de reparaciones:\n\n");
            for (Reparacion reparacion : reparaciones) {
                r.append("ID: ").append(reparacion.id).append("\n")
                        .append("Vehiculo: ").append(reparacion.vehiculo).append("\n")
                        .append("Repuestos Utilizados: ").append(reparacion.repuestosUtilizados).append("\n")
                        .append("Estado: ").append(reparacion.estado)
                        .append("\n\n");
            }
            JOptionPane.showMessageDialog(null, r.toString());
        }
    }

    public void listarVehiculos() {
        if (vehiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay reparaciones en la lista");
        } else {
            StringBuilder r = new StringBuilder("Lista de reparaciones:\n\n");
            for (Vehiculo vehiculo : vehiculos) {
                r.append("Placa: ").append(vehiculo.placa()).append("\n")
                        .append("Marca: ").append(vehiculo.marca()).append("\n")
                        .append("Marca: ").append(vehiculo.marca()).append("\n")
                        .append("Reparaciones: ").append(vehiculo.listaReparaciones().toString())
                        .append("\n\n");
            }
            JOptionPane.showMessageDialog(null, r.toString());
        }
    }

    public void guardarInventario() {
        File inventarios = new File("inventario.txt");
        try {
            if (!inventarios.exists()) {
                inventarios.createNewFile();
            } else if (repuestos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay repuestos para guardar");
                return;
            }
            try (PrintWriter writer = new PrintWriter(new FileWriter(inventarios, false))) {
                for (Repuesto repuesto : repuestos) {
                    repuestos.forEach(r -> writer.println(repuesto.id() + "," + repuesto.nombre() + "," + repuesto.cantidadDisponible() + "," + repuesto.precio()));
                }
            }
            JOptionPane.showMessageDialog(null, "Inventario guardado exitosamente!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar inventario: " + e.getMessage());
        }
    }

    public void cargarInventario() {
        try (BufferedReader reader = new BufferedReader(new FileReader("inventario.txt"))) {
            String linea;
            repuestos.clear();
            while ((linea = reader.readLine()) != null) {
                String[] data = linea.split(",");
                Integer idRepuesto = Integer.parseInt(data[0]);
                String nombre = data[1];
                int cantidadDisponible = Integer.parseInt(data[2]);
                double precio = Double.parseDouble(data[3]);

                Repuesto repuesto = new Repuesto(idRepuesto, nombre, cantidadDisponible, precio);
                repuestos.add(repuesto);
            }

            JOptionPane.showMessageDialog(null, "Inventario cargado exitosamente desde archivo de texto.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar inventario: " + e.getMessage());
        }
    }

    public void guardarReparacion() {
        File reparacion = new File("reparaciones.txt");
        try {
            if (!reparacion.exists()) {
                reparacion.createNewFile();
            } else if (reparaciones.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay repuestos para guardar");
                return;
            }
            try (PrintWriter writer = new PrintWriter(new FileWriter(reparacion, false))) {
                for (Reparacion re : reparaciones) {
                    reparaciones.forEach(r -> writer.println(re.id + ", " + re.vehiculo + ", " + re.repuestosUtilizados + ", " + re.estado));
                }
            }
            JOptionPane.showMessageDialog(null, "Reparacion guardada exitosamente!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la reparacion: " + e.getMessage());
        }
    }

    public void iniciarReparacionesConcurrentes() {
        for (Reparacion reparacion : reparaciones) {
            Thread hiloReparacion = new Thread(() -> {
                try {
                    Thread.sleep(3000);
                    reparacion.marcarCompletada();
                    System.out.println("Reparación con ID " + reparacion.id + " completada.");
                } catch (InterruptedException e) {
                    System.err.println("Error durante la reparación: " + e.getMessage());
                }
            });
            hiloReparacion.start();
        }
    }
}



