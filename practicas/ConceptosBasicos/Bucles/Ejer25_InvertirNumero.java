package ConceptosBasicos.Bucles;

import java.util.Scanner;

public class Ejer25_InvertirNumero {
    
    public static void main(String[] args) {
        /*
         * invertir número
         */

         Scanner sc = new Scanner(System.in);

         int numero, invertido = 0, resto;

         System.out.println("Introduce un número: ");

         numero = sc.nextInt();

         if (numero < 10)
         {
            System.out.println("El numero tiene que contener 2 dígitos");
            System.exit(0);
         }
         while (numero > 0)
         {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
         }

         System.out.println("Numero invertido: " + invertido);

         sc.close();
    }
}
