package app;

import java.util.List;

public record Vehiculo(String placa, String marca, String modelo, List<Reparacion> listaReparaciones) {

}
