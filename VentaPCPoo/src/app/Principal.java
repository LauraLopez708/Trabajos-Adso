
package app;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        while (true) {
            String[] opciones = {"Agregar Producto", "Registrar Fabricante",
                "Realizar venta", "Cálcular total de ventas", "Salir"};

            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción",
                    "Sistema de Gestión de Ventas de Computadores y Tecnología", JOptionPane.QUESTION_MESSAGE, null,
                    opciones, opciones[0]);

            if (seleccion == null || seleccion.equals("Salir")) {
                break;
            }
            switch (seleccion) {
                case "Agregar Producto" ->
                    tienda.agregarProducto();
                case "Registrar Fabricante" ->
                    tienda.registrarFabricante();
                case "Realizar venta" ->
                    tienda.realizarVenta();
                case "Cálcular total de ventas" ->
                    tienda.calcularTotalVentas();
                default ->
                    JOptionPane.showMessageDialog(null, "Seleccione una opción valida");
            }

        }
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");

    }

}
