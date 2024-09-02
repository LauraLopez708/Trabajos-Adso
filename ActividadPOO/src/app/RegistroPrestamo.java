/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import app.Instrumento;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC_21
 */
public class RegistroPrestamo {

    private ArrayList<Instrumento> listaInstrumentos = new ArrayList<>();
    private ArrayList<PrestamoInstrumentos> listaPrestamo = new ArrayList<>();

    public String entrada(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    //1. Agregar nuevos Instrumentos al inventario
    public void agregarInstrumentos() {
        String nombre = entrada("Nombre del Instrumento: ");
        for (Instrumento instrumentos : listaInstrumentos) {
            if (instrumentos.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "¡¡El Instrumento ya existe!!");
                return;
            }
        }
        String grupo = entrada("Ingrese el grupo de Instrumento: "
                + "(\ncuerdas, cuerdas frotadas, vientos o maderas, metales, percusión)");
        String categoria = entrada("Ingrese la categoria del Instrumento: ");
        String estado = entrada("Indique el estado del instrumento:"
                + "(\nnuevo, usado, en reparación)");
        int cantidad = Integer.parseInt(entrada("Ingrese la cantidad de instrumentos a registrar: "));
        int disponibles = (cantidad);
        Instrumento instrumentos = new Instrumento(nombre, grupo, categoria, estado, cantidad, disponibles);
        listaInstrumentos.add(instrumentos);
        JOptionPane.showMessageDialog(null, "El Instrumento ha sido agregado exitósamente");
    }

    //2. Actualizar información de Instrumentos en el inventario
    public void actualizarInformacionDelInstrumento() {
        byte opcion;
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("SELECCIONE UNA OPCIÓN\n"
                    + "1. Eliminar instrumentos del inventario\n"
                    + "2. Actualizar estado del instrumento\n"
                    + "3. Actualizar la cantidad disponible\n"
                    + "4. Regresar <--"));

