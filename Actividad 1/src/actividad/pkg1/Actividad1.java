package actividad.pkg1;

import java.time.*;

public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 20: Tienda
        int precioInt = 100;
        double precioDouble = (double) precioInt;
        System.out.println("La conversión de int a double es: " + precioDouble);

        // Ejercicio 21: Supermercado
        double precioRedondeo = 10.5;
        int precioRedondeado = (int) Math.round(precioRedondeo);
        System.out.println("El precio redondeado es: " + precioRedondeado);

        // Ejercicio 22: Aplicación
        char letra = 'E';
        int posicionAlfabetica = (int) letra - (int) 'A' + 1;
        System.out.println("La posición alfabética de la letra es: " + posicionAlfabetica);

        // Ejercicio 23: Juego 
        int posicion = 6;
        char letraAlfabetica = (char) (posicion + (int) 'A' - 1);
        System.out.println("La letra en la posición alfabética es: " + letraAlfabetica);

        // Ejercicio 24: Página web
        String edad = "25";
        int edadInt = Integer.parseInt(edad);
        System.out.println("La conversión de String a int es: " + edadInt);

        // Ejercicio 25: Informes
        int empleado = 1234567890;
        String strEpleado = Integer.toString(empleado);
        System.out.println("La conversión de int a String es: " + strEpleado);

        // Ejercicio 26: App Metereológica
        float temperatura = 24.5f;
        double temperaturaD = (double) temperatura;
        System.out.println("La conversión de float a double es: " + temperaturaD);

        // Ejercicio 27: Control de calidad
        double medida = 123.456;
        float medidaF = (float) medida;
        System.out.println("La conversión de double a float es: " + medidaF);

        // Ejercicio 28: Calculadora online
        String numStr = "12.34";
        double numDouble = Double.parseDouble(numStr);
        System.out.println("La conversión de String a double es: " + numDouble);

        // Ejercicio 29: App Bancaria
        double saldo = 1234.56;
        String saldoStr = Double.toString(saldo);
        System.out.println("La conversión de double a String es: " + saldoStr);

        // Ejercicio 30: Sistema de votación
        long votos = 1234567890L;
        int votosInt = (int) votos;
        System.out.println("La conversión de long a int es: " + votosInt);

        // Ejercicio 31: Controlador de visitas
        int visitas = 987654321;
        long visitasLong = (long) visitas;
        System.out.println("La conversión de int a long es: " + visitasLong);

        // Ejercicio 32: Contról de dispositivos eléctronicos
        short dato = 123;
        byte datoB = (byte) dato;
        System.out.println("La conversión de short a byte es: " + datoB);

        // Ejercicio 33: Conversión de byte a short
        byte sensor = 100;
        short sensorS = (short) sensor;
        System.out.println("La conversión de byte a short es: " + sensorS);

        // Ejercicio 34: App fitness
        String distancia = "10.5";
        float distanciaF = Float.parseFloat(distancia);
        System.out.println("La conversión de String a float es: " + distanciaF);

        // Ejercicio 35: seguimiento de presupuesto
        float gasto = 123.45f;
        String strGasto = Float.toString(gasto);
        System.out.println("La conversión de float a String es: " + strGasto);

        // Ejercicio 36: Formulario Online
        boolean aceptaTerminos = true;
        String bol = Boolean.toString(aceptaTerminos);
        System.out.println("La conversión de boolean a String es: " + bol);

        // Ejercicio 37: App de encuestas
        String respuestaStr = "true";
        boolean bol2 = Boolean.parseBoolean(respuestaStr);
        System.out.println("La conversión de String a boolean es: " + bol2);

        // Ejercicio 38: Sistema de compresion
        int valorInt = 127;
        byte valorByte = (byte) valorInt;
        System.out.println("La conversión de int a byte es: " + valorByte);

        // Ejercicio 39: Decodificacion de datos
        byte datoSensorByte = 50;
        int sensorInt = (int) datoSensorByte;
        System.out.println("La conversión de byte a int es: " + sensorInt);

        // Ejercicio 40: App de reserva de citas
        String fechaStr = "2024-07-10";
        LocalDate fechaDate = LocalDate.parse(fechaStr);
        System.out.println("La conversión de String a LocalDate es: " + fechaDate);

        // Ejercicio 41: App de mensajeria
        String fechaHoraStr = "2024-07-10T01:04:20";
        LocalDateTime fechaHora = LocalDateTime.parse(fechaHoraStr);
        System.out.println("La conversión de String a LocalDateTime es: " + fechaHora);

        // Ejercicio 42: App de Despertador
        String horaStr = "01:04:20";
        LocalTime time = LocalTime.parse(horaStr);
        System.out.println("La conversión de String a LocalTime es: " + time);

        // Ejercicio 43: App de Viajes
        String fechaHoraZonaStr = "2024-07-10T01:04:20+03:00";
        ZonedDateTime zonedDate = ZonedDateTime.parse(fechaHoraZonaStr);
        System.out.println("La conversión de String a ZonedDateTime es: " + zonedDate);

        // Ejercicio 44: Registro de eventos
        String marcaTiempoStr = "2024-07-10T01:04:20Z";
        Instant instant = Instant.parse(marcaTiempoStr);
        System.out.println("La conversión de String a Instant es: " + instant);

        // Ejercicio 45: App Getión de Suscriptores
        String duracionSuscripcionStr = "P1Y2M3D";
        Period periodo = Period.parse(duracionSuscripcionStr);
        System.out.println("La conversión de String a Period es: " + periodo);

        // Ejercicio 46: App Seguimiento de Ejercicio 
        String duracionEjercicioStr = "PT1H30M";
        Duration duracion = Duration.parse(duracionEjercicioStr);
        System.out.println("La conversión de String a Duration es: " + duracion);

        // Ejercicio 47: App de Calendario
        String fechaHoraDesfaseStr = "2024-07-10T01:04:20+03:00";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(fechaHoraDesfaseStr);
        System.out.println("La conversión de String a OffsetDateTime es: " + offsetDateTime);

        // Ejercicio 48: App de reservas
        String horaDesfaseStr = "01:04:20+03:00";
        OffsetTime offsetTime = OffsetTime.parse(horaDesfaseStr);
        System.out.println("La conversión de String a OffsetTime es: " + offsetTime);

        // Ejercicio 49: App Historial Académico
        String anioIngresoStr = "2024";
        Year anioIngreso = Year.parse(anioIngresoStr);
        System.out.println("La conversión de String a Year es: " + anioIngreso);

        // Ejercicio 50: App de Facturación
        String fechaFacturaStr = "2024-07";
        YearMonth yearMonth = YearMonth.parse(fechaFacturaStr);
        System.out.println("La conversión de String a YearMonth es: " + yearMonth);
    }
}
