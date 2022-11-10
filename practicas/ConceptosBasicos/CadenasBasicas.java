package ConceptosBasicos;

import java.util.Scanner;

public class CadenasBasicas {

    public static void main(String[] args) {
        
        System.out.println(" --------------------------------------");
        System.out.println(" --------EJE 18------------------------");


        char caracter =  'f';

        String mensaje = " Esto es una cadena larga";

        System.out.println(caracter + mensaje);

        System.out.println(" --------------------------------------");
        System.out.println(" --------EJE 19------------------------");

        char char1 = 'r';
        char char2 = 'a';
        char char3 = 'm';
        char char4 = 'o';
        char char5 = 'n';

        String cadena =  "" + char1 +  char2 + char3 + char4 + char5; 

        System.out.println(cadena);


        /*
         * Leer de teclado un caracter 
         * y dos valores enteros
         * 
         * Si es la 's' entonces sumo 2 valores enteros
         * 
         * Si no es 's' muestro los caracteres 
         * con esos codigos ASCII
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Indique un caracter");
         char opcion = sc.next().charAt(0);
         System.out.println("Indique un numero");
         int numero1 = sc.nextInt();
         System.out.println("Indique otro numero");
         int numero2 = sc.nextInt();
        
         int resultadoSuma = numero1 + numero2;

         String cadenasMostradas = (char)numero1 + " - " +
                                             (char)numero2;


         System.out.println("El resultado es " + ((opcion == 's') ? resultadoSuma : cadenasMostradas));
         

         





    }
    
}
