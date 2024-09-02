package actividad4;

import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        //Ejerccio 1
//        System.out.println("Ingrese su edad: ");
//        int edad = sc.nextInt();
//
//        System.out.println("Ingrese si ingreso anual");
//
//        double ingreso = sc.nextDouble();
//
//        if (edad > 25 && ingreso > 50000000) {
//            System.out.println("Elegible para prestamo");
//        } else {
//            System.out.println("No cumple con los requisitos");
//        }
//********************************************************************************
        //Ejercio 2
//        System.out.println("Indiue el tipo de vehiculo");
//
//        String movil = sc.next();
//
//        System.out.println("Indique la cantidd de pasajeros");
//
//        int pasajeros = sc.nextInt();
//
//        int km = 500;
//
//        if (movil.equals("coche")) {
//
//            double total = km * 1500;
//
//            if (pasajeros > 3) {
//
//                double descuento = total * 0.10;
//                System.out.println("El total es de: " + descuento);
//            } else {
//                System.out.println("El total es de: " + total);
//            }
//
//        } else if (movil.equals("bus")) {
//
//            double total = km * 900;
//            if (pasajeros > 3) {
//
//                double descuento = total * 0.10;
//                System.out.println("El total es de: " + descuento);
//            } else {
//                System.out.println("El total es de: " + total);
//            }
//        } else if (movil.equals("avion")) {
//            double total = km * 3000;
//            if (pasajeros > 3) {
//
//                double descuento = total * 0.10;
//                System.out.println("El total es de: " + descuento);
//            } else {
//                System.out.println("El total es de: " + total);
//            }
//        }
//********************************************************************************
        //  Ejercicio 3
//        System.out.println("Ingrese su pomedio");        
//        double promedio = sc.nextDouble();
//        
//        System.out.println("No. Participaciones en actividades");        
//        int participacion = sc.nextInt();
//        
//        System.out.println("Ingresos familiares");        
//        float ingresos = sc.nextFloat();
//        
//        if ( promedio >=85 && participacion >= 3 && ingresos <30000000) 
//        {
//            System.out.println("Es elegible para la beca");
//        }else{
//            System.out.println("No cumple con los requisitos para la beca");
//        }
//********************************************************************************
//        //Ejercicio 4
//        System.out.println("Desea iniciar sesion? (si/no)");
//        
//        String inicioSesion = sc.next();
//        
//        if(inicioSesion.equals("si"))
//        {
//            System.out.println("Indique su rol'");  
//            String rol = sc.next();
//            
//            if (rol.equals("admin"))
//            {
//                System.out.println("Bienvenido Usuario Administrador");
//            }else{
//                System.out.println("Usuario Registrado");
//            }
//        }else{
//            System.out.println("Usuario visitante");
//        }
//********************************************************************************
//        //Ejercicio 5      
//        System.out.println("Ingrese el capital disponible");
//
//        double capital = sc.nextDouble();
//
//        System.out.println("Indique la tasa de retorno esperada");
//
//        double tasaRetorno = sc.nextDouble();
//
//        System.out.println("Porcentage de riesgos asociados");
//
//        double riesgos = sc.nextDouble();
//
//        if (capital > 100000000 && tasaRetorno >= 10 && riesgos <20)
//        {
//            System.out.println("Es una inversion viable");
//
//        }
        //********************************************************************************
        //Ejercicio 6
//        System.out.println("Salario inicial 4000000");
//
//        double salario = 4000000;
//        double impuestos = salario - (salario * 20 / 100);
//
//        double seguridad = impuestos - (impuestos * 5 / 100);
//        double otros = seguridad - 200000;
//
//        System.out.println("El neto del empleado es: " + otros);
//********************************************************************************
        //Ejercicio 7
