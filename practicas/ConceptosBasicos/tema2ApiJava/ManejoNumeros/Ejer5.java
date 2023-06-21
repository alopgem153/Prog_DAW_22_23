package ConceptosBasicos.ManejoNumeros;

import java.util.Scanner;

public class Ejer5 {

    public static void main(String[] args) {
        /*
         * Vamos a realizar un programa que pregunte por 
         * un número de segundos y nos diga en que minuto estamos.
            Por ejemplo: 50 segundos -> minuto 1
                     130 segundos -> minuto 3

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Numero de segundos?");
        int segundos = sc.nextInt();

        float minutos = segundos/60.0f;
        minutos = (int)Math.ceil(minutos);
        System.out.println("El numero de minutos es " + (minutos));
        sc.close();
    }
    
}
