package app;

public record Repuesto(int id, String nombre, int cantidadDisponible, double precio) {

    private static int idCounter = 1;
    public static int generarNuevoId() {
        return idCounter++;
    }
}

