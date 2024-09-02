package app;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        RegistroPrestamo registroPrestamo = new RegistroPrestamo();

        byte opcion;

        do {
            opcion = Byte.parseByte((JOptionPane.showInputDialog("MENÚ PRINCIPAL\n"
                    + "1. Agregar nuevos Instrumentos al inventario\n"
                    + "2. Actualizar información de Instrumentos en el inventario\n"
                    + "3. Solicitar prestamo de instrumentos\n"
                    + "4. Registrar devolucion de instrumentos\n"
                    + "5. Listar instrumentos disponibles\n"
                    + "6. Generar historial de prestamos\n"
                    + "7. Generar reporte de instrumentos No devueltos\n"
                    + "8. Generar reporte de uso por grupo de instrumentos\n"
                    + "9. Salir")));

            switch (opcion) {
                case 1 ->
                    registroPrestamo.agregarInstrumentos();
                case 2 ->
                    registroPrestamo.actualizarInformacionDelInstrumento();
                case 3 ->
                    registroPrestamo.registrarPrestamo();
                case 4 ->
                    registroPrestamo.registrarDevolucion();
                case 5 ->
                    registroPrestamo.reporteInstrumentosDisponibles();
                case 6 ->
                    registroPrestamo.historialPrestamos();
                case 7 ->
                    registroPrestamo.instrumentosNoDevueltos();
                case 8 ->
                    registroPrestamo.instrumentosNoDevueltos();
                case 9 ->
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema");
                default ->
                    JOptionPane.showMessageDialog(null, "opción no valida");
            }

        } while (opcion != 9);
    }
}
