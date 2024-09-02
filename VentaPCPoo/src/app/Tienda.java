package app;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class Tienda {

    private List<Producto> productos;
    private List<Fabricante> fabricantes;
    private List<Venta> ventas;

    public void agregarProducto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));

        String nombreFabricante = JOptionPane.showInputDialog("Ingrese el nombre del fabricante:");
        String paisFabricante = JOptionPane.showInputDialog("Ingrese el país del fabricante:");
        String añoFundacion = JOptionPane.showInputDialog("Ingrese el año de fundación del fabricante:");

        Fabricante fabricante = new Fabricante(nombreFabricante, paisFabricante, añoFundacion);
        fabricantes.add(fabricante);

        Producto producto = new Producto(nombre, codigo, precio, fabricantes);
        productos.add(producto);

        JOptionPane.showMessageDialog(null, "Fabricante agregada exitosamente");

    }

    public void registrarFabricante() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del fabricante:");
        String pais = JOptionPane.showInputDialog("Ingrese el país del fabricante:");
        String añoFundacion = JOptionPane.showInputDialog("Ingrese el año de fundación del fabricante:");

        Fabricante fabricante = new Fabricante(nombre, pais, añoFundacion);
        fabricantes.add(fabricante);
    }

    public void realizarVenta() {
        String codigoProducto = JOptionPane.showInputDialog("Ingrese el código del producto:");
        Producto producto = productos.stream()
                .filter(p -> p.getCodigo().equals(codigoProducto))
                .findFirst()
                .orElse(null);

        if (producto != null) {
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));
            LocalDate fecha = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de la venta (YYYY-MM-DD):"));

            Venta venta = new Venta(codigoProducto, cantidad, fecha, cantidad);
            ventas.add(venta);
            JOptionPane.showMessageDialog(null, "Venta realizada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        }
    }

    public void calcularTotalVentas() {

        LocalDate inicio = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de inicio (YYYY-MM-DD):"));
        LocalDate fin = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de fin (YYYY-MM-DD):"));

        List<Double> totalVentas = ventas.stream()
                .filter(venta -> !venta.getFecha().isBefore(inicio) && !venta.getFecha().isAfter(fin))
                .map(Venta::getTotal)
                .collect(Collectors.toList());

        double total = totalVentas.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        if (total == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron ventas realizadas en este rango de fechas.");
        } else {
            JOptionPane.showMessageDialog(null, "El total de ventas desde " + inicio + " hasta " + fin + " es: " + total);
        }
    }
}
