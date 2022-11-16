package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class Ejer32_buscarDigPares {
    public static void main(String[] args) {
        /*
         * Escribe un programa que, dado un número entero positivo, diga cuáles son y
            cuánto suman los dígitos pares.
            Los dígitos pares se deben mostrar en orden, de
            izquierda a derecha.
         */

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número: ");

        numero = sc.nextInt();
        
        String listadoPares ="";
        int sumatorioPares = 0;
        int numeroOperativo = numero;
        while (numeroOperativo > 0)
        {
            int resto = numeroOperativo % 10;

            //Veo si es par
            if (resto % 2 == 0)
            {
                sumatorioPares += resto;
                listadoPares = resto + " " + listadoPares;
            }

            numeroOperativo =  numeroOperativo / 10;
        }

        System.out.println("Digitos pares: " + listadoPares);
        System.out.println("suma de los pares: " + sumatorioPares);
    }
}