            switch (opcion) {
                case 1 ->
                    eliminarInstrumento();
                case 2 ->
                    actualizarEstado();
                case 3 ->
                    actualizarCantidad();
                case 4 ->
                    JOptionPane.showMessageDialog(null, "Regresando al menú anterior...");
                default ->
                    JOptionPane.showMessageDialog(null, "Elija una opción valida...");
            }
        } while (opcion != 4);
    }

    //2.1. Eliminar instrumentos del inventario
    public void eliminarInstrumento() {
        String nombre = entrada("Ingrese el nombre del Instrumento a eliminar: ");
        boolean eliminado = listaInstrumentos.removeIf(instrumentos -> instrumentos.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Instrumento eliminado exitosamente:\n");
        } else {
            JOptionPane.showMessageDialog(null, "Instrumento NO encontrado");
        }
    }

    //2.2. Actualizar estado del instrumento
    public void actualizarEstado() {
        String nombre = entrada("Ingrese el nombre del Instrumento a actualizar el estado: ");
        for (Instrumento instrumentos : listaInstrumentos) {
            if (instrumentos.getNombre().equalsIgnoreCase(nombre)) {
                String estado = entrada("Ingrese el nuevo estado del instrumento");
                instrumentos.setEstado(estado);

                JOptionPane.showMessageDialog(null, "Estado del Instrumento Actualizado exitosamente:\n");
            } else {
                JOptionPane.showMessageDialog(null, "Instrumento NO encontrado");
            }
        }
    }

    //2.3. Actualizar la cantidad disponible
    public void actualizarCantidad() {
        String nombre = entrada("Ingrese el nombre del Instrumento a actualizar la cantidad: ");
        for (Instrumento instrumentos : listaInstrumentos) {
            if (instrumentos.getNombre().equalsIgnoreCase(nombre)) {
                int cantidad = Integer.parseInt(entrada("Ingrese la nueva cantidad de instrumentos"));
                instrumentos.setCantidad(cantidad);

                JOptionPane.showMessageDialog(null, "Estado del Instrumento Actualizado exitosamente:\n");
            } else {
                JOptionPane.showMessageDialog(null, "Instrumento NO encontrado");
            }
        }
    }

    //3. Solicitar prestamo de instrumentos
    public void registrarPrestamo() {
        Instrumento instrumentos = new Instrumento();
        if (listaInstrumentos.isEmpty() && instrumentos.getDisponible() <= 0) {
            JOptionPane.showMessageDialog(null, "¡¡No hay Instrumentos disponibles!!");
            return;
        }
        String nombreInstrumento = entrada("Ingrese el nombre del Instrumento a prestar: ");
        Instrumento InstrumentoPrestado = null;

        for (Instrumento instrumento : listaInstrumentos) {
            if (instrumento.getNombre().equalsIgnoreCase(nombreInstrumento)) {
                InstrumentoPrestado = instrumento;
                break;
            }
        }
        String grupo = entrada("Ingrese el grupo del Instrumento a prestar:\n"
                + "Cuerdas\n"
                + "Cuerdas Frotadas\n"
                + "Vientos o Maderas\n"
                + "Metales\n"
                + "Percusión");

        for (Instrumento grupoI : listaInstrumentos) {
            if (grupoI.getGrupo().equalsIgnoreCase(grupo)) {
                InstrumentoPrestado = grupoI;
                break;
            }
        }
        if (InstrumentoPrestado == null) {
            JOptionPane.showMessageDialog(null, "Instrumento no encontrado");
            return;
        }
        if (InstrumentoPrestado.getDisponible() <= 0) {
            JOptionPane.showMessageDialog(null, "No hay ejemplares disponibles");
            return;
        }

        String nombreUsuario = entrada("Ingrese el nombre del usuario: ");
        String celular = entrada("Ingrese el numero de celular del usuario: ");
        String direccion = entrada("Ingrese la direccion del usuario: ");

        PrestamoInstrumentos prestamo = new PrestamoInstrumentos(InstrumentoPrestado, InstrumentoPrestado, nombreUsuario, celular, direccion);
        listaPrestamo.add(prestamo);
        instrumentos.setCantidad(instrumentos.getCantidad() - 1);

        JOptionPane.showMessageDialog(null, """
                                            Prestamo resgistrado exitosamente
                                            Fecha de devolucion: """ + prestamo.getFechaDevolucion());
    }

    //4. Registrar devolucion de instrumentos
    public void registrarDevolucion() {
        Instrumento instrumento = new Instrumento();

        String nombre = entrada("ingrese el nombre del instrumento: ");
        int devolucion = 0;
        for (Instrumento instrumentos : listaInstrumentos) {
            if (instrumentos.getNombre().equalsIgnoreCase(nombre)) {
                instrumento = instrumentos;
                devolucion = (instrumento.getDisponible() + 1);
                instrumento.setDisponible(devolucion);
                JOptionPane.showMessageDialog(null, "El instrumento " + instrumento.getNombre() + " ha sido devuelto.");

            } else {
                JOptionPane.showMessageDialog(null, "El instrumento no se encuentra registrado");
            }
        }

        if (instrumento != null) {
            devolucion = instrumento.getDisponible() + 1;
            instrumento.setDisponible(devolucion);

        } else {
            JOptionPane.showMessageDialog(null, "El instrumento ya estaba disponible.");
        }
    }

    //5. Listar instrumentos disponibles
    public void reporteInstrumentosDisponibles() {
        Instrumento instrumento = new Instrumento();
        if (listaInstrumentos.isEmpty() && instrumento.getDisponible() > 0) {
            JOptionPane.showMessageDialog(null, "No hay Instrumentos en la lista");
        }
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < listaInstrumentos.size(); i++) {

            string.append("Nombre: ").append(listaInstrumentos.get(i).getNombre()).append("\n");
            string.append("Grupo: ").append(listaInstrumentos.get(i).getGrupo()).append("\n");
            string.append("Categoria: ").append(listaInstrumentos.get(i).getCategoria()).append("\n");
            string.append("Estado: ").append(listaInstrumentos.get(i).getEstado()).append("\n");
            string.append("Cantidad:  ").append(listaInstrumentos.get(i).getCantidad()).append("\n");
            string.append("Disponibles: ").append(instrumento.getDisponible()).append("\n\n");

        }
        JOptionPane.showMessageDialog(null, string.toString());
    }

    //6. Generar historial de prestamos
    public void historialPrestamos() {
        if (listaPrestamo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay prestamos registrados");

        }
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte detallado de instrumentos prestados: \n");
        reporte.append("Total instrumentos: ").append(listaInstrumentos.size()).append("\n");

        for (PrestamoInstrumentos prestamo : listaPrestamo) {
            reporte.append("Instrumento:").append(prestamo.getInstrumento().getNombre()).append("\n");
            reporte.append("grupo:").append(prestamo.getGrupo()).append("\n");
            reporte.append("Usuario:").append(prestamo.getNombreUsuario()).append("\n");
            reporte.append("Celular:").append(prestamo.getCelular()).append("\n");
            reporte.append("Dirección:").append(prestamo.getDireccion()).append("\n");
            reporte.append("Fecha Prestamo:").append(prestamo.getFechaInicio()).append("\n");
            reporte.append("Fecha Devolución:").append(prestamo.getFechaDevolucion()).append("\n");
            reporte.append("Estado:").append(prestamo.isAtrasado() ? "Atrasado" : "En plazo").append("\n\n");
        }
        JOptionPane.showMessageDialog(null, reporte.toString());
    }

    //7. Generar reporte de instrumentos No devueltos
    public void instrumentosNoDevueltos() {
        if (listaPrestamo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay prestamos registrados");
        }
        StringBuilder prestamosAtrasados = new StringBuilder();
        boolean hayAtrasos = false;
        for (PrestamoInstrumentos prestamo : listaPrestamo) {
            if (prestamo.isAtrasado()) {
                prestamosAtrasados.append("Usuario: ").append(prestamo.getNombreUsuario()).append("\n");
                prestamosAtrasados.append("Instrumentos: ").append(prestamo.getInstrumento()).append("\n");
                prestamosAtrasados.append("Fecha Devolución: ").append(prestamo.getFechaDevolucion()).append("\n\n");
            }
        }
        if (hayAtrasos) {
            JOptionPane.showMessageDialog(null, "Prestamos atrasados: \n" + prestamosAtrasados);
        } else {
            JOptionPane.showMessageDialog(null, "No hay prestamos atrasados");
        }
    }

    //8. Generar reporte de uso por grupo de instrumentos
    public void reporteUsoPorGrupo() {
        StringBuilder reporte = new StringBuilder("Uso por grupo de instrumentos:\n");

        for (PrestamoInstrumentos prestamo : listaPrestamo) {
            Instrumento instrumento = prestamo.getInstrumento();
            Instrumento grupo = prestamo.getGrupo();

            if (instrumento.getDisponible() <= 0) {
                reporte.append("------------Reporte de instrumentos usados por grupo----------\n");
                reporte.append("Grupo: ").append(grupo).append("\n");
                reporte.append("Instrumento: ").append(instrumento.getNombre()).append("\n");

            }
        }
        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}