//        System.out.println("Indique su edad");
//        
//        int edad = sc.nextInt();
//        System.out.println("Tiene enfermedades cronicas");
//        
//        String enfermedades = sc.next();
//        
//        System.out.println("Fuma?");
//        
//        String fumador = sc.next();
//        
//        if (edad >30 && enfermedades.equals("no") && fumador.equals("no"))
//        {
//            System.out.println("Es elegible para el seguro premium");
//            
//        }else{
//            System.out.println("No es elegible para el seguro");
//        }
//        
//********************************************************************************
        //Ejercicio 8
//        System.out.println("Ingresos Proyectados");
//        double ingresosProyectados = sc.nextDouble();
//        System.out.println("Costos Iniciales");
//        double costosIniciales = sc.nextDouble();
//        System.out.println("Costos Operativos Anuales por 5 años");
//        double costosOperativos = sc.nextDouble();
//
//        if (ingresosProyectados == 200000000) {
//            if (costosIniciales == 50000000) {
//                if (costosOperativos == 30000000) {
//                    System.out.println("el proyecto es rentable");
//                } else {
//                    System.out.println("No cumple con los costos operativos");
//                }
//            } else {
//                System.out.println("No cumple con los costos Inciales");
//            }
//        } else {
//            System.out.println("No cumple con los ingresos proyectados");
//        }
//********************************************************************************
        //Ejercicio 9
//        int propiedad1 = 250000000;
//        int propiedad2 = 500000000;
//        double impuesto1 = propiedad1 * 1.2 / 100;
//        double impuesto2 = propiedad2 * 2 / 100;
//
//        System.out.println("Los impuestos para la propiedad de " + propiedad1 + " es: " + impuesto1);
//        System.out.println("Los impuestos para la propiedad de " + propiedad2 + " es: " + impuesto2);
//********************************************************************************
        //Ejercicio 10

//        int tonCo2 = 150;
//        double agua = 50.000;
//        int tonResiduos = 200;
//        
//        if ( tonCo2 < 100 && agua < 40.000 && tonResiduos < 150)
//        {
//            System.out.println("Cumple con los estandares ambientales");
//        }else
//        {
//            System.out.println("NO cumple con los estandares ambientales");
//        }
//********************************************************************************
        //Ejercicio 11
//        int añosServicio = 35;
//        int salarioMensual = 3000000;
//        int contribucionMes = salarioMensual * 10/100;
//        int contribucionAño = contribucionMes * 12;
//        int contribucionTotal = contribucionAño * añosServicio;
//        
//        int añosPostJubilacion = 35;
//        
//        int pensionMes = contribucionTotal/añosPostJubilacion * 12;
//        
//     
//        System.out.println("La pension mensual por 35 años de servicio es: " + pensionMes);
//********************************************************************************
        //Ejercicio 12 
//        System.out.print("Ingrese el valor de la inversion");
//        int inversion = sc.nextInt();
//
//        System.out.print("Ingrese la volatilidad de la inversion");
//        int volatilidad = sc.nextInt();
//
//        if (volatilidad < 5)
//        {
//            System.out.println("La inversión de " + inversion + " es de bajo riesgo.");
//        } else if (volatilidad >= 5 && volatilidad <= 15) 
//        {
//            System.out.println("La inversión de " + inversion + " es de riesgo medio.");
//        } else 
//        {
//            System.out.println("La inversión de " + inversion + " es de alto riesgo.");
//        }
//********************************************************************************
        //Ejercicio 13
//        System.out.println("Indique la cantidad de pisos a construir");
//        int pisos = sc.nextInt();
//
//        System.out.println("Los materiales son resistentes al fuego?");
//        String materiales = sc.next();
//
//        System.out.println("Magnitud de terremotos que soporta el diseño");
//        int terremotos = sc.nextInt();
//
//        if (pisos == 10 && materiales.equals("si") && terremotos == 8) {
//            System.out.println("La construccion cumple con las normativas locales");
//        } else {
//            System.out.println("La construccion *NO* cumple con las normativas locales");
//        }
//********************************************************************************
        //Ejercicio 14
