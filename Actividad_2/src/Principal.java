
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC_21
 */
public class Principal {

    public static void main(String[] args) {
        // Ejercicio 1:
        String frase = "Que maravilloso es que nadie tenga que esperar ni un "
                + "segundo para empezar a mejorar el mundo» -Ana Frank";

        String frag1 = "Que maravilloso es que nadie tenga que esperar ni un ";
        String frag2 = "segundo para empezar a mejorar el mundo» -Ana Frank";

        //51
        System.out.println("\033[30m " + frase);
        //52
        System.out.println("\033[30m " + frag1 + "\033[32mk " + frag2);
        //53
        System.out.println("\033[31m " + frase);
        //54
        System.out.println("\033[31m **********************************");
        //55
        System.out.println("\033[32m " + frase);
        //56
        System.out.println("\033[33m " + frase);
        //57   
        System.out.println("\033[34m " + frase);
        //58 
        System.out.println("\033[35m " + frase);
        //59
        System.out.println("\033[36m " + frase);
        //60
        System.out.println("\033[37m " + frase);
        //61
        System.out.println("\033[31m Que maravilloso es que" + "\033[32m nadie tenga que"
                + "\033[33m esperar ni un" + "\033[34m segundo para" + "\033[35m empezar a mejorar"
                + "\033[36m a mejorar el mundo // " + "\033[30m" + frase);

        //62        
        char letra = 'L';
        System.out.printf("El Caracter es: %c%n", letra);

        //63
        int num = 785;
        System.out.printf("Numero decimal: %d%n", num);

        //64
        double exp = 789.456;
        System.out.printf("El numero es:   %e%n", exp);

        //65
        int oc = 24;
        System.out.printf("El numero es: %o%n", oc);

        //67
        String str = "Laura Lopez";
        System.out.printf("Nombre: %s%n", str);

        //68
        int hex = 753;
        System.out.printf("El numero es: %x%n", hex);

        //69
        Date dia = new Date();
        System.out.printf("La fecha de hoy es: %tc%n", dia);

        //70
        //Datos del establecimieto
        String nombreempresa = "Artesanias Nobsa";
        String direccion = "Carrera 8 Centro";
        String celular = "3136789012";

        //Datos de la factura        
        String numFactura = "F123456";
        Date hoy = new Date();
        String fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(hoy);

        System.out.println("___________________________________________");
        System.out.println();
        System.out.println(nombreempresa);
        System.out.println(direccion);
        System.out.println(celular);
        System.out.println("___________________________________________");
        System.out.println();
        System.out.println("Fecha y Hora: " + fecha);       
        System.out.println("___________________________________________");
         System.out.println();
        System.out.println("Articulo         | Cantidad   |  Precio");
        System.out.printf("%-20s %3d %15.2f%n", "JarrOn de barro", 2,45000.00);
        System.out.printf("%-20s %3d %15.2f%n", "Tapete tejido", 1,80000.00);
        System.out.printf("%-20s %3d %15.2f%n", "Figura de madera", 3,25000.00);
        System.out.printf("%-20s %3d %15.2f%n", "Pulsera artesanal", 5,12000.00);
        System.out.println();
        
          double total = 45000.00 + 80000.00 + 25000.00 + 12000.00;
        System.out.printf("Total:                       $%,.2f%n", total);
        System.out.println("Gracias por tu compra!!");
        System.out.println("___________________________________________");
       
        
       
        

    }

}
