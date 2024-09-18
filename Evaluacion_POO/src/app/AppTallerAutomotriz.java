package app;

import javax.swing.*;

public class AppTallerAutomotriz {
    public static void main(String[] args) {
        Taller taller = new Taller();
        byte opcion;
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Bienvenido al Sistema de gestión\n del taller automotriz\n\n"
                    + "1. Agregar repuesto a inventario\n"
                    + "2. Agregar Vehículo\n"
                    + "3. Asignar Reparación\n"
                    + "4. Listar Repuestos\n"
                    + "5. Listar Vehículos"
                    + "6. Listar Reparaciones\n"
                    + "7. Cargar Inventario\n"
                    + "8. Salir"));

            switch (opcion) {
                case 1 -> taller.agregarRepuesto();
                case 2 -> taller.registrarVehiculo();
                case 3 -> taller.asignarReparacion();
                case 4 -> taller.listarRepuestos();
                case 5 -> taller.listarVehiculos();
                case 6 -> taller.listarReparaciones();
                case 7 -> taller.cargarInventario();
                case 8 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema. ¡Hasta luego!");
                default -> JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (true);
    }
}