//        double internet = 150000;
//        double cable = 120000;
//        double telefono = 90000;
//
//        System.out.println("Cantidad de servicios a contratar");
//        int servicios = sc.nextInt();
//        if (servicios == 1) {
//            System.out.println("Indique el servicio");
//            String nomServivcio = sc.next();
//            switch (nomServivcio) {
//                case "internet":
//                    System.out.println("El costo es de: " + internet);
//                    break;
//                case "cable":
//                    System.out.println("El costo es de: " + cable);
//                    break;
//                case "telefono":
//                    System.out.println("El costo es de: " + telefono);
//                    break;
//                default:
//                    System.out.println("Ingrese un dato valido");
//            }
//
//        } else if (servicios == 2) {
//            System.out.println("Indique de los servicios");
//            String serv1 = sc.next();
//            String serv2 = sc.next();
//            if (serv1.equals("internet") && serv2.equals("cable")) {
//                System.out.println("El costo es de: " + (internet + cable));
//            }else if(serv1.equals("internet") && serv2.equals("telefono"))
//            {
//                 System.out.println("El costo es de: " + (internet + telefono));
//            }else if (serv1.equals("cable") && serv2.equals("telefono"))
//            {
//                System.out.println("El costo es de: " + (cable + telefono));
//            }else
//            {  
//                System.out.println("Ingrese un dato valido");
//            }
//        }else if (servicios == 3)
//        {
//            double total = internet + cable + telefono;
//            double descuento = total * 15/100;
//            double totalDescuento = total - descuento;
//            System.out.println("El costo es de: " + total);            
//            System.out.println("Por adquirir los 3 servicios tiene un descuento del 15%: " + descuento );
//            System.out.println("El total final con descento es: " + totalDescuento);
//        
//        }
//********************************************************************************
        //Ejercicio 15
//        System.out.println("Indique el historial de adopcion (positivo/negativo)");
//        String historial = sc.next();
//        System.out.println("Indique si el entorno domestico es un espacio exterior (si/no)");
//        String entorno = sc.next();
//        System.out.println("Indique el ingreso mensual");
//        double salario = sc.nextDouble();
//        
//        if (historial.equals("positivo") && entorno.equals("si") && salario >2000000)
//        {
//            System.out.println("Si es elegible para adoptar");
//        }else
//        {
//              System.out.println("*NO* es elegible para adoptar"); 
//        }
//********************************************************************************
        //Ejercicio 16
//        double producto1 = 1000000;
//        double producto2 = 10000000;
//        
//        double impProduc1 = producto1 * 5/100;
//        double impProduc2 = producto2 * 15/100;
//        
//        System.out.println("El impuesto de importacion para el producto valorado en " + producto1 
//        + "es de: " + impProduc1);
//          System.out.println("El impuesto de importacion para el producto valorado en " + producto2 
//        + "es de: " + impProduc2);
//********************************************************************************
        //Ejercicio 17
//        int kwhAño = 150000;
//        
//        int energiaSolar = kwhAño * 50/100;
//        int ahorro = kwhAño * 20/100;
//        
//        int eficiencia = kwhAño - (energiaSolar + ahorro);
//        
//        System.out.println("La eficiencia energetica es de: " + eficiencia);
//        
//********************************************************************************
        //Ejercicio 18
//        int ventas = 50000000;
//        int bonificacion = ventas * 10/100;
//        int excesoVentas = 100000000 - ventas;
//        int total = bonificacion + excesoVentas;
//        
//        System.out.println("La binificacion total es de: " + total);
//                
//********************************************************************************
        //Ejercicio 19
        int beneficiadas = 10000;
        int afectadas = 1000;
        double costoImplementacion = Math.pow(5, 10);
        double costoBeneficio = costoImplementacion/beneficiadas;
        double costoAfectacion = costoImplementacion/afectadas;
        double impacto = costoBeneficio * costoAfectacion;

        System.out.println("El impacto es de: " + costoImplementacion );
    }

}
