package actividad3;

import java.time.Duration;
import java.time.LocalTime;

public class Actividad3 {

    public static void main(String[] args) {

        //Ejercicio 1
        double principal = 5000;
        double tasaInteres = 10;
        int años = 4;

        double montoFinal = principal * Math.pow((1 + tasaInteres / 100), años);
        System.out.println("El monto final es: " + montoFinal);

        //Ejercicio 2
        double precio = 2500;
        double descuento = 15;

        System.out.println("El precio es de: " + (precio * (1 - descuento / 100)));

        //Ejercicio 3
        int horas = 500;
        int horasDia = 8;
        int diasHabiles = 10;

        int trabajadores = (int) Math.ceil((double) horas / (horasDia * diasHabiles));
        System.out.println("Los trabajadores necesario son: " + trabajadores);

        //Ejercicio 4
        double km = 10 * 160934;

        System.out.println("La conversion de millas a km es: " + km);

        //Ejercicio 5
        double radio = 5;
        double area = 3.14 * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area);

        //Ejercicio 6
        double c1 = 5.2;
        double c2 = 6.5;

        double hipotenusa = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        System.out.println("La hipotenusa es: " + hipotenusa);

        //Ejercicio 7
        double r = 8;
        double h = 25;

        double vol = 3.14 * Math.pow(r, 2) * h;
        System.out.println("El volumen del cilindro es: " + vol);

        //Ejercicio 8
        double num = 11;

        double raiz = Math.sqrt(num);
        System.out.println("La raíz cuadrada es: " + raiz);

        //Ejercicio 9
        double prestamo = 1507000;
        double tasainteres = 3;
        int tiempo = 6; //meses

        double interes = prestamo * tasainteres / 100 * tiempo;
        double total = prestamo + interes;

        System.out.println("El sosto total del prestamo con interes es: " + total);

        //Ejercicio 10
        double valor = 0.8;

        double angulo = Math.asin(valor);

        System.out.println("El angulo es: " + angulo);

        //Ejercicio 11
        LocalTime inicio = LocalTime.of(8, 0);
        LocalTime fin = LocalTime.of(10, 30);

        Duration duracion = Duration.between(inicio, fin);
        long minutos = duracion.toMinutes();
        System.out.println("La diferencia en minutos es: " + minutos);

        //Ejercicio 12
        double gradosC = 35;
        System.out.println("35 grados centigrados son: " + (gradosC + 273.75) + " Grados fahrenheit");

        //Ejercicio 13 
        double totalAnual = 15000;
        double meses = 12;
        double promedio = totalAnual / meses;
        System.out.println("El promedio mensual en vesntas es: " + promedio);

        //Ejercicio 14
        double longitud = 5;
        double anchura = 3;

        double perimetro = 2 * Math.PI * Math.sqrt((Math.pow(longitud, 2) + Math.pow(anchura, 2)) / 2);
        System.out.println("El perímetro de la elipse es: " + perimetro);

        //Ejercicio 15
        double monto = 200000;
        double tasaInt = 5;
        int plazo = 30;

        double tasaMensual = tasaInt / 100 / 12;
        int numeroPagos = plazo * 12;

        double amortizacion = (monto * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -numeroPagos));
        System.out.println("La amortización mensual es: " + amortizacion);

        //Ejercicio 16        
        double distancia = 150;
        double time = 2;

        
        double velocidadPromedio = distancia / time;
        System.out.println("La velocidad promedio es: " + velocidadPromedio + " km/h");

        //Ejercicio 17
        double costoInicial = 10000;
        double valorResidual = 1000;
        int vidaUtil = 5;

        double depreciacionAnual = (costoInicial - valorResidual) / vidaUtil;
        System.out.println("La depreciación anual es: " + depreciacionAnual);

        //Ejercicio 18
        
        
        //Ejercicio 19
        //Ejercicio 20
    }

}
